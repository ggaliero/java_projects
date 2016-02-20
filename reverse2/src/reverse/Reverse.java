/**
 * This program builds a new String which is the reverse of the original one.
 * It uses the Class StringBuilder, so that the String is modified and the 
 * program performs faster than using String.
 */
package reverse;

import java.lang.String;

/**
 * @author gabri
 *
 */
public class Reverse {
	
	public static StringBuilder reverse(String input) {
		StringBuilder ret = new StringBuilder("");
		for(int i = input.length() - 1; i >= 0; i--) {
			ret.append(input.charAt(i));
		}
		return ret;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s1 = "tip";
		StringBuilder s2;
		s2 = reverse(s1);
		System.out.println("Forward word: " + s1);
		System.out.println("Reverse word: " + s2);

	}

}
