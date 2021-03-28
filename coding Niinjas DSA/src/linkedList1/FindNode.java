package linkedList1;

import java.util.Scanner;

public class FindNode {
	
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
	
	public static int findNode(Node<Integer> head, int n) {
		
		int i=0;
		while(head != null) {			
			if(head.data == n) {
				return i;
			}			
			head = head.next;
			i++;
		}		
		return -1;
	
	}
	
	public static void main(String[] args) {		
		Node<Integer> head = input();
		int n= findNode(head,6);
		System.out.println(n);
	}

}
