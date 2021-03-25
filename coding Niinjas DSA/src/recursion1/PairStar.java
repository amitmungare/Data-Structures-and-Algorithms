package recursion1;

public class PairStar {
	public static String addStars(String s) {	
		return star(s, 0);
	}
	
	private static String star(String s, int si) {
		if(si ==s.length()-1) {
			return s.charAt(si)+"";
		}
		
		if(s.charAt(si) == s.charAt(si+1)) {
			return s.charAt(si)+"*"+star(s,si+1);
		}
		return s.charAt(si)+star(s,si+1);
	}

	public static void main(String[] args) {
		String input = "hello";
		System.out.println(addStars(input));
	}
	
}
