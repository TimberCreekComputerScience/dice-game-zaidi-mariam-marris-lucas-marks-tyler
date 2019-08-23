import java.util.Scanner;
public class DiceGame {

	public static void main(String[] args) {
		System.out.println("You have three dice. After rolling, you are allowed to lock in one number,\nand any dice with that number becomes locked for the next round.  You are allowed to roll the dice five  times. Enter \"1\"  to continue.");
		Scanner scan = new Scanner(System.in);
		int enter = 0;
		while(enter!=1) {
			enter = scan.nextInt();
		}
		int die1 = (int)(Math.random()*6)+1;
		int die2 = (int)(Math.random()*6)+1;
		int die3 = (int)(Math.random()*6)+1;
		
		int x = 0;
		while(x < 4 && (die1!=die2 || die2!=die3)) {
			System.out.println("Die 1: " + die1);
			System.out.println("Die 2: " + die2);
			System.out.println("Die 3: " + die3);
			System.out.println("Select the number you would like to lock, if you would like to lock no dice, enter 0");
			int dieNumber = -1;
			while(dieNumber < 0 || dieNumber > 6)
			{
				dieNumber = scan.nextInt();
				if (dieNumber < 1 || dieNumber > 6) {
					System.out.println("Please input a valid number:");
				}
			}
			if (1<=dieNumber && dieNumber<=6){
				System.out.println(dieNumber + " Locked");
			}
			if(die1 != dieNumber) {
				die1 = (int)(Math.random()*6)+1;
			}
			if(die2 != dieNumber) {
				die2 = (int)(Math.random()*6)+1;
			}
			if(die3 != dieNumber) {
				die3 = (int)(Math.random()*6)+1;
			}
			x = x + 1;
		}
		System.out.println("Die 1: " + die1);
		System.out.println("Die 2: " + die2);
		System.out.println("Die 3: " + die3);
		if (die1 == die2 && die1 == die3) {
			System.out.print("You Win!");
		} else {
			System.out.print("You Lose!");
		}
	}

}
