package binarySearchTree;

import java.util.LinkedList;
import java.util.Scanner;

import binaryTree.BinaryTreeNode;
import linkedList1.LinkedListUse;
import stacksAndQueues.QueueUsingLL;

//class Pair{
//	LinkedList<Integer>head;
//	LinkedList<Integer>tail;
//}

public class BSTtoSortedLL {
	
//	public static LinkedList<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
//		Pair output = constructLinkedListHelper(root);
//        return output.head;
//	}
//	
//	public static Pair constructLinkedListHelper(BinaryTreeNode<Integer> root) {
//		if(root==null) {
//			Pair pair = new Pair();
//			return pair;
//		}
//		
//		
//		LinkedList<Integer> newNode = new LinkedList<Integer>(root.data);
//		Pair leftList =constructLinkedListHelper(root.left);
//		Pair rightList =constructLinkedListHelper(root.right);
//		Pair pair = new Pair();
//		if(leftList.tail != null) {
//			leftList.tail.next = newNode;
//		}
//		
//		newNode.next = rightList.head;
//		
//		if(leftList.head != null) {
//			pair.head = leftList.head;
//		}else {
//			pair.head =newNode;
//		}
//		
//		if(rightList.tail != null) {
//			pair.tail = rightList.tail;
//		}else {
//			pair.tail =newNode;
//		}
//		return pair;
//	}
//	
	public static void main(String[] args) {

//		BinaryTreeNode<Integer> root = inputLW();
//		LinkedList<Integer>  head = constructLinkedList(root);
//		print(node);
		
	}
	
	public static BinaryTreeNode<Integer> inputLW(){
		Scanner s =new Scanner(System.in);
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
//		System.out.println("Enter root data");
		
		int rootdata =s.nextInt();
		if(rootdata == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootdata);
		pendingNodes.enqueue(root);
		
		while(!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> front;
			front=pendingNodes.dequeue();
			
//			System.out.println("Enter left child of "+front.data);
			int leftchild =s.nextInt();
			if(leftchild != -1) {
				BinaryTreeNode<Integer> child =new BinaryTreeNode<Integer>(leftchild);
				pendingNodes.enqueue(child);
				front.left=child;
			}
			
//			System.out.println("Enter right child of "+front.data);
			int rightchild =s.nextInt();
			if(rightchild != -1) {
				BinaryTreeNode<Integer> child =new BinaryTreeNode<Integer>(rightchild);
				pendingNodes.enqueue(child);
				front.right=child;
			}		
		}
		return root;
	}


	
	
}
