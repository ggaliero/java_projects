/**
 * Same as storage1 project, but here we define the intern class EnumerateElements which
 * implements Iterator interface and iterates to go through the storage elements. 
 * In this case the Iterator is only used for printing all elements in the storage, but it 
 * could be also used for other methods.
 * 
 * Learnings: 
 * 1. Always need to implement hasNext(), next() and remove() methods.
 * 2. next() returns Object class object. Always need to throw NoSuchElementException exception.
 * 3.  
 */

/**
 * @author Gabriele Galiero Casay
 * @version 1.0 07-18-2015
 */

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Storage {
	
	private int data [];
	private int numData;
	
	@SuppressWarnings("rawtypes")
	public class EnumerateElements implements Iterator {
		private int data [];
		private int numData;
		private int iter;
		
		public EnumerateElements (int data [], int numData) {
			this.data = data;
			this.numData = numData;
			this.iter = 0;
		}
		
		public boolean hasNext () {
			return iter < numData;
		}
		
		public Object next() throws NoSuchElementException {
			if (iter >= numData)
				throw new NoSuchElementException("No more elements in the collection.");
			Object res = new Integer(data[iter]);
			iter++;
			return res;
		}
		
		public void remove () throws UnsupportedOperationException {
			throw new UnsupportedOperationException();
		}
		
	}
	
	public Storage (int size) throws SizeException {
		if (size < 1)
			throw new SizeException("The storage dimension cannot be less or equal to zero");
		data = new int [size];
		numData = 0;
	}
	
	@SuppressWarnings("rawtypes")
	public Iterator numbers () {
		return new EnumerateElements(data, numData);
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
	
	@SuppressWarnings("rawtypes")
	public void print () {
		int num;
		Iterator e = numbers();
		while (e.hasNext()) {
			num = ((Integer) e.next()).intValue();
			System.out.print(num + " ");
		}
		System.out.println("");
	}
	
}
