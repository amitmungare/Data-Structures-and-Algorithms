package binarySearchTree;

import java.util.Scanner;

import binaryTree.BinaryTreeNode;
import stacksAndQueues.QueueUsingLL;

public class ConstructBSTfromArray {
	
	public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
		return SortedArrayToBST(arr, 0,arr.length-1);
	}
	
	
	public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int si, int ei){
		
		if(si>ei) {
			return null;
		}
		int mid=(si+ei)/2;
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(arr[mid]);
		root.left = SortedArrayToBST(arr,si,mid-1);
		root.right= SortedArrayToBST(arr, mid+1, ei);
		return root;
	}
	
	

	public static void main(String[] args) {

		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		printLevelWise(SortedArrayToBST(arr, 7));
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
