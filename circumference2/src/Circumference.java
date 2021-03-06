/**
 * Problem 4. 
 */

/**
 * @author Gabriele Galiero Casay
 * @version 2.0 07-01-2015
 */

import java.io.*;

public class Circumference {
	
	double centerX;
	double centerY;
	double radius;
	
	public Circumference(double x1, double y1, double x2, double y2, double x3, double y3) throws EqualPointsException,
						StraightenPointsException {
		
		double auxX, auxY;
		
		if(( x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x2 == x3 && y2 == y3))
			throw new EqualPointsException("Points cannot be equal.");
		
		if(y1 == y2 && y2 == y3)
			throw new StraightenPointsException("Points cannot be aligned.");
		
		if(x1 == x2) {
			if(x1 == x3)
				throw new StraightenPointsException("Points cannot be aligned.");
			
			auxX = x1;
			auxY = y1;
			x1 = x3;
			y1 = y3;
			x3 = auxX;
			y3 = auxY;
			
		}
			
		
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
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		double x1, y1, x2, y2, x3, y3;
		String line;
		
		try {
			System.out.println("Introduce three point coordinates: ");
			System.out.println("");
			System.out.println("Point 1: ");
			System.out.print("x: ");
			line = input.readLine();
			x1 = Double.parseDouble(line);
			System.out.print("y: ");
			line = input.readLine();
			y1 = Double.parseDouble(line);
			
			System.out.println("");
			System.out.println("Point 2: ");
			System.out.print("x: ");
			line = input.readLine();
			x2 = Double.parseDouble(line);
			System.out.print("y: ");
			line = input.readLine();
			y2 = Double.parseDouble(line);
			
			System.out.println("");
			System.out.println("Point 3: ");
			System.out.print("x: ");
			line = input.readLine();
			x3 = Double.parseDouble(line);
			System.out.print("y: ");
			line = input.readLine();
			y3 = Double.parseDouble(line);
			
			System.out.println("");
			System.out.println("point 1 = (" + x1 + ", " + y1 + ")");
			System.out.println("point 2 = (" + x2 + ", " + y2 + ")");
			System.out.println("point 3 = (" + x3 + ", " + y3 + ")");

			Circumference cir = new Circumference(x1, y1, x2, y2, x3, y3);
			System.out.println("");
			System.out.println("Circunferencia = " + cir);
		
		} catch (EqualPointsException e) {
			//System.out.println("Points have to be different.");
			System.out.println(e.getMessage());
		} catch (StraightenPointsException e) {
			//System.out.println("Points cannot be aligned.");
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		

	}
	
}
