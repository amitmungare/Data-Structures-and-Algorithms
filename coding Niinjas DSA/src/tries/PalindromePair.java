package tries;

import java.util.ArrayList;

public class PalindromePair {
	
	private TrieNode root;
	public int count;
	

	private void add(TrieNode root, String word){
		if(word.length() == 0){
			root.isTerminating = true;
			return;
		}		

		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];

		if(child == null) {
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		}

		add(child, word.substring(1));
	}

	public void add(String word){
		add(root, word);
	}

	private boolean search(TrieNode root, String word) {
		if(word.length() == 0) {
			return root.isTerminating;
		}

		int childIndex=word.charAt(0) - 'a';
		TrieNode child=root.children[childIndex];

		if(child == null) {
			return false;
		}

		return search(child,word.substring(1));

	}

	public boolean search(String word) {
		return search(root,word);
	}

	private void print(TrieNode root, String word) {
		if (root == null) {
			return;
		}
		
		if (root.isTerminating) {
			System.out.println(word);
		}
		
		for (TrieNode child : root.children) {
			if (child == null) {
				continue;
			}
			String fwd = word + child.data;
			print(child, fwd);
		}
	}
	
	public void print() {
		print(this.root, "");
	}


	
	private String rev(String word) {
		if(word.length()==0) {
			return "";
		}
		return rev(word.substring(1))+word.charAt(0);
	}
	
	public boolean isPalindromePair(ArrayList<String> words) {
		
		for(int i=0; i<words.size(); i++) {
			int num= words.get(i).length();
			int j=0;
			while(j<num) {
				add(root, words.get(i).substring(j));
				j++;
			}
		}
		boolean pair=false;
		for(int i=0; i<words.size(); i++) {
			String str=rev(words.get(i));
			if(search(str)) {
				pair=true;
				break;
			}
		}
		return pair;
	}

}
