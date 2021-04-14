package binaryTree;

import trees.TreeNode;

public class Nodeswithoutsibling {

	public static void print(BinaryTreeNode<Integer> root) {

		if(root==null) {
			return;
		}
		
		if(root.left==null && root.right != null) {
			System.out.print(root.right.data+ " ");			
		}
		if(root.right==null && root.left != null) {
			System.out.print(root.left.data+ " ");			
		}
		print(root.left);
		print(root.right);
		
	}
	
	public static void main(String[] args) {

		BinaryTreeNode<Integer> root=input();
		print(root);
		
	}

	public static BinaryTreeNode<Integer> input() {
	
	BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
	
	BinaryTreeNode<Integer> node1 = new BinaryTreeNode<Integer>(2);
	root.left=node1;
	BinaryTreeNode<Integer> node2 = new BinaryTreeNode<Integer>(3);
	root.right=node2;
	
	BinaryTreeNode<Integer> node3 = new BinaryTreeNode<Integer>(4);
	node1.left=node3;
	BinaryTreeNode<Integer> node4 = new BinaryTreeNode<Integer>(5);
	node1.right=node4;
	
	BinaryTreeNode<Integer> node5 = new BinaryTreeNode<Integer>(6);
	node2.left=node5;
	BinaryTreeNode<Integer> node6 = new BinaryTreeNode<Integer>(7);
	node2.right=node6;
	
	BinaryTreeNode<Integer> node7 = new BinaryTreeNode<Integer>(8);
	node3.left=node7;
	BinaryTreeNode<Integer> node8 = new BinaryTreeNode<Integer>(9);
	node3.right=node8;
	
	BinaryTreeNode<Integer> node9 = new BinaryTreeNode<Integer>(10);
	node8.right=node9;
	
	return root;
	
}


	
}
