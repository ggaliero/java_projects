/**
 * 
 */

/**
 * @author Gabriele Galiero Casay
 * @version 1.0 06-18-2015
 */

enum Schedule {MORNING, EVENING}	// Possible student schedules

public class Student {

	String name;		// Name of the student
	String surname;		// Surname of the student
	int birthYear;		// Year of birth
	String group;		// Group of the student
	Schedule schedule;	// Schedule of the student
	
	
	/**
	 * @param name
	 * @param surname
	 * @param birthYear
	 */
	public Student(String name, String surname, int birthYear) {
		
		this.name = name;
		this.surname = surname;
		this.birthYear = birthYear;
	}
	
	public int getBirthYear() {
		
		return birthYear;
	}
	
	public String getGroup() {
		
		return group;
	}
	
	public boolean isMorningSchedule() {
		
		return schedule == Schedule.MORNING;
	}
	
	public void setSurnames(String ... newSurnames) {
		
		for(String sur : newSurnames) {
			
			surname += sur + " ";
			
		}
		
	}
	
	public void setGroup(String newGroup, Schedule newSchedule) {
		
		group = newGroup;
		schedule = newSchedule;
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
