/**
 * 
 */

/**
 * @author gabri
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String str1 = "Galiero";
		  String str2 = "Garcia";
	      String str3 = "Bertran";

	      int result = str1.compareTo( str2 );
	      System.out.println(result);
		  
	      result = str2.compareTo( str3 );
	      System.out.println(result);
		 
	      result = str3.compareTo( str1 );
	      System.out.println(result);
	}

}
