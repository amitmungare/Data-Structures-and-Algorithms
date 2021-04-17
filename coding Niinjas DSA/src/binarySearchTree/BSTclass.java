package binarySearchTree;

import binaryTree.BinaryTreeNode;

public class BSTclass {
	
	BinaryTreeNode<Integer> root;
	
	public void insertData(int data) {
		
	}
	
	public void deleteData(int data) {
		
	}
	
	public boolean hasData(int data) {
		return hasDataHelper(data, root);
	}
	
	private boolean hasDataHelper(int data, BinaryTreeNode<Integer> root) {
		if(root==null) {
			return false;
		}
		
		if(root.data ==data) {
			return true;
		}else if(data > root.data) {
			return hasDataHelper(data, root.right);
		}else {
			return hasDataHelper(data, root.left);
		}
		
	}

}
