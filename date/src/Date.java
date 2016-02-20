/**
 * 
 */

/**
 * @author gabri
 *
 */

enum Month {January, February, March, April, May, June, July, August, September, October,
			November, December}

public class Date {
	
	private int day;
	private Month month;
	private int year;
	
	public Date(int day, Month month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public boolean isLeap(int year) {
		
		return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
			
	}
	
	public void nextDay() {
		
		int numDays;
		
		switch(month) {
			case April:
			case June:
			case September:
			case November:
				numDays = 30;
				break;
			case February:
				if (isLeap(year)) {
					numDays = 29;
				} else {
					numDays = 28;
				}
				break;
			default:
				numDays = 30;
		}
		
		if (day >= numDays) {
			day = 1;
			if(month.equals(Month.December)) {
				year++;
				month = Month.January;
			} else {
				month = Month.values()[month.ordinal() + 1];
			}
		} else {
			day ++;
		}
	}
	
	public String toString() {
		return month + "-" + day + "-" + year; 
	}
	
}
