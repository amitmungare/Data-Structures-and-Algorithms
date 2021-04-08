package trees;

import java.util.Queue;
import java.util.Scanner;

import stacksAndQueues.QueueUsingLL;

public class TreeUse {
	
	public static TreeNode<Integer> takeInput(Scanner s){
		int n;
		System.out.println("Enter next Node data");
		n=s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(n);
		System.out.println("Enter number of children for "+n);
		int childCount =s.nextInt();
		for(int i=0;i<childCount; i++) {
			TreeNode<Integer> child =takeInput(s);
			root.children.add(child);
		}
		return root;
	}
	
	
	public static TreeNode<Integer> inputLW(){ 
		Scanner s=new Scanner(System.in);
		// Taking the root data
		System.out.println("enter root data");
		int rootData = s.nextInt();
		
		
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		
		pendingNodes.enqueue(root);
		
		while(!pendingNodes.isEmpty()) {
			
			TreeNode<Integer> frontNode = pendingNodes.dequeue();
			
			System.out.println("Enter num of children of "+frontNode.data);
			int numChildren = s.nextInt();
			
			for(int i =0; i<numChildren; i++) {
				
				System.out.println("Enter "+(i+1)+"th child of "+frontNode.data);
				
				int child=s.nextInt();
				
				TreeNode<Integer> childNode =new TreeNode<Integer>(child);
				frontNode.children.add(childNode);
				
				pendingNodes.enqueue(childNode);
			}
		}
		return root;
	}
	
	
	public static void printLW(TreeNode<Integer> root) {
		
		QueueUsingLL<TreeNode<Integer>> queue= new QueueUsingLL<>();
		queue.enqueue(root);
		
		while(!queue.isEmpty()) {
			
			for(int i=queue.size(); i!=0; i--) {
				TreeNode<Integer> frontNode =queue.dequeue();
				System.out.print(frontNode.data+" ");
				for(int j=0; j<frontNode.children.size(); j++) {
					queue.enqueue(frontNode.children.get(j));
				}
			}
			System.out.println();
		}
	}

	
	public static void print(TreeNode<Integer> root) {
		String s = root.data+ " : ";
		for(int i=0; i <root.children.size();i++) {
			s=s+root.children.get(i).data+" ";
		}
		System.out.println(s);
		for(int i=0; i<root.children.size();i++) {
			print(root.children.get(i));
		}
	}
	

	public static void main(String[] args) {
		
//		Scanner s= new Scanner(System.in);
//		TreeNode<Integer> root= takeInput(s);
		
		TreeNode<Integer> root = inputLW();
		printLW(root);
		
		
	}

}
