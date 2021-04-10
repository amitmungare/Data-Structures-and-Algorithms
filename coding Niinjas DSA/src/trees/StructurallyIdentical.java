package trees;

public class StructurallyIdentical {
	
	public static boolean Identical(TreeNode<Integer> root1, TreeNode<Integer> root2){
		
		if(root1==null && root2==null) {
			return true;
		}
		if(root1==null || root2==null) {
			return false;
		}
		if(!root1.data.equals(root2.data)) {
			return false;
		}
		if(root1.children.size() != root2.children.size()) {
			return false;
		}
		
		int num1=root1.data;
		int num2=root2.data;
		for(int i=0 ; i<root1.children.size();i++) {
			Identical(root1.children.get(i), root2.children.get(i));
			if(num1 ==num2) {
				return true;
			}
		}
		return false;
	}

	
	public static void main(String[] args) {
		TreeNode<Integer> root1= input();
		TreeNode<Integer> root2= input();
		
		System.out.println(Identical(root1, root2));

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
