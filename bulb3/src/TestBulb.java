/**
 * Problem 29.
 */

/**
 * @author Gabriele Galiero Casay
 * @version 1.0 07-02-2015
 */
public class TestBulb {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Bulb bulb = new Bulb();
		System.out.println("General switcher is turned on");
		System.out.println("One bulb is created");
		if(bulb.isOn()) {
			System.out.println("Status: On");
		} else {
			System.out.println("Status: Off");
		}
		
		System.out.println("The bulb is turned on");
		bulb.individualOn();
		
		if(bulb.isOn()) {
			System.out.println("Status: On");
		} else {
			System.out.println("Status: Off");
		}
		
		System.out.println("General switcher is turned off");
		Bulb.generalOff();
		if(bulb.isOn()) {
			System.out.println("Status: On");
		} else {
			System.out.println("Status: Off");
		}
		
		System.out.println("General switcher is turned on");
		Bulb.generalOn();
		System.out.println("The bulb is turned off");
		bulb.individualOff();
		
		if(bulb.isOn()) {
			System.out.println("Status: On");
		} else {
			System.out.println("Status: Off");
		}
	}

}
