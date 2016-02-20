/**
 * Problem 2. This program receives as input the temperature in Celsius degrees and converts
 * it to Fahrenheit degrees. The user input data is implemented using BufferedReader class.
 */

/**
 * @author Gabriele Galiero Casay
 * @version 2.0 07-01-2015
 */

import java.io.*;

public class Temperature {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double cDegrees;
		double fDegrees;
		String line;
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.print("Temperature in Celsius degrees: ");
			line = input.readLine();
			cDegrees = Double.parseDouble(line);
			fDegrees = cDegrees * 9 / 5 + 32;
			System.out.print("Temperature in Fahrenheit degrees: " + fDegrees);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			//e.printStackTrace();
			System.out.print("Input is not a numeric value.");
		}
		

	}

}
