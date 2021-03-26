package recursion2;

public class RemoveDuplicate {
	
	public static String rmvdup(String s) {	
		return dup(s,0);
	}
	
	private static String dup(String s, int si) {
		
		if(si==s.length()-1) {
			return s.charAt(si)+"";
		}
		
		if(s.charAt(si)==s.charAt(si+1)) {
			return dup(s,si+1);
		}
		return s.charAt(si)+dup(s,si+1);
	}
	
	
	public static void main(String[] args) {
    	String input = "amittttttt";
    	System.out.println(rmvdup(input));
    }
}
