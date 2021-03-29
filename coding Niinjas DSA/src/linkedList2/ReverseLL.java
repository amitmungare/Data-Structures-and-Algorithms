package linkedList2;

import java.util.Scanner;


public class ReverseLL {
	
	public static Node<Integer> rev(Node<Integer> head){
		
		if(head == null || head.next ==null) {
			return head;
		}
		
		Node<Integer> rtail =head.next;
		Node<Integer> smallans =rev(head.next);
		rtail.next = head;
		head.next =null;
		
		return smallans;
		
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
			head = rev(head);
			print(head);
		}


}
