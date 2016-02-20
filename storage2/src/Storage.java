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
		int pos = 0;
		while (pos < numData && num > data[pos]) {
			pos++;
		}
		
		for (int i = numData - 1; i >= pos ; i--) {
			data [i + 1] = data [i];
		}
		
		data[pos] = num;
		numData++;
		
	}
	
	public boolean delete (int num) {
		
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
		int i = 0;
		int lim = numData - 1;
		int middle;
		int sub;
		
		while(i <= lim) {
			middle = (i + lim) / 2;
			sub = num - data[middle];
			if (sub < 0)
				i = middle + 1;
			else if (sub > 0)
				lim = middle - 1;
			else
				return middle;
		}
		return -1;
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
