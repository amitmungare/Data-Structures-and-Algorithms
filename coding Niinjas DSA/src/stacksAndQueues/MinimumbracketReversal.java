package stacksAndQueues;

import java.util.Stack;

public class MinimumbracketReversal {
	
	public static int count(String str) {
		
		Stack<Character> s = new Stack<Character>();
		
		if(str.length()%2 != 0) {
			return -1;
		}else {
			for(int i=0 ;i<str.length();i++) {
				if(str.charAt(i)=='{') {
					s.push(str.charAt(i));
				}
				else if(str.charAt(i)=='}') {
					if(s.isEmpty()) {
						s.push(str.charAt(i));
					}else if(s.peek()=='{') {
						s.pop();
					}else {
						s.push(str.charAt(i));
					}
				}
			}
			int count=0;
			while(!s.isEmpty()) {
				int c1=s.pop();
				int c2=s.pop();
				if(c1==c2) {
					count++;
				}else {
					count+=2;
				}
			}
			return count;
		}
		
	}
		
		

	public static void main(String[] args) {
		String s="{{{{}}";
		System.out.println(count(s));
	}

}
