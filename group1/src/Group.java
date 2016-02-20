/**
 * When adding a new student, it appends it to the end of the array of students.
 * There is no ordered data.
 */

/**
 * @author Gabriele Galiero Casay
 * @version 1.0 07-04-2015
 */
public class Group {
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
	
	public void add (Student s) throws GroupFullException {
		if (isFull())
			throw new GroupFullException("Group is full. Impossible to add student.");
		students[numStudents] = s;
		numStudents++;
	}
	
	public boolean delete (Student s) {
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
		boolean found = false;
		int i = 0;
		int res = -1;
		while (i < numStudents && !found) {
			if (students[i].equals(s)) {
				res = i;
				found = true;
			}
			i++;
		}
		return res;
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
