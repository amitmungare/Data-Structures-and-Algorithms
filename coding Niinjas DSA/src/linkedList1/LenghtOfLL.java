package linkedList1;

import java.util.Scanner;


public class LenghtOfLL {

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


public static void length(Node<Integer> head) {
	
	int count=0;
	while(head != null) {
		count++;
		head =head.next;
	}
	System.out.println();
	System.out.println(count);
}



public static void main(String[] args) {		
	Node<Integer> head = input();
	length(head);
}

}
