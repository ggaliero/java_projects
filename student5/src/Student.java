/**
 * This class it is an improvement of the v.3. of Student class. It introduces two methods
 * to write and read object information from files. Student fields are written in text files
 * as text. The class PrintWriter is used for it.
 */

/**
 * @author Gabriele Galiero Casay
 * @version 5.0 07-21-2015
 */

import java.io.*;
import java.util.Scanner;

enum Schedule {MORNING, EVENING}		// Possible student schedules

public class Student {
	
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

	public int getBirthYear() {
		
		return birthYear;
	}
	
	public int getId() {
		
		return id;
	}

	public String getGroup() {
		
		return group;
	}

	public boolean isMorningSchedule() {
		
		return schedule == Schedule.MORNING;
		
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
	
	public void store (PrintWriter output) {
		output.println(name);
		output.println(surname);
		output.println(birthYear);
		output.println(id);
		output.println(group);
		output.println(schedule);
	}
	
	public void restore (Scanner input) {
		name = input.nextLine();
		surname = input.nextLine();
		birthYear = input.nextInt();
		id = input.nextInt();
		group = input.next();
		schedule = Schedule.valueOf(input.nextLine());
	}
}


