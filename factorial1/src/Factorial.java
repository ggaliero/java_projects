/**
 * Problem 35.
 */

/**
 * @author Gabriele Galiero Casay
 * @version 1.0 07-01-2015
 */

import java.util.Scanner;

public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Introduce the number to get its factorial: ");
		int num = input.nextInt();
		long fact = 1;
		
		if(num >= 0) {
			for(int i = 1; i <= num; i++) {
				fact *= i;
			}
			
			input.close();
			System.out.println("Factorial: " + fact);
		} else {
			System.out.println("Negative numbers are not valid.");
		}
	}

}
