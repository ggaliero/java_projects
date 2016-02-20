/**
 * This program reads test.txt file of characters until the end of the text, line by line, using 
 * filters. Classes used: FileReader and BufferedReader.
 * 
 * Details: Always close the file after operations. In this case closing the filter, it also
 * closes implicitly the FileReader file. When throwing the exceptions, first goes the one
 * for file not found, because it is more specific. Otherwise, IOException will always be
 * caught.
 */

/**
 * @author Gabriele Galiero Casay
 * @version 1.0 07-20-2015
 */

import java.io.*;

public class ReadFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		FileReader file;
		BufferedReader filter;
		String fileName = "test.txt";
		String line;
		
		try {
			file = new FileReader(fileName);
			filter = new BufferedReader(file);
			line = filter.readLine();
			while (line != null) {
				System.out.println(line);
				line = filter.readLine();
			}
			filter.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		} catch (IOException e) {
			System.out.println("Error when reading the file.");
		}
		

	}

}
