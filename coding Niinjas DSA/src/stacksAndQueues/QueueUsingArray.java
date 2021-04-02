package stacksAndQueues;

public class QueueUsingArray {
	
	private int[] data;
	private int front;
	private int rear;
	private int size;
	
	public QueueUsingArray() {
		data =new int[10];
		front=-1;
		rear=-1;
		size =0;
	}
	
	public QueueUsingArray(int cap) {
		data =new int[cap];
		front=-1;
		rear=-1;
		size =0;
	}

	int size() {
		return size;
	}
	
	boolean isEmpty() {
		return size==0;
		
	}
	
	int front() {
		if(size==0) {
			return -1;
		}
		return data[front];
	}

	void enqueue(int ele) {
		
		if(size==data.length) {
			doubleCapacity();
		}
		
		if(size==0) {
			front =0;
		}
		size++;
		
		rear=(rear+1)%data.length;
//		rear++;
//		if(rear==data.length) {
//			rear=0;
//		}
		
		data[rear] =ele;
		
	}
	
	int dequeue() {
		if(size==0) {
			return -1;
		}
		int temp=data[front];
		size--;
		
		front= (front+1)% data.length;
//		front++;
//		if(front == data.length) {
//			front=0;
//		}
		
		if(size==0) {
			rear =-1;
			front =-1;
		}
		return temp;
	}

	
	private void doubleCapacity() {
		int[] temp=data;
		data = new int[temp.length*2];
		
		int index=0;
		for(int i=front; i<temp.length;i++) {
			data[index] =temp[i];
			index++;
		}	
		for(int i=0; i<=front-1; i++) {
			data[index] =temp[i];
			index++;
		}
		front=0;
		rear=temp.length-1;
	}
	
	public static void main(String[] args) {
		
		QueueUsingArray q=new QueueUsingArray();
		
		for(int i=1;i<=20;i++) {
			q.enqueue(i);
		}
		
		while(!q.isEmpty()) {
			System.out.print(q.dequeue()+" ");
		}
		
	}

}
