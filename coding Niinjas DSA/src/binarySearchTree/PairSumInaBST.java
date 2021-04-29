package binarySearchTree;

import binaryTree.BinaryTreeNode;

public class PairSumInaBST {
	
	
	
	public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
		replace(root,0);
	}

	private static int replace(BinaryTreeNode<Integer> root, int sum) {		
		if(root==null) {
			return sum;
		}		
		sum = replace(root.right , sum);
		sum +=root.data;
		root.data=sum;
		sum=replace(root.left, sum);
		return sum;		
	}

}
