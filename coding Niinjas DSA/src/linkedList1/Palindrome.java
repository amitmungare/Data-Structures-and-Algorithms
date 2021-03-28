package linkedList1;

public class Palindrome {
	
	
	
	public static Node<Integer> rev(Node<Integer> head){
		Node<Integer> curr =head;
		Node<Integer> prev =null;
		Node<Integer> next =null;
		
		while(curr != null) {
			next =curr.next;
			curr.next = prev;
			prev =curr;
			curr=next;
		}
		
		return prev;
	}
	
	public static boolean isPalindrome(Node<Integer> head) {
		
		if(head==null || head.next ==null) {
			return true;
		}
		
		Node<Integer> fast= head;
		Node<Integer> slow= head;
		
		while(fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow =slow.next;
		}
		
		Node<Integer> secHead =slow.next;
		slow.next = null;
		secHead = rev(secHead);
		
		Node<Integer> firstLL = secHead;
		Node<Integer> secLL = head;
		
		while(firstLL !=null) {
			if(firstLL.data != secLL.data) {
				return false;
			}
			firstLL =firstLL.next;
			secLL =secLL.next;
		}
		firstLL=head;
		secLL = rev(secHead);
		
		while(firstLL.next != null) {
			firstLL = firstLL.next;
		}
		
		firstLL.next = secLL;
		
		return true;
		
	}
	
	
	
	
	public static Node<Integer> input() {
		
		Node<Integer> newNode0 = new Node<Integer>(1);
		Node<Integer> newNode1 = new Node<Integer>(2);
		Node<Integer> newNode2 = new Node<Integer>(3);
		Node<Integer> newNode3 = new Node<Integer>(2);
		Node<Integer> newNode4 = new Node<Integer>(1);
		Node<Integer> head =newNode0;
		
		newNode0.next = newNode1;
		newNode1.next = newNode2;
		newNode2.next = newNode3;
		newNode3.next = newNode4;
		
		return head;
	}
	
	public static void main(String[] args) {		
		Node<Integer> head = input();
		boolean i = isPalindrome(head);
		System.out.println(i);
	}


}
