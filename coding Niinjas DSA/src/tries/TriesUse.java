package tries;

public class TriesUse {

	public static void main(String[] args) {
		Trie t = new Trie();
		t.add("this");
		t.add("amit");
		System.out.println(t.search("amit"));
		t.delete("amit");
		System.out.println(t.search("amit"));
		System.out.println(t.countWords());
	}

}
