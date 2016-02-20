/**
 * This class writes data into a String and reads data from Strings, using StringWrite and 
 * StringRead.
 */

/**
 * @author Gabriele Galiero Casay
 * @version 1.0 07-21-2015
 */

import java.io.*;

public class StringStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		StringWriter write;

		try {
			write = new StringWriter();
			for (char c = 'a'; c <= 'z'; c++) {
				write.write(c);
			}
			write.close();
			System.out.println(write.toString());
		} catch (IOException e) {
			System.out.println("Errors when writing");
		}
		
		String s1 = "I am the highway!";
		StringReader read;
		int c;
		
		try {
			read = new StringReader(s1);
			c = read.read();
			while (c != -1) {
				System.out.print((char) c);
				c = read.read();
			}
			read.close();
		} catch (IOException e) {
			System.out.println("Errors when reading");
		}

	}

}
