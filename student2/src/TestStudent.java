/**
 * 
 */

/**
 * @author Gabriele Galiero Casay
 * @version 1.0 07-01-2015
 */
public class TestStudent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			
			Student s1 = new Student("Gabriele", "Galiero", 1988);
			Student s2 = new Student(s1);
			
			System.out.println("Student data");
			System.out.println("");
			s1.print();
			System.out.println("");
			System.out.println("Now a second surname and group are added.");
			s1.addSurnames("Casay");
			s1.setGroup("Group 1", Schedule.MORNING);
			s1.print();
			
			s2.setGroup(null,  Schedule.EVENING);
			
		} catch(NullStringException e) {
			System.out.println(e.getMessage());
			
		} catch(BirthYearException e) {
			System.out.println(e.getMessage());

		}
		

	}

}
