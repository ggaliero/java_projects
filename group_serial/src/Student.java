/**
 * This class it is an improvement of the v.2. of Student class. It introduces the use
 * of class elements and private access for object fields.
 */

/**
 * @author Gabriele Galiero Casay
 * @version 8.0 07-22-2015
 */

import java.io.Serializable;

enum Schedule {MORNING, EVENING}		// Possible student schedules

public class Student implements Serializable {
	
	/**
	 * Generated serial
	 */
	private static final long serialVersionUID = 5844820916660073253L;

	private static int numStudents = 0;
	
	private String name;			// Name of the student
	private String surname;			// Surname of the student
	private int birthYear;			// Year of birth
	private int id;					// Identification number
	private String group;			// Group of the student
	private Schedule schedule;		// Schedule of the student
	
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
		
		numStudents++;
		this.id = numStudents;
		
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
		setGroup(group, schedule);
		
	}
	
	/**
	 * @param old
	 */
	public Student (Student old) throws NullStringException, BirthYearException {
		
		this(old.name, old.surname, old.birthYear);
		
	}
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public int getBirthYear() {
		
		return birthYear;
	}
	
	public int getId () {
		return id;
	}
	public String getGroup() {
		
		return group;
	}

	public boolean isMorningSchedule() {
		
		return schedule == Schedule.MORNING;
		
	}
	
	public boolean equals(Student s) {
		if(s == null)
			return false;
		return id == s.id;
	}

	public void addSurnames(String ... newSurnames) {
		
		for(String sur : newSurnames) {
			
			surname += " " + sur;
			
		}
		
	}
	
	public void setGroup(String group, Schedule schedule) throws NullStringException {
		
		if (group == null || group.length() == 0)
			throw new NullStringException("Group not valid.");
		
		this.group = group;
		this.schedule = schedule;
		
	}
	
	public static void printTotalStudents() {
		
		System.out.println("The number of enrolled students is: " + numStudents);
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


