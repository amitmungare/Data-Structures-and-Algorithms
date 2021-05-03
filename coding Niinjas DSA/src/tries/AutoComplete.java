package tries;

import java.util.ArrayList;

public class AutoComplete {
	
	private TrieNode root;
	public int count;
	

	private void add(TrieNode root, String word){
		if(word.length() == 0){
			root.isTerminating = true;
			return;
		}		
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if(child == null){
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		}
		add(child, word.substring(1));
	}

	public void add(String word){
		add(root, word);
	}
	
	public void autoComplete(ArrayList<String> input, String word) {
		
		for(String e:input) {
			add(e);
		}
		
		TrieNode output = findWord(root,word);
		if(output != null) {
			allpossiablewords(output, word);
		}
		
	}

	private TrieNode findWord(TrieNode root, String word) {
		if(word.length()==0) {
			return root;
		}
		for(int i=0; i<26;i++) {
			TrieNode child = root.children[i];
			if(child!=null) {
				if(child.data==word.charAt(0)) {
					return findWord(child, word.substring(1));
				}
			}
		}
		return null;
	}

	private void allpossiablewords(TrieNode root, String word) {

		if(root.isTerminating) {
			System.out.println(word);
		}
		for(int i=0; i<26;i++) {
			TrieNode child = root.children[i];
			if(child!=null) {
				allpossiablewords(child, word+child.data);
			}
		}
		
	}


}
