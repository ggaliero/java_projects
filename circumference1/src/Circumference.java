/**
 * Problem 3. 
 */

/**
 * @author Gabriele Galiero Casay
 * @version 1.0 07-01-2015
 */

public class Circumference {
	
	double centerX;
	double centerY;
	double radius;
	
	public Circumference(double x1, double y1, double x2, double y2, double x3, double y3) {
		
		double a = 2 * (x2 - x1);
		double b = 2 * (y2 - y1);
		double c = x1 * x1 + y1 * y1 - x2 * x2 - y2 * y2;
		double d = 2 * (x3 - x1);
		double e = 2 * (y3 - y1);
		double f = x1 * x1 + y1 * y1 - x3 * x3 - y3 * y3;
		
		this.centerY = (f * a - c * d)/(b * d - e * a);
	    this.centerX =  - b/a * centerY - c/a;
	    this.radius = Math.sqrt((x1 - centerX) * (x1 - centerX) + (y1 - centerY) * (y1 - centerY));
	
	}
	
	public String toString() {
		return "<(" + centerX + "," + centerY + ")," + radius + ">";
	}
	
	public static void main(String args[]) {
		double x1 = 9, y1 = 0,
			   x2 = 2, y2 = -7,
			   x3 = -3, y3 = 5;

		System.out.println(" point 1 = (" + x1 + ", " + y1 + ")");
		System.out.println(" point 2 = (" + x2 + ", " + y2 + ")");
		System.out.println(" point 3 = (" + x3 + ", " + y3 + ")");

		Circumference cir = new Circumference(x1, y1, x2, y2, x3, y3);
		System.out.println(" Circunferencia = " + cir);

	}
	
}
