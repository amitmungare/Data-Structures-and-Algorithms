package hashmaps;

import java.util.HashMap;

public class ExtractUniqueChar {
	
	public static String uniqueChar(String str){
		String output = "";
		HashMap<Character, Boolean> map = new HashMap<>();
		
		for(int i=0; i<str.length() ; i++) {
			if(map.containsKey(str.charAt(i))) {
				continue;
			}
			output +=str.charAt(i);
			map.put(str.charAt(i), true);
		}
		return output;
	}
	

	public static void main(String[] args) {
		String s = "abcabcde";
		System.out.println(uniqueChar(s));

	}

}
