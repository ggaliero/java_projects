/**
 * Problem 38.
 */

/**
 * @author Gabriele Galiero Casay
 * @version 1.0 07-03-2015
 */

import java.util.Scanner;

public class Fibonacci {
	
	public static int fibonacci(int num) throws NumberException {
		if (num <= 0)
			throw new NumberException("Input parameter has to be greater than zero");
		if (num <= 2) {
			return 1;
		} else {
			return fibonacci(num - 1) + fibonacci(num - 2);
		}	
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			Scanner input = new Scanner(System.in);
			System.out.print("Introduce positive integer: ");
			int num = input.nextInt();
			System.out.print("Fibonacci: " + Fibonacci.fibonacci(num));
			input.close();
		} catch (NumberException e) {
			System.out.print(e.getMessage());
		}

	}

}
