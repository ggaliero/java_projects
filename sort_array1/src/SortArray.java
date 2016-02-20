/**
 * Sorted by exchange
 */

/**
 * @author Gabriele Galiero Casay
 * @version 1.0 07-28-2015
 */
public class SortArray {

	public static void sort (int [] table) {
		int len = table.length;
		int aux;
		for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j < len; j++) {
				if (table[j] < table[i]) {
					aux = table[i];
					table[i] = table[j];
					table[j] = aux;
				}
			}
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int [] num = new int [5];
		num[0] = 2;
		num[1] = 5;
		num[2] = 1;
		num[3] = 4;
		num[4] = 0;
		
		System.out.println("Numbers: ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println("");
		
		SortArray.sort(num);
		
		System.out.println("Sorted numbers: ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.print(" ");
	}

}
