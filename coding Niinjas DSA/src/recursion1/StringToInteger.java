package recursion1;

public class StringToInteger {
	
	public static int con(String input){
		return conv(input, input.length()-1);
	}

	
	private static int conv(String str, int si) {
		
		if(si==0){
			return str.charAt(si)-'0';
		}
		int val = str.charAt(si)-'0';
		return conv(str, si-1)*10 + val ;
	}


	public static void main(String[] args) {
		String input = "0012394";
		System.out.println(con(input));
	}
}
