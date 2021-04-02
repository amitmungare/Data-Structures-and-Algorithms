package stacksAndQueues;


class Node<T>{
	T data;
	Node<T> next;
	
	Node(T data){
		this.data=data;
		next=null;
	}
	
}

public class StackUsingLL<T> {

	private Node<T> head;
	private int size;
	
	public StackUsingLL() {
		head=null;
		size=0;
	}
	
	int size() {
		return size;
	}
	
	T top() {
		if(size()==0) {
			return null;
		}
		return head.data;
	}
	
	boolean isEmpty() {
		return (head==null);
	}
	
	void push(T ele) {
		Node<T> newNode =new Node<T>(ele);
		newNode.next=head;
		head = newNode;
		size++;
	}
	
	T pop() {
		if(size()==0) {
			return null;
		}
		T temp =head.data;
		head = head.next;
		size--;
		return temp;
	}
	
	public static void main(String[] args) {
		StackUsingLL<Integer> s =new StackUsingLL<>();
		
		for(int i=1; i<=12; i++) {
			s.push(i);
		}
		
		while(!s.isEmpty()) {
			System.out.print(s.pop()+" ");
		}
		
		
	}
	
}
