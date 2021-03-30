package linkedList2;

import java.util.Scanner;

public class KReverse {
	
	public static Node<Integer> kReverse(Node<Integer>head ,int pos){
		if(pos==0) {
			return head;
		}
		Node<Integer> curr=head;
		Node<Integer> prev=null;
		Node<Integer> next=null;		
		int count=0;
		
		while(count < pos && curr !=null) {
			next = curr.next;
			curr.next = prev;
			prev=curr;
			curr=next;
			count++;
		}
		if(next != null) {
			head.next=kReverse(next, pos);
		}
		return prev;
		
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
		head =  kReverse(head,3);
		print(head);
	}


}
