package binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import linkedList1.LinkedListUse;

public class Levelwiselinkedlist {
	
//	public static ArrayList<LinkedList<Integer>> Level(BinaryTreeNode<Integer> root){
//
//		if(root==null) {
//			return null;
//		}
//		
//		Queue<BinaryTreeNode<Integer>> pendingNode = new LinkedList<BinaryTreeNode<Integer>>();
//		pendingNode.add(root);
//		
//		int curr=1;
//		int count=0;
//		
//		LinkedList<Integer> head=null;
//		LinkedList<Integer> tail=null;
//		ArrayList<LinkedList<Integer>> output = new ArrayList<>();
//		
//		while(!pendingNode.isEmpty()) {
//			BinaryTreeNode<Integer> currnode;
//			currnode = pendingNode.remove();
//			LinkedList<Integer> newnode =new LinkedList<Integer>(currnode.data);
//			if(head==null) {
//				head=newnode;
//				tail=newnode;
//			}else {
//				tail.next=newnode;
//				tail = newnode;
//			}
//			if(currnode.left != null) {
//				pendingNode.add(currnode.left);
//				count++;
//			}
//			if(currnode.right != null) {
//				pendingNode.add(currnode.right);
//				count++;
//			}
//			curr--;
//			if(curr==0) {
//				output.add(head);
//				head=null;
//				tail=null;
//				curr=count;
//				count=0;
//			}
//			
//		}
//		return output;
//		
//	}

}
