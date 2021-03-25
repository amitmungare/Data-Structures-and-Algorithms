package recursion2;

public class ReplaceChar {

	public static String repChar(String str, char c1, char c2) {		
		return replace(str,c1,c2,0);
	}
	
	private static String replace(String str, char c1, char c2, int si) {
		
		if(si == str.length()) {
			return "";
		}
		
		if(str.charAt(si)==c1) {
			return c2 + replace(str, c1, c2, si+1);
		}
		return str.charAt(si)+replace(str, c1, c2, si+1);
		
	}

	public static void main(String[] args) {
		String input = "amit mungare";
		char c1 = 'a';
		char c2 = 'x';
		System.out.println(repChar(input, c1, c2));
	}
	
}
