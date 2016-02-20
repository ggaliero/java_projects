/**
 * Problem 36
 */

/**
 * @author Gabriele Galiero Casay
 * @version 2.0 07-02-2015
 */

import java.util.Scanner;

public class Factorial {
	
	public static int factorial(int num) throws NegativeIntegerException {
		int res;
		if (num < 0)
			throw new NegativeIntegerException("Negative integers not valid.");
		if (num > 1) {
			res = num * factorial(num - 1);
		} else {
			res = 1;
		}
		return res;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
		Scanner input = new Scanner(System.in);
		System.out.print("Introduce integer: ");
		int num = input.nextInt();
		System.out.println("Factorial: " + Factorial.factorial(num));
		input.close();
		} catch (NegativeIntegerException e){
			System.out.println(e.getMessage());
		}

	}

}
