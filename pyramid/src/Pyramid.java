/**
 * Problem 28.
 */

/**
 * @author Gabriele Galiero Casay
 * @version 1.0 07-02-2015
 */

public class Pyramid {
	
	public static void printPyramid(int n) {
		String star = "*";
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 2*i + 1; j++) {
				System.out.print(star);
			}
			System.out.println("");
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int num = 10;
		printPyramid(num);

	}

}
