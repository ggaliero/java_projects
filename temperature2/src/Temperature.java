/**
 * Problem 2. This program receives as input the temperature in Celsius degrees and converts
 * it to Fahrenheit degrees. The user input data is implemented using Scanner class.
 */

/**
 * @author Gabriele Galiero Casay
 * @version 1.0 06-16-2015
 *
 */

import java.util.Scanner;

public class Temperature {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double fDegrees;
		double cDegrees;
		
		Scanner kbd = new Scanner(System.in);		// Creates a Scanner object to input data
		System.out.print("Temperature in Celsius degrees: ");
		cDegrees = kbd.nextDouble();				// Read the double value introduced by keyboard
		fDegrees = cDegrees * 9 / 5 + 32;
		System.out.println("Temperature in Fahrenheit degrees: " + fDegrees);
		kbd.close();
	}

}
