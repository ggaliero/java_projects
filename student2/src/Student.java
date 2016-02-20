/**
 * This class it is an improvement of the v.1. of Student class. It introduces the use
 * of this reference also in the case of methods. In addition, exceptions are declared
 * in the header of methods and constructors. Eventually, constructors invoke each other
 * using this() and also including same exceptions in the headers.
 */

/**
 * @author Gabriele Galiero Casay
 * @version 2.0 06-22-2015
 */

enum Schedule {MORNING, EVENING}

public class Student {
	
	String name;
	String surname;
	int birthYear;
	String group;
	Schedule schedule;
	
	/**
	 * @param name
	 * @param surname
	 * @param birthYear
	 */
	public Student(String name, String surname, int birthYear) throws NullStringException,
				BirthYearException {
		
		if (name == null || surname == null)
			throw new NullStringException("Name or surname fields not valid.");
		
		if (birthYear < 1900)
			throw new BirthYearException("Year of bith not valid.");
			
		this.name = name;
		this.surname = surname;
		this.birthYear = birthYear;
		
	}
	
	/**
	 * @param name
	 * @param surname
	 * @param birthYear
	 * @param group
	 * @param schedule
	 */
	public Student(String name, String surname, int birthYear, String group, Schedule schedule) throws NullStringException,
				BirthYearException {
		
		this(name, surname, birthYear);
		
		if( group == null ) 
			throw new NullStringException("Group not valid.");
		
		this.group = group;
		this.schedule = schedule;
		
	}
	
	/**
	 * @param old
	 */
	public Student (Student old) throws NullStringException, BirthYearException {
		
		this(old.name, old.surname, old.birthYear);
		
	}

	public int getBirthYear() {
		
		return birthYear;
	}

	public String getGroup() {
		
		return group;
	}

	public boolean isMorningSchedule() {
		if (group != null) {
			return schedule == Schedule.MORNING;
		} else {
			return false;
		}
	}

	public void addSurnames(String ... newSurnames) {
		
		for(String sur : newSurnames) {
			
			surname += " " + sur;
			
		}
		
	}
	
	public void setGroup(String group, Schedule schedule) throws NullStringException {
		
		if (group == null)
			throw new NullStringException("Group not valid.");
		
		this.group = group;
		this.schedule = schedule;
		
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


