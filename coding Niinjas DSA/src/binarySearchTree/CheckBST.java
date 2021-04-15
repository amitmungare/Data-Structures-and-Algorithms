package binarySearchTree;

import java.util.Scanner;

import binaryTree.BinaryTreeNode;
import stacksAndQueues.QueueUsingLL;

class Pair<T,V>{
	public T first;
	public V second;
}

public class CheckBST {
	
	public static boolean isBST(BinaryTreeNode<Integer> root) {

		if(root==null) {
			return true;
		}
		boolean c=true;
		if(root.left != null) {
			if(root.left.data > root.data) {
				return false;
			}else {
				c = isBST(root.left);
			}
		}
		
		if(root.right != null) {			
			if(root.right.data < root.data) {
				return false;
			}else {
				c = isBST(root.right);
			}
		}
		return c;
	}

	public static Pair<Boolean, Pair<Integer, Integer>> isBST2(BinaryTreeNode<Integer> root) {
	
		if(root==null) {
			Pair<Boolean, Pair<Integer, Integer>> output=new Pair<Boolean, Pair<Integer,Integer>>();
			output.first=true;
			output.second=new Pair<Integer,Integer>();
			output.second.first= Integer.MAX_VALUE;
			output.second.second=Integer.MIN_VALUE;
			return output;
		}
	
		Pair<Boolean, Pair<Integer, Integer>> leftOutput= isBST2(root.left);
		Pair<Boolean, Pair<Integer, Integer>> rightOutput= isBST2(root.right);
		int min =Math.min(root.data, Math.min(leftOutput.second.first, rightOutput.second.first));
		int max =Math.max(root.data, Math.min(leftOutput.second.second, rightOutput.second.second));
		boolean isBST=(root.data>leftOutput.second.second) 
				&& (root.data <= rightOutput.second.first)
				&& leftOutput.first
				&& rightOutput.first;
		Pair<Boolean, Pair<Integer, Integer>> output=new Pair<Boolean, Pair<Integer,Integer>>();
		output.first=true;
		output.second=new Pair<Integer,Integer>();
		output.second.first= min;
		output.second.second=max;
		return output;
	}

	public static boolean isBST3(BinaryTreeNode<Integer> root,int min,int max) {
		if(root==null) {
			return true;
		}
		if(root.data<min || root.data > max) {
			return false;
		}
		boolean isleftok=isBST3(root.left, min, root.data-1);
		boolean isrightok=isBST3(root.right, root.data, max);
		return isleftok && isrightok;
	}
	
	public static void main(String[] args) {

		BinaryTreeNode<Integer> root=inputLW();	
		System.out.println(isBST3(root,Integer.MIN_VALUE,Integer.MAX_VALUE));
	}
	
	public static BinaryTreeNode<Integer> inputLW(){
		Scanner s =new Scanner(System.in);
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
//		System.out.println("Enter root data");
		
		int rootdata =s.nextInt();
		if(rootdata == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootdata);
		pendingNodes.enqueue(root);
		
		while(!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> front;
			front=pendingNodes.dequeue();
			
//			System.out.println("Enter left child of "+front.data);
			int leftchild =s.nextInt();
			if(leftchild != -1) {
				BinaryTreeNode<Integer> child =new BinaryTreeNode<Integer>(leftchild);
				pendingNodes.enqueue(child);
				front.left=child;
			}
			
//			System.out.println("Enter right child of "+front.data);
			int rightchild =s.nextInt();
			if(rightchild != -1) {
				BinaryTreeNode<Integer> child =new BinaryTreeNode<Integer>(rightchild);
				pendingNodes.enqueue(child);
				front.right=child;
			}		
		}
		return root;
	}

	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		QueueUsingLL<BinaryTreeNode<Integer>> q =new QueueUsingLL<BinaryTreeNode<Integer>>(); 		
		q.enqueue(root);
		q.enqueue(null);
		
		while(!q.isEmpty()) {
                
			BinaryTreeNode<Integer> num =q.dequeue();
			if(num == null) {
				if(q.isEmpty()) {
					break;
				}
				System.out.println();
				q.enqueue(null);
			}else {
				System.out.print(num.data+" ");
				if(num.left != null) {			
					q.enqueue(num.left);
				}
				if(num.right != null) {
					q.enqueue(num.right);
				}
			}
            
        	
		}
	}
	
	

}
