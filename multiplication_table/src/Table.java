/**
 * Problem 32.
 */

/**
 * @author Gabriele Galiero Casay
 * @version 1.0
 */
public class Table {
	
	public static void printTable(int n) {
		for(int i = 1; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + n * i);
		}	
	}
	/**
	 * @param args
	 */
	public static void main (String[] args) {
		
		for(int i = 1; i < 10; i++) {
			System.out.println("Table of " + i + ":");
			Table.printTable(i);
			System.out.print("\n");
		}

	}

}
