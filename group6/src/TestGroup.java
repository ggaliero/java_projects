/**
 * 
 */

/**
 * @author Gabriele Galiero Casay
 * @version 6.0 07-18-2015
 */

public class TestGroup {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int size = 10;
		boolean res;
		
		try {
			System.out.println("Maximum number of students per group: " + size);
			Group g = new Group("Group 1",size);
			
			Student s1 = new Student("Gabriele", "Galiero", 1988);
			Student s2 = new Student("Miguel", "De Miguel", 1985);
			Student s3 = new Student("Adrian", "De Miguel", 1992);
			
			g.addStudent(s1);
			g.addStudent(s2);
			g.addStudent(s3);
			
			g.printResumed();
			
			res = g.delete(s2);
			if (res) {
				System.out.println("The student was deleted successfully");
			} else {
				System.out.println("The student was not found in the group");
			}
			
			g.printResumed();
			
		} catch (SizeException e) {
			System.out.println(e.getMessage());
		} catch (BirthYearException e) {	
			System.out.println(e.getMessage());
		} catch (NullStringException e) {
			System.out.println(e.getMessage());
		}
	}

}
