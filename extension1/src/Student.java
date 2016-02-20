/**
 * 
 */

/**
 * @author Gabriele Galiero Casay
 * @version 1.0 07-04-2015
 */

enum Schedule {Morning, Evening}

public class Student extends Person {
	
	private String group;
	private Schedule schedule;
	
	public Student (String name, String surname, int birthYear) {
		super(name, surname, birthYear);
	}
	
	public Student (String name, String surname, int birthYear, String group,
					Schedule schedule) {
		this(name, surname, birthYear);
		this.group = group;
		this.schedule = schedule;
		
	}
	
	public void print() {
		super.print();
		System.out.println("Group: " + group);
		System.out.println("Schedule: " + schedule);
	}
	
}
