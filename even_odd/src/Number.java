/**
 * Problem 31.
 */

/**
 * @author Gabriele Galiero Casay
 * @version 1.0 07-02-2015
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Number {
	
	public static boolean isEven(int num) {
		return num % 2 == 0;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			Scanner input = new Scanner(System.in);
			System.out.print("Introduce an integer number: ");
			int num = (int)input.nextInt();
			
			if(isEven(num)) {
				System.out.print("Even number");
			} else {
				System.out.print("Odd number");
			}
			input.close();
		} catch (InputMismatchException e) {
			System.out.println("The input was not an integer");
		}
	}

}
