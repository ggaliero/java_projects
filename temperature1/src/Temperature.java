
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
		System.out.print("Temperature in Fahrenheit degrees: ");
		fDegrees = kbd.nextDouble();				// Read the double value introduced by keyboard
		cDegrees = (fDegrees - 32) * 5 / 9;
		System.out.println("Temperature in Celsius degrees: " + cDegrees);
		kbd.close();
	}

}
