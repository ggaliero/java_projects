/**
 * 
 */

/**
 * @author Gabriele Galiero Casay
 * @version 1.0 07-04-2015
 */
public class Person {
	
	private String name;
	private String surname;
	private int birthYear;
	
	public Person (String name, String surname, int birthYear) {
		this.name = name;
		this.surname = surname;
		this.birthYear = birthYear;
	}
	
	public void print() {
		System.out.println("Name: " + name);
		System.out.println("Surname: " + surname);
		System.out.println("Year of birth: " + birthYear);
	}

}
