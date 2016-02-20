/**
 * 
 */

/**
 * @author Gabriele Galiero Casay
 * @version 1.0 07-08-2015
 */

enum Schedule {Morning, Evening}

public class Student extends Person implements Docent {
	
	private String name;
	private String surname;
	int birthYear;
	private String group;
	private Schedule schedule;
	
	public Student (String name, String surname, int birthYear) {
		this.name = name;
		this.surname = surname;
		this.birthYear = birthYear;
	}
	
	public Student (String name, String surname, int birthYear, String group,
					Schedule schedule) {
		this(name, surname, birthYear);
		this.group = group;
		this.schedule = schedule;
		
	}
	
	public void setGroup (String group, Schedule schedule) {
		this.group = group;
		this.schedule = schedule;
	}
	
	public String getGroup () {
		return group;
	}
	
	public Schedule getSchedule () {
		return schedule;
	}
	
	public void print() {
		System.out.println("Name: " + name);
		System.out.println("Surname: " + surname);
		System.out.println("Year of birth: " + birthYear);
		if (group != null) {
			System.out.println("Group: " + group);
			System.out.println("Schedule: " + schedule);
		}
	}
	
}
