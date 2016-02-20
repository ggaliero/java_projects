/**
 * 
 */

/**
 * @author Gabriele Galiero Casay
 * @version 1.0 06-30-2015
 */

import java.util.Scanner;

enum Months {January, February, March, April, May, June, July, August, September, October,
				November, December}

public class MonthsOfYear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Months month;
		int num;
		Scanner kbd = new Scanner(System.in);
		System.out.print("Introduce the number corresponding to the month: ");
		num = kbd.nextInt();
		
		switch (num) {
			case 1:
				month = Months.January;
				break;
			case 2:
				month = Months.February;
				break;
			case 3:
				month = Months.January;
				break;
			case 4:
				month = Months.March;
				break;
			case 5:
				month = Months.April;
				break;
			case 6:
				month = Months.May;
				break;
			case 7:
				month = Months.June;
				break;
			case 8:
				month = Months.July;
				break;
			case 9:
				month = Months.August;
				break;
			case 10:
				month = Months.September;
				break;
			case 11:
				month = Months.November;
				break;
			case 12:
				month = Months.December;
				break;
			default:
				month = null;
		}
		
		kbd.close();
		
		if (month == null) {
			System.out.println("Month not valid.");
			
		} else {
			System.out.println("Corresponding month: " + month);
		}

	}

}
