package linkedList1;

import java.util.Scanner;

public class EliminateDuplicates {
	
		
		public static Node<Integer> input() {
			
			Node<Integer> newNode0 = new Node<Integer>(1);
			Node<Integer> newNode1 = new Node<Integer>(2);
			Node<Integer> newNode2 = new Node<Integer>(2);
			Node<Integer> newNode3 = new Node<Integer>(3);
			Node<Integer> newNode4 = new Node<Integer>(3);
			Node<Integer> head =newNode0;
			
			newNode0.next = newNode1;
			newNode1.next = newNode2;
			newNode2.next = newNode3;
			newNode3.next = newNode4;
			
			return head;
		}
		public static void print(Node<Integer> head) {		
			while(head != null) {
				System.out.print(head.data+" ");
				head = head.next;
			}		
		}
		
		
		
		public static Node<Integer> removeDup(Node<Integer> head) {
			
			if(head==null ||head.next==null) {
				return head;
			}
			
			Node<Integer> temp = head;
			Node<Integer> temp2 = head.next;
			
			while(temp2 != null) {
				
				if(temp.data.equals(temp2.data)) {
					temp2 = temp2.next;
				}else {
					temp.next=temp2;
					temp=temp.next;
					temp2=temp2.next;
				}				
			}
			temp.next=null;
			return head;
			
		}
		
		
		
		
		public static void main(String[] args) {		
			Node<Integer> head = input();
			head = removeDup(head);
			print(head);
		}


}
