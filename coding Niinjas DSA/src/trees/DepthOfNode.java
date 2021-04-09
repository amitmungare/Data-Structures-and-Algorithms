package trees;

import stacksAndQueues.QueueUsingLL;

public class DepthOfNode {
	
	public static void nodeAtK(TreeNode<Integer> root , int k) {
		
		if(k<0) {
			return;
		}
		if(k==0) {
			System.out.println(root.data);
			return;
		}
		
		for(int i=0; i<root.children.size();i++) {
			nodeAtK(root.children.get(i),k-1);
		}
		
	}
	
	public static void main(String[] args) {
		
		TreeNode<Integer> root= input();
		nodeAtK(root,2);

	}
	
	private static TreeNode<Integer> input() {
		TreeNode<Integer> root0 =new TreeNode<Integer>(1);
		TreeNode<Integer> root1 =new TreeNode<Integer>(2);
		TreeNode<Integer> root2 =new TreeNode<Integer>(3);
		TreeNode<Integer> root3 =new TreeNode<Integer>(4);
		TreeNode<Integer> root4 =new TreeNode<Integer>(5);
		TreeNode<Integer> root5 =new TreeNode<Integer>(6);
		TreeNode<Integer> root6 =new TreeNode<Integer>(7);
		root0.children.add(root1);
		root0.children.add(root2);
		root0.children.add(root3);
		root1.children.add(root4);
		root1.children.add(root5);
		root2.children.add(root6);
		return root0;
	}



}
