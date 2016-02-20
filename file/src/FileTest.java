/**
 * 
 */

/**
 * @author Gabriele Galiero Casay
 * @version 1.0 07-15-2015
 */

import java.io.*;

public class FileTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String fileName = "test.txt";
		FileWriter file1;
		
		try {
			file1 = new FileWriter(fileName);
			for (char c = 'a'; c <= 'z'; c++) {
				file1.write(c);
			}
			file1.close();
		} catch (IOException e) {
			System.out.println("Impossible to open the file to write");
		}
		
		FileReader file2;
		int c;
		try {
			file2 = new FileReader(fileName);
			do {
				c = file2.read();
				System.out.print((char) c);
			} while (c != -1);
			file2.close();
		} catch (IOException e) {
			System.out.println("Impossible to open the file to read");
		}

	}

}
