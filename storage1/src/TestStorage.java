/**
 * 
 */

/**
 * @author Gabriele Galiero Casay
 * @version 1.0 07-04-2015
 */

import java.io.*;

public class TestStorage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int size;
		int num;
		int elem;
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("Introduce the size of the storage: ");
			size = Integer.parseInt(input.readLine());
			Storage s = new Storage(size);
			System.out.print("Introduce the number of numbers to store: ");
			num = Integer.parseInt(input.readLine());
			if ( num <= size) {
				for(int i = 0; i < num; i++) {
					System.out.print("Integer " + (i + 1) + ": ");
					elem = Integer.parseInt(input.readLine());
					s.add(elem);
				}
				System.out.print("Storage content: ");
				s.print();
				
				System.out.print("Choose the element to delete: ");
				elem = Integer.parseInt(input.readLine());
				if (s.remove(elem)) {
					System.out.println("Deleted successfully");
				} else {
					System.out.println("Element not in the storage");
				}
				System.out.print("Storage content: ");
				s.print();
			}
		} catch (SizeException e) {
			System.out.println(e.getMessage());
		} catch (StorageFullException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println("Error when input data");
		}
	}

}
