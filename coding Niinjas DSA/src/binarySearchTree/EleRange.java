package binarySearchTree;

import java.util.Scanner;

import binaryTree.BinaryTreeNode;
import stacksAndQueues.QueueUsingLL;

public class EleRange {

	public static void eleRange(BinaryTreeNode<Integer> root,int k1,int k2){
	
		if(root==null) {
			return ;
		}
				
		if(root.data>=k1 && root.data<=k2) {
			eleRange(root.left, k1,k2);			
			System.out.print(root.data+" ");
			eleRange(root.right, k1,k2);					
		}else if(root.data < k1) {
			eleRange(root.right, k1,k2);
		}else if(root.data > k2) {
			eleRange(root.left, k1,k2);
		}
		
		
	}
	
	
	public static void main(String[] args) {

		BinaryTreeNode<Integer> root=inputLW();	
		eleRange(root,1,3);
	}
	
	public static BinaryTreeNode<Integer> inputLW(){
		Scanner s =new Scanner(System.in);
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		System.out.println("Enter root data");
		
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
