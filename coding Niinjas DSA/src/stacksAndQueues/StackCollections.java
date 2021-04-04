package stacksAndQueues;

import java.util.Stack;

public class StackCollections {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		int[] arr= {14,22,35,42,50};
		for(int i=0; i<arr.length;i++) {
			stack.push(arr[i]);
		}
		System.out.println(stack.isEmpty());
		System.out.println(stack.size());
		System.out.println(stack.peek());

		while(!stack.isEmpty()) {
			System.out.print(stack.pop()+" ");
		}
		
		
	}

}
