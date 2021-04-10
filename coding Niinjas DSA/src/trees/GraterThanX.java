package trees;

import stacksAndQueues.QueueUsingLL;

public class GraterThanX {
	
	public static int Greater(TreeNode<Integer> root,int x){

		if(root==null) {		
			return 0;
		}
		
		int count=0;
		if(x<root.data) {
			count=1;
		}
		for(int i=0;i<root.children.size(); i++) {
			count += Greater(root.children.get(i),x);			
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		TreeNode<Integer> root= input();
		System.out.println(Greater(root,2));

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


	
}
