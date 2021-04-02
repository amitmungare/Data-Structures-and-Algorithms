package stacksAndQueues;

public class StackUsingArray {
	
	private int data[];
	private int top;
	
	public StackUsingArray() {
		data = new int[10];
		top= -1;
	}
	
	public StackUsingArray(int cap) {
		data = new int[cap];
		top= -1;
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public int size() {
		return top+1;
	}
	
	public int top() {
		if(size() == 0) {
			return -1;
		}
		return data[top];
	}
	
	public void push(int ele) {
		if(size() ==data.length) {
			doubleCapacity();
		}
		top++;
		data[top] = ele;
		
	}

	private void doubleCapacity() {
		int[] temp=data;
		data = new int[temp.length*2];
		
		for(int i=0; i<top;i++) {
			data[i] =temp[i];
		}	
	}

	public int pop() {
		if(size()==0) {
			return -1;
		}
		int temp=data[top];
		top--;
		return temp;
	}
	
}
