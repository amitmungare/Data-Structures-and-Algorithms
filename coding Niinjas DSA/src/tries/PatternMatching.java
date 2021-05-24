package tries;

import java.util.ArrayList;

public class PatternMatching {

	private TrieNode root;
	public int count;
	

	public boolean search(String word){
		return search(root, word);
	}

	private boolean search(TrieNode root, String word) {
		if(word.length() == 0){
			return true;
		}
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if(child == null){
			return false;
		}
		return search(child, word.substring(1));
	}


	public boolean patternMatching(ArrayList<String> vect, String pattern) {
        
		for(int i=0; i<vect.size(); i++) {
			int num= vect.get(i).length();
			int j=0;
			while(j<num) {
				add(root, vect.get(i).substring(j));
				j++;
			}
		}
		return search(pattern);
	}

private void add(TrieNode root, String word) {
		
		if(word.length()==0) {
			root.isTerminating=true;
			return;
		}
		int childIndex = word.charAt(0)-'a';
		TrieNode child = root.children[childIndex];
		if(child==null) {
			child=new TrieNode(word.charAt(0));
			root.children[childIndex]=child;
			root.childCount++;
		}
		add(child, word.substring(1));		
	}

	
}
