package linkedList1;

import java.util.Scanner;

public class AppendLastNToFirst {
	
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

	
	public static int length(Node<Integer> head) {
		
		int count=0;
		while(head != null) {
			count++;
			head =head.next;
		}
		return count;
	}
	
	public static Node<Integer> append(Node<Integer> head, int n) {
		
	Node<Integer> temp =head;
	Node<Integer> temp1= head;
	
	int i=0;
	while(i<n) {		
		temp = temp.next;
		i++;
	}
	
	while(temp.next != null) {
		temp1 = temp1.next;
		temp = temp.next;
	}
	
	Node<Integer> newNode = head;
	Node<Integer> temp2 = temp1.next;
	temp1.next=null;
	temp.next=newNode;
	

	return temp2;
	}
	
	public static void main(String[] args) {		
		Node<Integer> head = input();
		head= append(head,3);
		print(head);
	}

}
