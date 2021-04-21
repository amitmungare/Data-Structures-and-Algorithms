package binarySearchTree;

import binaryTree.BinaryTreeNode;

public class LCAOfBinaryTree {
	
	static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {

		if(root==null) {
			return -1;
		}
		
		if(root.data==a ||root.data==b) {
			return root.data;
		}
		
		int left = getLCA(root.left, a, b);
		int right = getLCA(root.right, a, b);
		
		if(left==-1 && right==-1) {
			return -1;
		}else if(left==-1) {
			return right;
		}else if(right==-1) {
			return left;
		}else {
			return root.data;
		}
		
	}

}
