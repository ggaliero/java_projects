/**
 * Problem 9.
 */

/**
 * @author Gabriele Galiero Casay
 * @version 1.0 07-03-2015
 */

import java.io.*;

public class TestAckermann1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int n, m;
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Ackermann function: A(m,n)");
			System.out.print("m = ");
			m = Integer.parseInt(input.readLine());
			System.out.print("n = ");
			n = Integer.parseInt(input.readLine());
			System.out.println("A(m,n) = " + Ackermann.ackermann(m, n));
		} catch (NegativeIntegerException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println("Error when reading the input data");
		}

	}

}
