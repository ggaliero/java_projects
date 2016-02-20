/**
 * 
 */

/**
 * @author Gabriele Galiero Casay
 * @version 2.0 06-17-2015
 */
public class Triangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double base;
		double height;
		double area;
		
		base = Double.valueOf(args[0]).doubleValue();
		height = Double.valueOf(args[1]).doubleValue();
		area = 0.5 * base * height;
		
		System.out.println("Base: " + base);
		System.out.println("Height: " + height);
		System.out.println("Area: " + area);

	}

}
