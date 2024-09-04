package hilo;

import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		Scanner scanner = new java.util.Scanner(System.in);


			while (true) {
			double randomNum = Math.floor(Math.random() * 20 + 1);
			boolean hasWon = false;

			System.out.println("Please guess a random number between 1 and 20: ");
			double userNum = scanner.nextDouble();

			if (userNum == randomNum) {
				System.out.println("You win! These numbers are equal.");
				hasWon = true;
			} else if (userNum < randomNum) {
				System.out.println("Incorrect. Too Low! ");
			} else if (userNum > randomNum) {
				System.out.println("Incorrect. Too High!");

			}

			for (int i = 1; i <= 4; i++) {
                userNum = scanner.nextDouble();
                if (userNum == randomNum) {
    				System.out.println("You win! These numbers are equal.");
    				hasWon = true;
    			} else if (userNum < randomNum) {
    				System.out.println("Incorrect. Too Low!");
    			} else if (userNum > randomNum) {
    				System.out.println("Incorrect. Too High!" );

    			}
			}
			
			
			if(!hasWon) {
				System.out.println("Sorry! You have missed this round. The correct answer was: "  + randomNum + "\n");
			}
			
			System.out.println("Would you like to play again?");
			String userChoice = scanner.next();
			
			if (userChoice.equals("yes")) {
				continue;
			} else {
				System.out.println("Thanks for playing. Goodbye");
				break;
			}
			
			
		}


		
	}

}
