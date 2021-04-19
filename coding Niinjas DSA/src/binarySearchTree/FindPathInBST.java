package binarySearchTree;

import java.util.ArrayList;
import java.util.Scanner;

import binaryTree.BinaryTreeNode;
import stacksAndQueues.QueueUsingLL;

public class FindPathInBST {
	
	public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
		 if(root==null) {
				return null;
			}
			
			if(root.data == data) {
				ArrayList<Integer> output = new ArrayList<>();
				output.add(root.data);
				return output;
			}
			else if(data < root.data) {
				ArrayList<Integer> leftOutput = getPath(root.left, data);
				if(leftOutput !=null) {
					leftOutput.add(root.data);
				}
				return leftOutput;
			}else{
				ArrayList<Integer> rightOutput = getPath(root.right, data);
				if(rightOutput !=null) {
					rightOutput.add(root.data);
				}
				return rightOutput;
			}
	}
	
	public static void main(String[] args) {

		BinaryTreeNode<Integer> root=inputLW();	
		
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
