package stacksAndQueues;

public class QueueUsingLL<T> {
	
	private Node<T> front;
	private Node<T> rear;
	int size;
	
	public QueueUsingLL() {
		front =null;
		rear=null;
		size=0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return (size==0);
	}
	
	public T front() {
		if(size==0) {
			return null;
		}
		return front.data;
	}
	
	public void enqueue(T value) {
		Node<T> newNode = new Node<T>(value);
		if(rear ==null) {
			front=newNode;
			rear=newNode;
		}else {
			rear.next= newNode;
			rear = newNode;			
		}
		size++;
	}
	
	public T dequeue() {
		if(size==0) {
			return null;
		}
		
		T temp = front.data;
		front = front.next;
		if(size==1) {
			rear=null;
		}
		size--;
		return temp;
	}
	
	
	

	public static void main(String[] args) {
		
		QueueUsingLL<Integer> q= new QueueUsingLL<>();
		
		for(int i=1; i<=12; i++) {
			q.enqueue(i);
		}
		
		while(!q.isEmpty()) {
			System.out.print(q.dequeue()+" ");
		}
		
	}

}
