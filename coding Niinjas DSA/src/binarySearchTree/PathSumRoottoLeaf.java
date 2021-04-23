package binarySearchTree;

import binaryTree.BinaryTreeNode;

public class PathSumRoottoLeaf {

	 public static void Sum(BinaryTreeNode<Integer> root, int k,String s) {
		
		 if(root ==null) {
			 return ;
		 }
		 if(root.left==null && root.right==null) {
			 if(root.data ==k) {
				 System.out.println(s+root.data);
			 }else {
				 return;
			 }
			 
			 s+=root.data+" ";
			 Sum(root.left, k-root.data, s);
			 Sum(root.right, k-root.data, s);
			 
		 }
		 
	 }
			
	
}
