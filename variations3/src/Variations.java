/**
 * Problem 37.
 */

/**
 * @author Gabriele Galiero Casay
 * @version 3.0 07-03-2015
 */

public class Variations {
	
	public static void variations(int n) throws NegativeNumberException {
		
		if(n <= 0)
			throw new NegativeNumberException("Input parameter has to be greater than zero\n");
		
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
		
		try {
			
			int n = Integer.parseInt(args[0]);
			variations(n);
			
		} catch (NegativeNumberException e) {
			System.out.print(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Missing input parameter");
		}
	}

}
