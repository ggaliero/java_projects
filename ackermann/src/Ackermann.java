/**
 * Problem 9.
 */

/**
 * @author Gabriele Galiero Casay
 * @version 1.0 07-03-2015
 */

public class Ackermann {

	public static int ackermann(int m, int n) throws NegativeIntegerException {
		
		if (m < 0 || n < 0)
			throw new NegativeIntegerException("Ackermann is not defined for negative integers");
		
		if (m == 0) {
			return n + 1;
		} else if (n == 0) {
			return ackermann(m - 1, 1);
		} else {
			return ackermann(m - 1, ackermann(m, n - 1));
		}
	}

}
