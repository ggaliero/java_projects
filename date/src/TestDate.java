/**
 * 
 */

/**
 * @author Gabriele Galiero Casay
 * @version 1.0
 */
public class TestDate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Date d1 = new Date(28, Month.February, 2011);
		System.out.println("Current date: " + d1.toString());
		d1.nextDay();
		System.out.println("Following day date: " + d1.toString());

	}

}
