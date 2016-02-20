/**
 * Problem 5. It comprises understanding of downcast.
 */

/**
 * @author Gabriele Galiero Casay
 * @version 1.0 07-01-2015
 */

import java.util.Scanner;

public class Prime {
	
	public static boolean isPrime(int num) {
		int n = (int) Math.sqrt(num);
		int i = 2;
		boolean res = true;
		
		if(num > 2) {
			
			while(i <= n && res) {
				if(num % i == 0)
					res = false;
				i++;
			}
		}
		
		return res;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int num;
		Scanner input = new Scanner(System.in);
		System.out.print("Introduce integer number: ");
		num = input.nextInt();
		System.out.print("Prime numbers in [1," + num + "]:");
		
		for(int i = 1; i <= num; i++) {
			if(isPrime(i))
				System.out.print(" " + i);
		}
		input.close();

	}

}
