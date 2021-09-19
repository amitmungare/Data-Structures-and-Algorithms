package linkedList1;

public class Reverse {

	
	public static Node<Integer> input() {
		
		Node<Integer> newNode0 = new Node<Integer>(1);
		Node<Integer> newNode1 = new Node<Integer>(2);
		Node<Integer> newNode2 = new Node<Integer>(2);
		Node<Integer> newNode3 = new Node<Integer>(3);
		Node<Integer> newNode4 = new Node<Integer>(3);
		Node<Integer> head =newNode0;
		
		newNode0.next = newNode1;
		newNode1.next = newNode2;
		newNode2.next = newNode3;
		newNode3.next = newNode4;
		
		return head;
	}
	
	
	public static void rev(Node<Integer> head) {
		
		if(head ==null) {
			return;
		}
		
		rev(head.next);
		System.out.print(head.data+" ");
		
	}
	
	

	public static void main(String[] args) {		
		Node<Integer> head = input();
		rev(head);
	}

	
}
