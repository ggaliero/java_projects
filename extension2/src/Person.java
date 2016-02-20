/**
 * 
 */

/**
 * @author Gabriele Galiero Casay
 * @version 2.0 07-04-2015
 */
public class Person {
	
	private String name;
	private String surname;
	private int birthYear;
	
	public Person (String name, String surname) throws NullStringException {
		if (name == null || surname == null)
			throw new NullStringException("Name or surname fields not valid");
		this.name = name;
		this.surname = surname;
	}
	
	public Person (String name, String surname, int birthYear) throws NullStringException,
					BirthYearException {
		this(name, surname);
		if (birthYear < 0)
			throw new BirthYearException("The yearof birth not valid");
		setBirthYear(birthYear);
	}
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return name;
	}
	
	public int getBirthYear() {
		return birthYear;
	}
	
	public void addSurnames(String ... newSurnames) {
		for(String sur : newSurnames) {
			surname += " " + sur;
		}
	}
	
	protected void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	public void print() {
		System.out.println("Name: " + name);
		System.out.println("Surname: " + surname);
		System.out.println("Year of birth: " + birthYear);
	}

}
