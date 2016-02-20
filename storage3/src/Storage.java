import java.util.Arrays;

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
		//Arrays.sort(data);
		
	}
	
	public boolean delete (int num) {
		
		int pos  = Arrays.binarySearch(data, 0, numData - 1,num);
		if (pos < 0)
			return false;
		
		for (int i = pos; i < numData - 1; i++) {
			data[i] = data[i + 1];
		}
		numData--;
		
		return true;
	}
	
	public void print () {
		for (int i = 0; i < numData; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println("");
	}
	
}
