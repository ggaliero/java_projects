/**
 * 
 */

/**
 * @author Gabriele Galiero Casay
 * @version 2.0 07-04-2015
 */

import java.util.Calendar;

enum Schedule {Morning, Evening}

public class Student extends Person {
	
	private static int numStudents = 0;
	
	private int id;
	private String group;
	private Schedule schedule;
	
	public Student (String name, String surname, int birthYear) throws NullStringException,
					BirthYearException {
		super(name, surname);
		int year = Calendar.getInstance().get(Calendar.YEAR);
		if (year - birthYear < 18) 
			throw new BirthYearException("Students must be at least 18 years old");
		setBirthYear(birthYear);
		
		numStudents++;
		this.id = numStudents;
		
	}
	
	public Student (String name, String surname, int birthYear, String group,
					Schedule schedule) throws NullStringException, BirthYearException {
		this(name, surname, birthYear);
		setGroup(group, schedule);
		
	}
	
	/*Another option would be to declare name, surname and birthYear as protected*/
	public Student (Student s) throws NullStringException, BirthYearException {
		this(s.getName(), s.getSurname(), s.getBirthYear());
	}
	
	public String getGroup() {
		
		return group;
	}
	
	public Schedule getSchedule() {
		
		return schedule;
	}
	
	public void setGroup(String group, Schedule schedule) throws NullStringException {
		
		if (group == null || group.length() == 0)
			throw new NullStringException("Group not valid.");
		
		this.group = group;
		this.schedule = schedule;
		
	}
	
	public boolean isMorningSchedule() {
		return schedule == Schedule.Morning;
	}
	
	public static void printTotalStudents() {
		
		System.out.println("The number of enrolled students is: " + numStudents);
	}
	
	public void print() {
		super.print();
		System.out.println("ID: " + id);
		if (group != null) {
			System.out.println("Group: " + group);
			System.out.println("Schedule: " + schedule);
		}
	}
}
