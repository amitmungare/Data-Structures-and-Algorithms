package binarySearchTree;

import binaryTree.BinaryTreeNode;

public class CreateInsertDuplicate {
	
	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		
        if(root ==null) {
        	return;
        }
        BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(root.data);
        BinaryTreeNode<Integer> temp = root.left;
        
        root.left=newNode;
        newNode.left = temp;
        
        insertDuplicateNode(temp);
        insertDuplicateNode(root.right);
        
	}

}
