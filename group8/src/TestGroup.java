/**
 * 
 */

/**
 * @author Gabriele Galiero Casay
 * @version 1.0 07-10-2015
 */

import java.io.*;
import java.util.ArrayList;

public class TestGroup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		
		try {
			
			FileInputStream file = new FileInputStream("data.dat");
			ObjectInputStream input = new ObjectInputStream(file);
			
			Group g = new Group ("Group 11", 5);
			Student array [] = (Student []) input.readObject();
			input.close();
			System.out.println("ja");
			ArrayList<Student> list = new ArrayList<Student> ();
			Group.add(list, array);
			g.setStudents(list);
			
			g.printResumed();
			
		} catch (SizeException e) {
			System.out.println(e.getMessage());
		} catch (FileNotFoundException e) {
			System.out.println("Error when creating the file");
		} catch (IOException e) {
			System.out.println("Error when reading the file");
		} catch (ClassNotFoundException e) {
			System.out.println("File content erroneous");
		}
	}

}
