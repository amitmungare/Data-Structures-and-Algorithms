package tries;

class TrieNode{
	char data;
	boolean isTerminating;
	TrieNode children[];
	int childCount;
	
	public TrieNode(char data) {
		this.data =data;
		isTerminating=false;
		children =new TrieNode[26];
		childCount=0;
	}
}

public class Trie {
	private TrieNode root;
	
	public Trie() {
		root=new TrieNode('\0');
	}
	
	public void add(String word) {
		add(root, word);
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
	
	
	public boolean search(String word) {
		return search(root, word);
	}

	private boolean search(TrieNode root, String word) {
		
		
		if(word.length()==0){
			if(root.isTerminating==true) {
				return true;
			}else {
				return false;
			}
		}
		
		int childIndex = word.charAt(0)-'a';
		TrieNode child = root.children[childIndex];
		if(child != null) {
			return search(child,word.substring(1));			
		}else {
			return false;
		}
	}
	
	public void delete(String word) {
		remove(root,word);
	}

	private void remove(TrieNode root, String word) {
		if(word.length()==0){
			root.isTerminating=false;
			return;			
		}
		int childIndex = word.charAt(0)-'a';
		TrieNode child = root.children[childIndex];
		if(child == null) {
			return;
		}
		remove(child,word.substring(1));			
		
		if(!child.isTerminating && child.childCount==0) {
			root.children[childIndex] = null;
			child=null;
			root.childCount--;
		}
		
	}
	
	public int countWords() {
		return countWords(root);
	}

	private int countWords(TrieNode root) {
		int count =0;
		for(int i=0;i<26;i++) {
			TrieNode child = root.children[i];
			if(child !=null) {
				if(child.isTerminating) {
					count+=1;
				}
				count+=countWords(child);
			}
		}
		return count;
	}

}
