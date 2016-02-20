/**
 * 
 */

/**
 * @author Gabriele Galiero Casay
 * @version 1.0 07-04-2015
 */

public class TestGroup {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int size = 5;
		boolean res;
		
		try {
			System.out.println("Maximum number of students per group: " + size);
			Group g = new Group("Group 1",size);
			
			Student s1 = new Student("Gabriele", "Galiero", 1988);
			Student s2 = new Student("Miguel", "de Miguel", 1985);
			Student s3 = new Student("Adrian", "de Miguel", 1992);
			
			g.add(s1);
			g.add(s2);
			g.add(s3);
			
			//g.printResumed();
			g.printExtended();
			
			res = g.delete(s2);
			if (res) {
				System.out.println("The student was deleted successfully");
			} else {
				System.out.println("The student was not found in the group");
			}
			
			//g.printResumed();
			g.printExtended();
			
		} catch (SizeException e) {
			System.out.println(e.getMessage());
		} catch (BirthYearException e) {	
			System.out.println(e.getMessage());
		} catch (NullStringException e) {
			System.out.println(e.getMessage());
		} catch (GroupFullException e) {
			System.out.println(e.getMessage());
		}
	}

}
