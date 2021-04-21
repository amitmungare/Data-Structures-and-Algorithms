package binarySearchTree;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

import binaryTree.BinaryTreeNode;

public class BSTclass {
	
	BinaryTreeNode<Integer> root;
	
	public void insert(int data) {
		root=insert(root, data);
	}
	
	private BinaryTreeNode<Integer> insert(BinaryTreeNode<Integer> root, int data) {
		if(root==null) {
			BinaryTreeNode<Integer> ans = new BinaryTreeNode<Integer>(data);
			return ans;
		}
		if(data > root.data) {
			root.right = insert(root.right, data);
		}else {
			root.left=insert(root.left, data);
		}
		return root;
	}

	public void deleteData(int data) {
		root=remove(root, data);
	}
	
	private BinaryTreeNode<Integer> remove(BinaryTreeNode<Integer> root, int data) {
		
		if(root==null) {
			return null;
		}
		if(root.data > data) {
			root.left =remove(root.left, data);
			return root;
		}else if(root.data < data) {
			root.right = remove(root.right, data);
			return root;
		}else {
			if(root.left==null && root.left ==null) {
				return null;
			}
			else if(root.left ==null) {
				return root.right;
			}
			else if(root.right == null) {
				return root.left;
			}else {
				BinaryTreeNode<Integer> min =root.right;
				while(min.left != null) {
					min=min.left;
				}
				root.data =min.data;
				root.right = remove(root.right, min.data);
				return root;
			} 
		}
		
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
