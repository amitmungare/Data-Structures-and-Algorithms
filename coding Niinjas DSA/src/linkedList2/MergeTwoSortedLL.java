package linkedList2;

import java.util.Scanner;


public class MergeTwoSortedLL {
	
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
	
	
	public static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2) {
		
		if(head1 ==null) {
			return head2;
		}
		if(head2 ==null) {
			return head1;
		}
        
		Node<Integer> t1 =head1;
		Node<Integer> t2 =head2;
		Node<Integer> h3 =null;
		Node<Integer> t3 =null;
		
		if(t1.data <= t2.data) {
			h3 = t1;
			t3 = t1;
			t1 = t1.next;
		}else {
			h3=t2;
			t3=t2;
			t2=t2.next;
		}
		
		while(t1 !=null  && t2 != null) {
			
			if(t1.data <= t2.data) {
				t3.next =t1;
				t3 = t1;
				t1 = t1.next;
			}else {
				t3.next=t2;
				t3=t2;
				t2=t2.next;
			}
		}
		
		if(t1 !=null) {
			t3.next =t1;
		}else {
			t3.next=t2;
		}
		return h3;
    }
	
	
	public static void main(String[] args) {		
		Node<Integer> t1 = input();
		Node<Integer> t2 = input();
		Node<Integer> head = merge(t1,t2);
		print(head);
	}

}
