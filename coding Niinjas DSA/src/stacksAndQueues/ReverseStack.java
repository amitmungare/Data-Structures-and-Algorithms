package stacksAndQueues;

import java.util.Stack;

public class ReverseStack{

	public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {

		if(input.size()<=1) {
			return;
		}
	
		int lastele = input.pop();
	
		reverseStack(input, extra);
	
		while(!input.isEmpty()) {
			int top = input.pop();
			extra.push(top);
		}
	
		
		input.push(lastele);
	
		while(!extra.empty()){
			int top=extra.pop();
			input.push(top);
		}
	
	}

	public static void main(String[] args) {
		

	}

}
