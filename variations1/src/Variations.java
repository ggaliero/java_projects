/**
 * Problem 37.
 */

/**
 * @author Gabriele Galiero Casay
 * @version 1.0 07-02-2015
 */

import java.util.Scanner;

public class Variations {
	
	public static void variations(int n) {
		
		int num = (int) Math.pow(10, n);
		String str;
		int lim;
		
		for(int i = 0; i < num; i++) {
			str = Integer.toString(i);
			lim = n - str.length();
			for(int j = 0; j < lim; j++) {
				System.out.print("0");
			}
			System.out.println(i);
		}
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Introduce number of digits: ");
		int n = input.nextInt();
		variations(n);
		input.close();

	}

}
