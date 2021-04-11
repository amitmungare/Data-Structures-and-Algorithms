package binaryTree;

import java.util.Scanner;

import stacksAndQueues.QueueUsingLL;
import trees.TreeNode;

public class BinaryTreeUse {
	
	public static BinaryTreeNode<Integer> input(Scanner s){
		int rootData;
		System.out.println("enter root data");
		rootData=s.nextInt();
		if(rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		root.left=input(s);
		root.right=input(s);
		return root;
	}
	
	public static void print(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		String print =root.data+" ";
		if(root.left !=null) {
			print += "L:"+root.left.data+" ";
		}
		if(root.right !=null) {
			print += "R:"+root.right.data;
		}
		System.out.println(print);
		print(root.left);
		print(root.right);
	}

	
	public static BinaryTreeNode<Integer> inputLW(){
		Scanner s =new Scanner(System.in);
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		System.out.println("Enter root data");
		
		int rootdata =s.nextInt();
		if(rootdata == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootdata);
		pendingNodes.enqueue(root);
		
		while(!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> front;
			front=pendingNodes.dequeue();
			
			System.out.println("Enter left child of "+front.data);
			int leftchild =s.nextInt();
			if(leftchild != -1) {
				BinaryTreeNode<Integer> child =new BinaryTreeNode<Integer>(leftchild);
				pendingNodes.enqueue(child);
				front.left=child;
			}
			
			System.out.println("Enter right child of "+front.data);
			int rightchild =s.nextInt();
			if(rightchild != -1) {
				BinaryTreeNode<Integer> child =new BinaryTreeNode<Integer>(rightchild);
				pendingNodes.enqueue(child);
				front.right=child;
			}		
		}
		return root;
	}

	
	public static void printLW(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		QueueUsingLL<BinaryTreeNode<Integer>> queue =new QueueUsingLL<BinaryTreeNode<Integer>>();
		queue.enqueue(root);
		
		while(!queue.isEmpty()) {
			BinaryTreeNode<Integer> front;
			
			front=queue.dequeue();
			String s= front.data+" ";
			if(front.left==null) {
				s+="L:-1"+" ";
			}else {
				s+="L:"+front.left.data+" ";
				queue.enqueue(front.left);
			}
			if(front.right==null) {
				s+="R:-1"+" ";
			}else {
				s+="R:"+front.right.data+" ";
				queue.enqueue(front.right);
			}
			System.out.println(s);
		}
	}
	
	
	public static void main(String[] args) {
		
		
		BinaryTreeNode<Integer> root =inputLW();
		printLW(root);
		
//		Scanner s=new Scanner(System.in);
//		BinaryTreeNode<Integer> root =input(s);
//		print(root);
		
//		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(2);
//		BinaryTreeNode<Integer> node1 = new BinaryTreeNode<Integer>(1);
//		BinaryTreeNode<Integer> node2 = new BinaryTreeNode<Integer>(3);
//		root.left=node1;
//		root.right=node2;
		
	}

}
