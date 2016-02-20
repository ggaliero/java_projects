/**
 * 
 */

/**
 * @author Gabriele Galiero Casay
 * @version 8.0 07-21-2015
 */

import java.io.*;

public class TestGroup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String fileName = "group.dat";
		
		//First a group is created and added new students
		
		try {
			
			Group g = new Group ("Group 11", 20);
			
			Student s1 = new Student("Gabriele","Galiero",1988);
			Student s2 = new Student("Miguel","De Miguel",1985);
			Student s3 = new Student("Adrian","De Miguel",1993);
			Student s4 = new Student("Omar","Sandoval",1988);
			Student s5 = new Student("Ana","Lopez",1990);
			
			g.addStudent(s1);
			g.addStudent(s2);
			g.addStudent(s3);
			g.addStudent(s4);
			g.addStudent(s5);
			
			FileOutputStream file = new FileOutputStream (fileName);
			ObjectOutputStream output = new ObjectOutputStream (file);
			
			output.writeObject(g);
			output.close();
		
		} catch (SizeException e) {
			System.out.println(e.getMessage());
		} catch (GroupFullException e) {
			System.out.println(e.getMessage());
		} catch (NullStringException e){
			System.out.println(e.getMessage());
		} catch (BirthYearException e) {
			System.out.println(e.getMessage());
		} catch (FileNotFoundException e) {
			System.out.println("Error when creating the file");
		} catch (IOException e) {
			System.out.println("Error when writing into the file");
		}
		
		try {
			FileInputStream file = new FileInputStream(fileName);
			ObjectInputStream input = new ObjectInputStream(file);
			Group group;
			
			group = (Group) input.readObject();
			input.close();
			
			group.printResumed();
		} catch (FileNotFoundException e) {
			System.out.println("Error when accessing the file");
		} catch (IOException e) {
			System.out.println("Error when reading the file");
		} catch (ClassNotFoundException e) {		//This exception is mandatory
			System.out.println("The content of the file is not correct");
		}
		
	}

}
