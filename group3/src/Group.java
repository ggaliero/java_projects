
/**
 * This class represents a group of students. In this case arrays are not used, but a vector
 * of students, from class Vector. In addition, in the class TestGroup the interface Iterator
 * is used to go through all elements of a collection.
 */

/**
 * @author Gabriele Galiero Casay
 * @version 3.0 07-09-2015
 */

import java.util.Iterator;
import java.util.Vector;

public class Group {
	
	private String groupName;
	private Vector <Student> students;
	
	public Group (String groupName, int numStudents) {
		this.groupName = groupName;
		students = new Vector<Student> (numStudents); //Initial capacity
	}
	
	public Iterator<Student> students () {
		return students.iterator();
	}
	
	/*This method is redundant because Vector has
	 * isEmpty() method, which returns true if the
	 * Vector has no elements and vice versa*/
	public boolean isEmpty () {
		return students.size() == 0;
	}
	
	public void addStudent (Student s) {
		students.add(s);
	}
	
	public boolean removeStudent (Student s) {
		int pos = search(s);
		if (pos < 0)
			return false;
		students.removeElementAt(pos);
		return true;
	}
	
	public int search (Student s) {
		Student aux;
		for (int i = 0; i < students.size(); i++) {
			aux = students.elementAt(i);
			if (aux.equals(s))
				return i;
		}
		return -1;
	}
	
	public void printStudents () {
		Iterator<Student> it = students();
		System.out.println("Group: " + groupName);
		System.out.println("");
		if (students.isEmpty())
			System.out.println("There are no students in this group.");
		while (it.hasNext()) {
			Student s = (Student) it.next();
			s.print();
		}
	}

}
