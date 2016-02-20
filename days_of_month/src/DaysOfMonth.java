/**
 * 
 */

/**
 * @author Gabriele Galiero Casay
 * @version 1.0 06-30-2015
 */

import java.util.Scanner;

enum Month {January, February, March, April, May, June, July, August, September, October,
			November, December}

public class DaysOfMonth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Month month;
		int numMonth;
		int days;
		Scanner kbd = new Scanner(System.in);
		
		System.out.print("Introduce month number: ");
		numMonth = kbd.nextInt();
		kbd.close();
		
		if (numMonth >= 1 && numMonth <= 12) {
			
			month = Month.values()[numMonth - 1];
			
			switch (month) {
				case April:
				case June:
				case September:
				case November:
					days = 30;
					break;
				case February:
					days = 28;
					break;
				default:
					days = 31;
			}
			
			System.out.println("Days of the month of " + month + ": " + days);
			
		} else {
			
			System.out.println("Month not valid.");
		}
		
		
		
	}

}
