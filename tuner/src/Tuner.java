/**
 * Problem 27.
 */

/**
 * @author Gabriele Galiero Casay
 * @version 1.0 07-02-2015
 */

import java.io.*;

public class Tuner {

	private double freq;
	
	public Tuner() {
		this.freq = 80;
	}
	
	public double getFreq() {
		return freq;
	}
	
	public void up() {
		if(freq >= 108.0) {
			freq = 80.0;
		} else {
			freq += 0.5;
		}
	}
	
	public void down() {
		if(freq <= 80.0) {
			freq = 108.0;
		} else {
			freq -= 0.5;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Tuner tunner = new Tuner();
		System.out.println("Tuner is frequency-configurable 80-108 MHz");
		System.out.println("Initial tuner frequency: " + tunner.getFreq());
		System.out.println("Frequency is tuned down");
		tunner.down();
		System.out.println("Tuner frequency: " + tunner.getFreq());
		System.out.println("Frequency is tuned up");
		tunner.up();
		System.out.println("Tuner frequency: " + tunner.getFreq());
		
		try {
			String line, s;
			double bandwidth;
			double step = 0.5;
			int num;
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Select up or down frequency conversion [u/d]: ");
			line = input.readLine();
			if(line.equals("u") || line.equals("U") || line.equals("d") || line.equals("D")) {
				System.out.print("Introduce the frequency shift [MHz]: ");
				s = input.readLine();
				bandwidth = Double.parseDouble(s);
				num = (int)(bandwidth / step);
				for(int i = 1; i <= num; i++) {
					if(line.equals("u") || line.equals("U")) {
						tunner.up();
					} else {
						tunner.down();
					}
				}
				System.out.println("Tuner frequency: " + tunner.getFreq());
			} else {
				System.out.println("Input parameter not valid.");
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
