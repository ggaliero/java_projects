/**
 * Problem 29.
 */

/**
 * @author Gabriele Galiero Casay
 * @version 1.0 07-02-2015
 */

enum Status {On, Off}

public class Bulb {
	
	private static Status genSwitcher = Status.On;
	private Status indSwitcher;
	
	public Bulb() {
		indSwitcher = Status.Off;
	}
	
	public static void generalOn() {
		if(genSwitcher == Status.Off) {
			genSwitcher = Status.On;
		}
	}
	
	public static void generalOff() {
		if(genSwitcher == Status.On) {
			genSwitcher = Status.Off;
		}
	}
	
	public boolean isOn() {
		return (indSwitcher == Status.On) && (genSwitcher == Status.On);
	}
	
	public void individualOn() {
		if(indSwitcher == Status.Off) {
			indSwitcher = Status.On;
		}
	}
	
	public void individualOff() {
		if(indSwitcher == Status.On) {
			indSwitcher = Status.Off;
		}
	}
	
}
