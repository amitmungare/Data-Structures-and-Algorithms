package linkedList2;

import java.util.Scanner;

public class MergeSort {
	
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
	
	
	public static Node<Integer> mid(Node<Integer> head){
		if(head == null) {
			return head;
		}
		Node<Integer> slow=head;
		Node<Integer> fast=head;
		
		while(fast != null && fast.next != null){
			fast = fast.next.next;
			if(fast ==null) {
				break;
			}
			slow = slow.next;
		}
		return slow;
		
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
	
	public static Node<Integer> mergeSort(Node<Integer> head){
		if(head == null ||head.next == null) {
			return head;
		}
		
		Node<Integer> mid = mid(head);
		
		Node<Integer> t1 =head;
		Node<Integer> t2=mid.next;
		mid.next =null;
		
		t1 = mergeSort(t1);
		t2 = mergeSort(t2);
		
		Node<Integer> newHead = merge(t1,t2);
		return newHead;
		
		
	}
	
	public static void main(String[] args) {		
		Node<Integer> head = input();
		head = mergeSort(head);
		print(head);
	}


}
