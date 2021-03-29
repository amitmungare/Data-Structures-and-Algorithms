package linkedList2;



class Node<T>{
	T data;
	Node<T> next;
	
	Node(T data){
		this.data = data;
		next=null;
	}
}


public class MidpointOfLinkedlist {

	
	public static Node<Integer> input() {
		
		Node<Integer> newNode0 = new Node<Integer>(1);
		Node<Integer> newNode1 = new Node<Integer>(2);
		Node<Integer> newNode2 = new Node<Integer>(3);
		Node<Integer> newNode3 = new Node<Integer>(4);
		Node<Integer> newNode4 = new Node<Integer>(5);
		Node<Integer> head =newNode0;
		
		newNode0.next = newNode1;
		newNode1.next = newNode2;
		newNode2.next = newNode3;
		newNode3.next = newNode4;
		
		return head;
	}
	public static void print(Node<Integer> head) {		
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}		
	}

	 public static Node<Integer> midPoint(Node<Integer> head) {
		 
		 if(head==null || head.next==null) {
			 return head;
		 }
	       
		 Node<Integer> slow =head;
		 Node<Integer> fast =head;
		 
		 while(fast.next != null) {
			 fast=fast.next.next;
			 if(fast == null) {
				 break;
			 }
			 slow=slow.next;
		 }
		 return slow;
		 
	 }
	 
	 
	 public static void main(String[] args) {		
			Node<Integer> head = input();
			head = midPoint(head);
			System.out.println(head.data);
		}
	
}
