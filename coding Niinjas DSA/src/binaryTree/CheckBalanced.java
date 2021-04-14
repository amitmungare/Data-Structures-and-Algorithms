package binaryTree;

public class CheckBalanced {
	
	public static int height(BinaryTreeNode<Integer>root) {
		if(root==null) return 0;
		
		int num1=height(root.left);
		int num2=height(root.right);
		
		return Math.max(num1, num2)+1;
	}

	
	public static boolean checkBalanced(BinaryTreeNode<Integer> root) {

		if(root==null) {
			return true;
		}
		
		if(height(root.left)==height(root.right)) {
			boolean ans1=checkBalanced(root.left);
			boolean ans2=checkBalanced(root.right);
			if(ans1 && ans2) {
				return true;
			}
		}
		return false;
			
	}


	public static void main(String[] args) {
	
		BinaryTreeNode<Integer> root=input();
		System.out.println(checkBalanced(root));
		
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
	
	return root;
	
	}
	
	
	
	}
