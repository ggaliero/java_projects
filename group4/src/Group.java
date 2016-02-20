/**
 * This class represents a group of students. In this case arrays are not used, but a vector
 * of students, from class Vector. In addition, in the class TestGroup the interface Iterator
 * is used to go through all elements of a collection.
 * Students ordered by surname
 */

/**
 * @author Gabriele Galiero Casay
 * @version 4.0 07-09-2015
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
	 //Divide this method into two addStudent and searchAdd
	public void addStudent (Student s) {
		Iterator<Student> it = students();
		Student aux;
		boolean found = false;
		int pos = -1;
		
		if (isEmpty()) {
			students.addElement(s);
		} else {
			while( it.hasNext() && !found) {
				aux = (Student) it.next();
				if(s.getSurname().compareTo(aux.getSurname()) < 0) {
					found = true;
					pos = students.indexOf(aux);
					//System.out.println(pos);
				}
			}
			
			if (!found) {
				students.addElement(s);
			} else {
		
				Student aux2;
				for (int i = students.size() - 1; i >= pos; i--) {
					aux2 = (Student) students.elementAt(i);
					
					if (i == students.size() - 1) {
						students.addElement(aux2);
					} else {
						students.add(i + 1, aux2);
					}
					students.remove(i);
				}
				students.add(pos, s);
			}
		}
	}
	
	public boolean removeStudent (Student s) {
		int pos = search(s);
		if (pos < 0)
			return false;
		students.removeElementAt(pos);
		return true;
	}
	
	/*It can also be used indexOf method as in group6*/
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
