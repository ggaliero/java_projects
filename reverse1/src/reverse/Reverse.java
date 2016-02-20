/**
 * This program builds a new String which is the reverse of the original one.
 * It uses the Class String, so that every time the concatenation is executed
 * a new String is created. This could slow down the performance.
 */
package reverse;

/**
 * @author gabri
 *
 */
public class Reverse {
	
	public static String reverse(String input) {
		String ret = "";
		for(int i = 0; i < input.length(); i++) {
			ret = input.charAt(i) + ret;
		}
		return ret;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s1 = "tip";
		String s2;
		s2 = reverse(s1);
		System.out.println("Forward word: " + s1);
		System.out.println("Reverse word: " + s2);

	}

}
