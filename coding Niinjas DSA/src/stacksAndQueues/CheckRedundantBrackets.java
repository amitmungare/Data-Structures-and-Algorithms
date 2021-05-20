package stacksAndQueues;

import java.util.Stack;

public class CheckRedundantBrackets {
	
	private static boolean find(char c) {

		if(c=='+' || c=='-' || c=='*' || c=='/'){
			return true;
		}	
		return false;
	}
	
	public static boolean check(String exp) {
		
		Stack<Character> s =new Stack<>(); 
		
		for(int i=0;i<exp.length();i++) {
			
			if(exp.charAt(i)=='(' || find(exp.charAt(i))) {
				s.push(exp.charAt(i));
				
			}else if(exp.charAt(i)==')') {
				boolean check =false;
				
				while(!s.isEmpty() && s.peek() !='(') {
					s.pop();
					check=true;
				}
				if(!check) {
					return true;
				}
				if(!s.isEmpty()) {
					s.pop();
				}				
			}
		}
		return false;
	}


	public static void main(String[] args) {
		
		String s="(a+b)+c";
		System.out.println(check(s));
		
	}

}
