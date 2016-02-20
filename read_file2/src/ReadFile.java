/**
 * This class performs the same task as read_file1, but it uses binary data for reading.
 * Classes used: FileInputStream, InputStreamReader, BufferedReader.
 * A binary file is opened with FileInputStream, then the stream is converted into a stream
 * of characters using InputStreamReader and finally the stream is filtered to read line by
 * line using BufferedReader.
 */

/**
 * @author Gabriele Galiero Casay
 * @version 2.0 07-20-2015
 */

import java.io.*;

public class ReadFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		FileInputStream file;
		InputStreamReader conversor;
		BufferedReader filter;
		
		String fileName = "test.txt";
		String line;
		
		try {
			file = new FileInputStream(fileName);
			conversor = new InputStreamReader(file);
			filter = new BufferedReader(conversor);
			
			line = filter.readLine();
			while(line != null) {
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
