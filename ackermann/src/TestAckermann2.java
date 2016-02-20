/**
 * Problem 9.
 */

/**
 * @author Gabriele Galiero Casay
 * @version 1.0 07-03-2015
 */

public class TestAckermann2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			System.out.println("Ackermann function: A(m,n)");
			System.out.println("A(0,0) = " + Ackermann.ackermann(0,0));
			System.out.println("A(1,0) = " + Ackermann.ackermann(1,0));
			System.out.println("A(1,1) = " + Ackermann.ackermann(1,1));
			System.out.println("A(2,2) = " + Ackermann.ackermann(2,2));
			System.out.println("A(3,3) = " + Ackermann.ackermann(3,3));
			System.out.println("A(-1,0) = " + Ackermann.ackermann(-1,0));
		} catch (NegativeIntegerException e) {
			System.out.println("Enteros negativos no validos");
		}
	}


}
