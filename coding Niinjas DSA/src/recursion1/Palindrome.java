package recursion1;

public class Palindrome {
	
	public static boolean palindrome(String str) {
		return pal(str,1,str.length()-1);
	}
	
	
	private static boolean pal(String str, int si, int ei) {
		
		if(si>=ei) {
			return true;
		}
		
		if(str.charAt(si) == str.charAt(ei)) {
			return pal(str, si+1, ei-1);
				
		}
		return false;
		
	}


	public static void main(String[] args) {
		String input = "abccba";
		System.out.println(palindrome(input));
	}
}
