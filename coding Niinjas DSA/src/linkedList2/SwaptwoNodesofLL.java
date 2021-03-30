package linkedList2;

import java.util.Scanner;

public class SwaptwoNodesofLL {
	
	public static Node<Integer> swapNodes(Node<Integer> head, int i, int j) {
	
	Node<Integer> t1=head;
	Node<Integer> t2=head;
		
	int a=0;
	while(a<i) {
		t1=t1.next;
		a++;
	}
	int b=0;
	while(b<j) {
		t2=t2.next;
		b++;
	}
	
	int temp =t1.data;
	t1.data=t2.data;
	t2.data=temp;
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
		head =  swapNodes(head, 2,6);
		print(head);
	}


}
