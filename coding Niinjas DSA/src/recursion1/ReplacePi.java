package recursion1;

public class ReplacePi {
	
	public static String replace(String str){
		
		if(str.length() <=1) {
			return str;
		}
		
		String small = replace(str.substring(1));
		if(str.charAt(0)=='p' && small.charAt(0)=='i') {
			return "3.14"+small.substring(1);
		}
		else {
			return str.charAt(0)+small;
		}
		
		
//		return replace(str,0);   
//		amit
		
	}
	
	private static String replace(String str, int si) {
		
		if(si == str.length()) {
			return "";
		}
		
		if(str.charAt(0)=='p' && str.charAt(1)=='i') {
			return "3.14" +replace(str.substring(si+2));
		}
		return str.charAt(0) +replace(str.substring(si+1));
		
	}

	public static void main(String[] args) {
		String input = "apit";
		System.out.println(replace(input));
	}

}
