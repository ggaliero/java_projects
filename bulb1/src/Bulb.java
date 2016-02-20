/**
 * Problem 14.
 */

/**
 * @author Gabriele Galiero Casay
 * @version 2.0 07-02-2015
 */

enum Status {On, Off}

public class Bulb {
	
	public Status status;
	
	public Bulb() {
		this.status = Status.Off;
	}
	
	public void setOn() {
		if(status == Status.Off)
			status = Status.On;
	}
	
	public void setOff() {
		if(status == Status.On)
			status = Status.Off;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Bulb bulb = new Bulb();
		System.out.println("Initial status: " + bulb.status);
		bulb.setOn();
		System.out.println("Bulb is turned on");
		System.out.println("Status: " + bulb.status);
		bulb.setOff();
		System.out.println("Bulb is turned off");
		System.out.println("Status: " + bulb.status);
		
	}

}
