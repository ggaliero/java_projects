/**
 * Vector of students, not ordered. The difference between this and group4 is that
 * here we define a generic method addStudents, that adds students from an array to 
 */

/**
 * @author Gabriele Galiero Casay
 * @version 8.0 07-22-2015
 */

import java.util.*;

public class Group {
	
	private String groupName;
	private ArrayList<Student> students;
	
	public Group (String groupName, int size) throws SizeException {
		if (size < 1)
			throw new SizeException("Size of the storage not valid.");
		this.groupName = groupName;
		students = new ArrayList<Student>(size);
	}
	
	public void setStudents (ArrayList<Student> list) {
		students = list;
	}
	
	public boolean isEmpty () {
		return students.isEmpty();
	}
	
	public boolean isFull () {
		return false;
	}
	
	public static <T> void add (List<T> list, T [] o) {
		for (T obj : o) {
			list.add(obj);
		}
	}
	
	public void addStudents (Student [] a) {
		add(students, a);
	}
	
	public boolean delete (Student s) {
		int pos = search(s);
		if (pos < 0)
			return false;
		students.remove(pos);
		return true;
	}
	
	public int search (Student s) {
		return students.indexOf(s);
	}
	
	public void printResumed () {
		Iterator<Student> iter = students.iterator();
		Student s;
		System.out.println(groupName + ": ");
		while(iter.hasNext()) {
			s = iter.next();
			System.out.println(s.getName() + " " + s.getSurname() +
					" (ID:" + s.getId() + ")");
		}
	}
	
	public void printExtended () {

		Iterator<Student> iter = students.iterator();
		Student s;
		System.out.println(groupName + ": ");
		while(iter.hasNext()) {
			s = iter.next();
			s.print();
		}
		
	}
	
}
