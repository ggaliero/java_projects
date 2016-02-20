/**
 * Problem 33.
 */

/**
 * @author Gabriele Galiero Casay
 * @version 1.0 07-02-2015
 */

import java.io.*;

public class Series {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double media;
		int num;
		double sum = 0;
		int max = 0;
		int count = 0;
		
		String line;
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce positive integer numbers and press enter");
		System.out.println("To show statistics introduce a negative number");
		
		try {
			do {
				
				line = input.readLine();
				num = Integer.parseInt(line);
				if (num > 0) {
					sum += num;
					count++;
					if(num > max) {
						max = num;
					}
				}
				
			} while(num > 0);
			
			media = sum / count;
			
			System.out.println("Media: " + media);
			System.out.println("Sum: " + sum);
			System.out.println("Maximun: " + max);
			
		} catch (IOException e) {
			System.out.println("Error when reading values");
		}
	}

}
