package interview.examples.programs;

public class QueueDS {
	private int[] queue;
	private final int DEFAULT_SIZE = 5;
	private int front = -1,back =-1;
	private int size = 0;
	
	private IndexOutOfBoundsException ref = new IndexOutOfBoundsException();
	
	public QueueDS() {
		queue = new int[DEFAULT_SIZE];
	}
	
	public void enQueue(int value) {
		if(size < 5) {
			size++;
			
			if (size == 0) {
				front++;
			}
		}
		else {
			throw ref;
		}
	}
	
	public int deQueue() {
		if (size != 0) {
			size--;
			return queue[front++];
		}
		else {
			throw ref;
		}
	}
	
	public int size() {
		return size;
	}
	
	public String toString() {
		String element = " ";
		for(int i = front; i <= back ; i--) {
			element = element+ " "+queue[i];
			
		}
		return element;
	}
	
}
