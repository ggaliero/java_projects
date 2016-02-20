/**
 * 
 */

/**
 * @author Gabriele Galiero Casay
 * @version 2.0 07-01-2015
 */
public class TestStudent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			
			Student s1 = new Student("Gabriele", "Galiero", 1988);
			Student s2 = new Student("Gabriele", "Galiero", 1988, "Group 2", Schedule.EVENING);
			
			System.out.println("Student 1");
			s1.print();
			System.out.println("");
			System.out.println("Student 2");
			s2.print();
			
			System.out.println("");
			System.out.println("Now a second surname and group are added to student 1.");
			s1.addSurnames("Casay");
			s1.setGroup("Group 1", Schedule.MORNING);
			s1.print();
			
			System.out.println("");
			Student.printTotalStudents();
			
		} catch(NullStringException e) {
			System.out.println("Name, surname or group cannot be empty fields.");
			
		} catch(BirthYearException e) {
			System.out.println("Year of birth not valid.");

		}
		

	}

}
