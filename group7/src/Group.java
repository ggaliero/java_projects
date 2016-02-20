/**
 * Same as group6 but the students are added in order based in the surname.
 * Nice idea to split the method addStudent in group6 and make searchAdd and add like here.
 */

/**
 * @author Gabriele Galiero Casay
 * @version 7.0 07-18-2015
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
		int pos = searchAdd(s);
		if (pos < 0) {
			students.add(s);
		} else {
			Student aux;
			for (int i = students.size() - 1; i >= pos; i--) {
				aux = (Student) students.get(i);
				
				if (i == students.size() - 1) {
					students.add(aux);
				} else {
					students.add(i + 1, aux);
				}
				students.remove(i);
			}
			students.add(pos, s);
		}
		
	}
	
	public boolean delete (Student s) {
		int pos = searchDelete(s);
		if (pos < 0)
			return false;
		students.remove(pos);
		return true;
	}
	
	public int searchDelete (Student s) {
		return students.indexOf(s);
	}
	
	
	public int searchAdd (Student s) {
		int pos = -1;
		boolean found = false;
		Iterator<Student> iter = students.iterator();
		Student aux;
		while (iter.hasNext() && !found) {
			aux = (Student) iter.next();
			if(s.getSurname().compareTo(aux.getSurname()) < 0) {
				found = true;
				pos = students.indexOf(aux);
				//System.out.println(pos);
			}
		}
		return pos;
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
