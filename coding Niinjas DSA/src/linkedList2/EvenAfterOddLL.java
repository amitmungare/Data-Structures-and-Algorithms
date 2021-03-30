package linkedList2;

import java.util.Scanner;

public class EvenAfterOddLL {
	
	public static Node<Integer> evenAfterOdd(Node<Integer> head) {
		if(head ==null) {
			return head;
		}
		Node<Integer> oddh =null, oddt =null, evenh =null, event =null;
		
		while(head != null) {			
			if(head.data %2 ==0) {
				if(evenh == null) {
					evenh = head;
					event =head;
				}else {
					event.next=head;
					event = event.next;
				}										
			}else {
				if(evenh == null) {
					oddh = head;
					oddt =head;
				}else {
					oddt.next=head;
					oddt = oddt.next;
				}	
			}
			head = head.next;
			
		}
		if(oddh==null) {
			return evenh;
		}else {
			oddt.next = evenh;
		}
		
		if(evenh != null) {
			event.next=null;
		}
		
		return oddh;
		
	}

	public static Node<Integer> input() {
		Node<Integer> head = null, tail=null;
		Scanner s=new Scanner(System.in);
		int data = s.nextInt();
		 
		while(data != -1) {
			Node<Integer> newNode = new Node<Integer>(data);
			if(head == null) {
				head = newNode;
				tail = newNode;
			}else {
				tail.next=newNode;
				tail = newNode;
			}
			data=s.nextInt();
		}
		return head;
	}
				
	public static void print(Node<Integer> head) {		
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}		
	}
	
	
	public static void main(String[] args) {		
		Node<Integer> head = input();
		head=  evenAfterOdd(head);
		print(head);
	}

	
}
