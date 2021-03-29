package linkedList2;

import java.util.Scanner;

public class DeleteRecursively {
	
	public static Node<Integer> delete(Node<Integer> head, int pos) {
		
		if(pos ==0) {
			return head.next;
		}
		
		if(head ==null) {
			return head;
		}
		
		head.next = delete(head.next, pos-1);
		return head;
    	
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
		head= delete(head,2);
		print(head);
	}

}
