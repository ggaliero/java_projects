/**
 * Ordered by surname
 */

/**
 * @author Gabriele Galiero Casay
 * @version 8.0 07-21-2015
 */

import java.io.Serializable;

public class Group implements Serializable {
	/**
	 * Serial number
	 */
	private static final long serialVersionUID = -5012086216406932337L;
	private String groupName;
	private Student [] students;
	private int numStudents;
	
	public Group (String groupName, int size) throws SizeException {
		if (size < 1)
			throw new SizeException("The size has to be greater than zero");
		this.groupName = groupName;
		students = new Student [size];
		numStudents = 0;
	}
	
	public boolean isEmpty () {
		return numStudents == 0;
	}
	
	public boolean isFull () {
		return numStudents == students.length;
	}
	
	public void addStudent (Student s) throws GroupFullException {
		if (isFull())
			throw new GroupFullException("Group is full. Impossible to add student.");
		
		int i = 0;
		while( i < numStudents && s.getSurname().compareTo(students[i].getSurname()) > 0) {
			i++;
		}
		
		for (int j = numStudents - 1; j >= i; j--) {
			students[j + 1] = students[j];
		}
		
		students[i] = s;
		numStudents++;
	}
	
	public boolean deleteStudent (Student s) {
		int pos = search(s);
		if (pos < 0)
			return false;
		for (int i = pos; i < numStudents - 1; i++) {
			students[i] = students[i + 1];
		}
		numStudents--;
		return true;
	}
	
	public int search (Student s) {
		int i = 0;
		int lim = numStudents - 1;
		int middle;
		int comp;
		
		while(i <= lim) {
			middle = (i + lim) / 2;
			comp = students[middle].getSurname().compareTo(s.getSurname());
			if (comp < 0)
				i = middle + 1;
			else if (comp > 0)
				lim = middle - 1;
			else
				return middle;
		}
		return -1;
	}
	
	public void printResumed() {
		System.out.println(groupName + ": ");
		for (int i = 0; i < numStudents; i++) {
			System.out.println(students[i].getName() + " " + students[i].getSurname() +
								" (ID:" + students[i].getId() + ")");
		}
	}
	
	public void printExtended () {
		System.out.println(groupName + ": ");
		for (int i = 0; i < numStudents; i++) {
			students[i].print();
		}
	}
}
