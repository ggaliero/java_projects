/**
 * 
 */

/**
 * @author Gabriele Galiero Casay
 * @version 2.0 07-04-2015
 */
public class Table {

	public static void main(String[] args) {
		
		int table [][] = new int [4][];
		
		for (int i = 0; i < table.length; i++) {
			table [i] = new int [i + 2];
		}
		
		for (int i = 0; i < table.length; i++) {
			for(int j = 0; j < table[i].length; j++) {
				table [i][j] = i + j;
			}
		}
		
		for (int [] row : table) {
			for(int n : row) {
				System.out.print(n + " ");
			}
			System.out.println();
		}

	}

}
