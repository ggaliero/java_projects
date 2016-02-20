/**
 * 
 */

/**
 * @author Gabriele Galiero Casay
 * @version 1.0 07-10-2015
 */
public class TestGroup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Group g = new Group ("11", 20);
		
		try {
			
			Student s1 = new Student("Gabriele","Galiero",1988);
			Student s2 = new Student("Miguel","De Miguel",1985);
			Student s3 = new Student("Adrian","De Miguel",1993);
			Student s4 = new Student("Omar","Sandoval",1988);
			Student s5 = new Student("Ana","Lopez",1990);
			
			g.addStudent(s1);
			g.addStudent(s2);
			g.addStudent(s3);
			g.addStudent(s4);
			g.addStudent(s5);
			
			g.printStudents();
			
			System.out.println("Omar drops the group\n");
			g.removeStudent(s4);
			
			g.printStudents();
			
		} catch (NullStringException e){
			System.out.println(e.getMessage());
		} catch (BirthYearException e) {
			System.out.println(e.getMessage());
		}
	}

}
