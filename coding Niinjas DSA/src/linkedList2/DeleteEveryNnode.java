package linkedList2;

import java.util.Scanner;


public class DeleteEveryNnode {
	

	public static Node<Integer> skipMdeleteN(Node<Integer> head, int m, int n) {

		if(m==0 || head==null) {
			return null;
		}
		if(n==0) {
			return head;
		}
		
		Node<Integer> currNode=head;
		Node<Integer> temp=null;
		
		while(currNode != null) {
			int i=0;
			int j=0;
			while(currNode !=null && i<m) {
				if(temp==null) {
					temp = currNode;
				}else {
					temp.next =currNode;
					temp = currNode;
				}
				currNode=currNode.next;
				i+= 1;
			}
			while(currNode != null && j <n) {
				currNode=currNode.next;
				j += 1;
			}
		}
		if (temp != null) {
			temp.next=null;
		}
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
		head =  skipMdeleteN(head, 2,3);
		print(head);
	}

	
}
