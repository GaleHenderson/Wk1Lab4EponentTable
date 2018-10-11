package Wk1Lab4ExponentTable;

import java.util.Scanner;

public class Wk1Lab4ExponentTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Opens a new scanner
				Scanner scan = new Scanner(System.in);

				// This initializes and declares variables for user input
				int userInt; 
				String userName;
				String userCont = "y";

				System.out.println("Hello! Please tell me your name: ");
				userName = scan.nextLine();

				while (userCont.equalsIgnoreCase("y")) {

					// This will prompt user for input and guide them if not a number
					System.out.println(userName + ", " + "please enter a whole number.");

					// This checks if input is numeric and an integer
					while (!scan.hasNextInt()) {
						System.out.println("Please enter a NUMERIC value that is NOT a decimal.");
						scan.nextLine();
					}
					
					userInt = scan.nextInt();
					
					int baseNum = 1;
					String heading1 = "Number";
					String heading2 = "Squared";
					String heading3 = "Cubed";
					String rowDivider = "=======================================";
					System.out.printf( "%-7s %15s %15s %n", heading1, heading2, heading3);
					System.out.println(rowDivider);
					
					//THIS IS THE FOR LOOP THAT WILL CALCULATE THE SQUARE OF USER INPUT
					for (baseNum = 1; baseNum <= userInt; baseNum++) {
						int numSquare = (int) Math.pow(baseNum, 2);
						int numCube = (int) Math.pow(baseNum, 3);
						
						System.out.printf( "%6d %15d %15d %n", baseNum, numSquare, numCube);
					
						}
	
					// Asking use would he/she like to enter another number
					System.out.println("Would you like to continue practicing exponents? Enter Y for yes. Otherwise, press any other key.");		
					userCont = scan.next();
				}
				
				System.out.println("Thank you! Goodbye.");
				scan.close();
		
	}

}
