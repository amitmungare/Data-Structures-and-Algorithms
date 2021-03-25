package recursion1;

public class RemoveX {
	public static String removeX(String s){		
		return removeX(s , 0);
	}

	private static String removeX(String s, int si) {
		
		if(si == s.length()) {
			return "";
		}
		
		if(s.charAt(si)=='x') {
			return removeX(s,si+1);
		}
		return s.charAt(si)+removeX(s,si+1);
		
	}

	public static void main(String[] args) {
		String input ="xxamxixxtxxx";
		System.out.println(removeX(input));
	}
	
}
