package binaryTree;

import stacksAndQueues.QueueUsingLL;

class Pair<T,V>{
	public T first;
	public V second;
}

public class DimeterOfBinaryTree {

	public static Pair<Integer,Integer> HOD(BinaryTreeNode<Integer> root){
		if(root == null) {
			Pair<Integer,Integer> output = new Pair<>();
			output.first=0;
			output.second=0;
			return output;
		}
		Pair<Integer,Integer> lo = HOD(root.left);
		Pair<Integer,Integer> ro = HOD(root.right);
		int height = 1+Math.max(lo.first, ro.first);
		int opt1 = lo.first+ro.first;
		int opt2 = lo.second;
		int opt3 = ro.second;
		int diameter = Math.max(opt1, Math.max(opt2, opt3));
		Pair<Integer,Integer> output=new Pair<>();
		output.first=height;
		output.second=diameter;
		return output;
	}
	
	public static void main(String[] args) {

		BinaryTreeNode<Integer> root=input();
		System.out.println(HOD(root).first);
		System.out.println(HOD(root).second);
		
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
