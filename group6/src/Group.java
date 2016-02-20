/**
 * This class is the same as the one from group2, but it uses an ArrayList instead of an
 * array of objects. It is same as group3, but using ArrayList instead of Vectors as
 * collections. It uses the Iterator interface to print the students in the group by the id.
 */

/**
 * @author Gabriele Galiero Casay
 * @version 6.0 07-18-2015
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
	
	public boolean isEmpty () {
		return students.isEmpty();
	}
	
	public boolean isFull () {
		return false;
	}
	
	public void addStudent (Student s) {
		students.add(s);
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
