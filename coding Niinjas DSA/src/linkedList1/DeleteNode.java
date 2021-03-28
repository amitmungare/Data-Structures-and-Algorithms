package linkedList1;

import java.util.Scanner;

public class DeleteNode {
	
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
	
	public static Node<Integer> delete(Node<Integer> head, int pos) {

		int i=0;
		Node<Integer> temp =head;
		
		if(head == null) {
			return head;
		}
		
		if(pos ==0) {
			return head.next;
		}
		
		while(temp != null  && i < pos-1) {
			temp = temp.next;
			i++;
		}
		
		if(temp==null || temp.next==null) {
			return head;
		}
		
		temp.next =temp.next.next;
		return head;
		
	}
	
	
	public static void main(String[] args) {		
		Node<Integer> head = input();
		head =  delete(head, 3);
		print(head);
	}

}
