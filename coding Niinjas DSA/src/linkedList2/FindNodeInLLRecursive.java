package linkedList2;

import java.util.Scanner;

public class FindNodeInLLRecursive {
	
	public static int findNodeRec(Node<Integer> head, int n) {	
			return find(head, n, 0);		
	}

	public static int find(Node<Integer> head, int n, int si) {
    	
		if(head.data ==n) {
			return si;
		}
		
		if(head.data != n) {
			return -1;
		}
		
		int ans= find(head.next, n, si+1);
		
		return ans;
		
		
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
		int ans =  findNodeRec(head,8);
		System.out.println(ans);
	}

	
}
