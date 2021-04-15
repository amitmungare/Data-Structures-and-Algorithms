package binaryTree;

public class PreorderandInorder {

	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
		return buildTreeHelper(preOrder, inOrder, 0, preOrder.length-1, 0, inOrder.length-1);
        
	}
	public static BinaryTreeNode<Integer> buildTreeHelper
        (int[] preOrder, int[] inOrder,int preStart,int preEnd,int inStart,int inEnd) {
		
        if(inStart>inEnd)
        {
            return null;
        }
		int rootData = preOrder[preStart];
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		int count =-1;
		for(int i=0;i<inOrder.length;i++) {
            
			if(inOrder[i]==rootData) {
				count=i;
                break;
			}
		}
         if(count==-1)
        {
            return null;
        }
		
		int leftInStart=inStart;
        int leftInEnd=count-1;
        int leftPreStart=preStart+1;
        int leftPreEnd=leftInEnd-leftInStart+leftPreStart;
        int rightInStart=count+1;
        int rightInEnd=inEnd;
        int rightPreStart=leftPreEnd+1;
        int rightPreEnd=preEnd;
        
		BinaryTreeNode<Integer> leftroot = 
            buildTreeHelper(preOrder,inOrder,leftPreStart,leftPreEnd,leftInStart,leftInEnd);
		BinaryTreeNode<Integer> rightroot = 
            buildTreeHelper(preOrder,inOrder,rightPreStart,rightPreEnd,rightInStart,rightInEnd);
		root.left =leftroot;
		root.right=rightroot;
		
        return root;
	}

	
}
