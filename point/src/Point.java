/**
 * Problem 13.
 */

/**
 * @author Gabriele Galiero Casay
 * @version 1.0 07-02-2015
 */
public class Point {
	
	private double x;
	private double y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double distance (Point p) {
		
		double distance = Math.sqrt(Math.pow(x - p.getX(),2) + Math.pow(y - p.getY(),2));
		return distance;
		
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	public static void main(String args[]) {
		
		Point p1 = new Point(100.0, 200.0);
		Point p2 = new Point(400.0, 800.0);
		System.out.println("Point 1: " + p1);
		System.out.println("Point 2: " + p2);
		System.out.println("Distance: " + p1.distance(p2));
		
	}

}
