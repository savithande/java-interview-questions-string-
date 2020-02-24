package interview.examples.programs;


public class StacksClass {
	private int[] stack;
	private final int DEFAULT_SIZE = 5;
	private int top = -1;
	private int size =0;
	
	private IndexOutOfBoundsException ref = new IndexOutOfBoundsException();
	
	public void stackArr() {
		stack = new int[DEFAULT_SIZE];
	}
	
	public void push(int num) {
		if(size < 5) {
			stack[++top] = num;
			size++;
			System.out.println("value = "+num);
		}
		else {
			throw ref;
		}
	}
	public int pop() {
		if(size != 0) {
			size--;
		}
		else {
			throw ref;
		}
		return size;
	}
	
	public String toString() {
		StringBuffer bf = new StringBuffer();
		for(int i = top ; i >= 0; i--) {
			bf = bf.append(stack[i]+ " ");
		}
		return bf.toString();
	}
	
	public static void main(String[] args) {
		StacksClass stack = new StacksClass();
		stack.push(20);
		stack.push(50);
		stack.push(60);
	
		System.out.println("size = "+stack.size);
		
		while(stack.size != 0) {
			System.out.println(stack.pop());
		}
		System.out.println(stack.size);
	}

}
