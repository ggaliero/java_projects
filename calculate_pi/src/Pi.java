/**
 * Problem 34.
 */

/**
 * @author Gabriele Galiero Casay
 * @version 1.0 07-03-2015
 */
public class Pi {
	
	public static double calculatePi (double p) {
		int n = 0;
		double res = 0;
		double lim = Math.pow(10, -(p + 1));
		double a;
		
		do {
			a = Math.pow(-1, n) / (2 * n + 1);
			res += a;
			n++;
		} while (Math.abs(a) >= lim);
		
		return 4 * res;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
		double p = Double.parseDouble(args[0]);
		System.out.println("Pi calculation: " + Pi.calculatePi(p));

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Missing input parameter");
		}
	}

}
