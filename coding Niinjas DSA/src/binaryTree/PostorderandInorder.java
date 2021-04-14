package binaryTree;

public class PostorderandInorder {

	public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
		return buildTreeHelper(postOrder, inOrder, 0, inOrder.length-1, 0, postOrder.length-1);		
	}
	
	
	public static BinaryTreeNode<Integer> buildTreeHelper
        (int[] postOrder, int[] inOrder,int inStart,int inEnd,int postStart,int postEnd) {
		
		if(inStart>inEnd) {
			return null;
		}
		
		
		int rootData = postOrder[postEnd];
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		
		int count = -1;	
		for(int i=inStart;i<=inEnd;i++) {
			if(inOrder[i] == rootData) {
				count = i;
				break;
			}
		}
		if(count == -1) {
			return null;
		}
		
		int leftInS=  inStart;
		int leftInE = count-1;
		int leftPostS= postStart;
		int leftPostE= leftInE- leftInS+leftPostS;
		int rightInS= count+1;
		int rightInE= inEnd; 
		int rightPostS = leftPostE+1;
		int rightPostE = rightInE- rightInS+ rightPostS;
		
		root.left = 
            buildTreeHelper(postOrder, inOrder, leftInS, leftInE, leftPostS, leftPostE);
		root.right =
            buildTreeHelper(postOrder, inOrder, rightInS, rightInE, rightPostS, rightPostE);
		
		return root;
	}
    
	
}
