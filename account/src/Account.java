/**
 * Problem 40
 */

/**
 * @author Gabriele Galiero Casay
 * @version 1.0 07-02-2015
 */
public class Account {
	
	private double money;
	
	public Account() {
		money = 0;
	}
	
	public double consult() {
		return money;
	}
	
	public void add(double amount) {
		money += amount;
	}
	
	public void substract(double amount) throws NotEnoughFundException {
		if (amount > money)
			throw new NotEnoughFundException("Funds available are not enough. Transaction cancelled.");
		money -= amount;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			Account a = new Account();
			System.out.println("Initial salary: " + a.consult());
			System.out.println("Payslip of 1750 euros arrived");
			a.add(1750);
			System.out.println("Current salary: " + a.consult());
			System.out.println("Bill of 360 euros for housing arrived");
			a.substract(360);
			System.out.println("Current salary: " + a.consult());
			System.out.println("Bill of 98.75 euros for TV arrived");
			a.substract(98.75);
			System.out.println("Current salary: " + a.consult());
			System.out.println("Bill of 2000 euros from a fraudulent company arrived");
			a.substract(2000);

		} catch (NotEnoughFundException e) {
			System.out.println(e.getMessage());
		}
	}

}
