package binaryTree;

import stacksAndQueues.QueueUsingLL;

public class RemoveLeafnodes {
	
	public static BinaryTreeNode<Integer> remove(BinaryTreeNode<Integer> root){
        
		if(root==null) {
			return null;
		}
		
		if(root.left==null && root.right==null) {
			return null;
		}
		
		root.left= remove(root.left);
		root.right=remove(root.right);
		
		return root;
	       
	}
	
	
	public static void main(String[] args) {

		BinaryTreeNode<Integer> root=input();
		printLW(root);
		
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

	
	public static void printLW(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		QueueUsingLL<BinaryTreeNode<Integer>> queue =new QueueUsingLL<BinaryTreeNode<Integer>>();
		queue.enqueue(root);
		
		while(!queue.isEmpty()) {
			BinaryTreeNode<Integer> front;
			
			front=queue.dequeue();
			String s= front.data+" ";
			if(front.left==null) {
				s+="L:-1"+" ";
			}else {
				s+="L:"+front.left.data+" ";
				queue.enqueue(front.left);
			}
			if(front.right==null) {
				s+="R:-1"+" ";
			}else {
				s+="R:"+front.right.data+" ";
				queue.enqueue(front.right);
			}
			System.out.println(s);
		}
	}
	
	

}
