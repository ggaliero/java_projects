/**
 * 
 */

/**
 * @author Gabriele Galiero Casay
 * @version 1.0 06-17-2015
 */

public class Triangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double base;
		double height;
		double area;
		
		base = new Double(args[0]).doubleValue();
		height = new Double(args[1]).doubleValue();
		
		/*
		 * base = Double.parseDouble(args[0]);
		 * height = Double.parseDouble(args[1]);
		 * */
		area = 0.5 * base * height;
		
		System.out.println("Base: " + base);
		System.out.println("Height: " + height);
		System.out.println("Area: " + area);

	}

}
