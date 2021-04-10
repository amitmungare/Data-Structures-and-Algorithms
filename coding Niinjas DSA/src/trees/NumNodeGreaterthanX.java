package trees;

public class NumNodeGreaterthanX {
	
	public static int numNodeGreater(TreeNode<Integer> root,int x){

		if(root==null) {
			return 0;
		}
		
		int count=0;
		if(root.data>x) {
			count++;
		}
		
		for(int i=0; i<root.children.size();i++) {
			count +=numNodeGreater(root.children.get(i), x);
		}

		return count;
	}

	
	public static void main(String[] args) {		
		TreeNode<Integer> root= input();
		System.out.println(numNodeGreater(root,4));
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
