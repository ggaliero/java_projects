/**
 * 
 */

/**
 * @author Gabriele Galiero Casay
 * @version 1.0 07-04-2015
 */
public class Storage {
	
	private int data [];
	private int numData;
	
	public Storage (int size) throws SizeException {
		if (size < 1)
			throw new SizeException("The storage dimension cannot be less or equal to zero");
		data = new int [size];
		numData = 0;
	}
	
	public boolean isEmpty () {
		return numData == 0;
	}
	
	public boolean isFull () {
		return numData == data.length;
	}
	
	public void add (int num) throws StorageFullException {
		if (isFull())
			throw new StorageFullException("Storage full. Not possible to add elements.");
		data [numData] = num;
		numData++;
	}
	
	public boolean remove (int num) {
		
		int pos  = search(num);
		if (pos < 0)
			return false;
		
		for (int i = pos; i < numData - 1; i++) {
			data[i] = data[i + 1];
		}
		numData--;
		
		return true;
	}
	
	public int search (int num) {
		boolean found = false;
		int res = -1;
		int i = 0;
		while (i < numData && !found) {
			if (data[i] == num) {
				res = i;
				found = true;
			}
			i++;
		}
		return res;
	}
	
	/*public int search (int num) {
		int res = -1;
		for (int i = 0; i < numData; i+++) {
			if (data[i] == num) {
				return i;
			}
		}
		return -1;
	}*/
	
	public void print () {
		for (int i = 0; i < numData; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println("");
	}
	
}
