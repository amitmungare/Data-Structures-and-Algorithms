package binaryTree;

import java.util.Queue;
import java.util.Stack;

import stacksAndQueues.QueueUsingLL;
import stacksAndQueues.StackUsingLL;

public class ZigZagtree {
	
	public static void print(BinaryTreeNode<Integer> root){

		if(root==null) {
			return;
		}
		QueueUsingLL<BinaryTreeNode<Integer>> queue = new QueueUsingLL<>();
		Stack<BinaryTreeNode<Integer>> stack =new Stack();
		int num=1;
		queue.enqueue(root);
		while(!queue.isEmpty()) {
			BinaryTreeNode<Integer> curr;
			
			try {				
				curr=queue.dequeue();
				System.out.print(curr.data+" ");
				if(num % 2 ==0) {
					if(curr.right!=null) {
						stack.push(curr.right);
					}
					if(curr.left!=null) {
						stack.push(curr.left);
					}
				}else {
					if(curr.left!=null) {
						stack.push(curr.left);
					}
					if(curr.right!=null) {
						stack.push(curr.right);
					}
				}
				if(queue.isEmpty()) {
					while(!stack.isEmpty()) {
						queue.enqueue(stack.pop());
					}
					System.out.println();
					num++;
				}
			}catch (Exception e) {
				
			}
		}
	
	}
	
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root=input();
		print(root);		
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
	
	BinaryTreeNode<Integer> node9 = new BinaryTreeNode<Integer>(10);
	node8.right=node9;
	
	return root;
	
}

}
