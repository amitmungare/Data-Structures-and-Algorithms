package stacksAndQueues;

public class BalancedParenthesis {
	
	 public static boolean isBalanced(String exp) {
		 
		 StackUsingLL<Character> s = new StackUsingLL<>();
			
			int i=0;
			while(i<exp.length()) {
				
				if(exp.charAt(i)=='(') {					
					s.push(exp.charAt(i));
				}
				if(exp.charAt(i)==')') {
					if(s.isEmpty()) {
						return false;
					}				
					if(s.top()=='(') {
						s.pop();						
					}else {
						return false;
					}					
				}			
			i++;	
			}
			if(!s.isEmpty()) {
				return false;
			}
			return true;
	    }
	 
	 

	public static void main(String[] args) {				
		String str = "((())";
		boolean t =isBalanced(str);
		System.out.println(t);
		
	}

}
