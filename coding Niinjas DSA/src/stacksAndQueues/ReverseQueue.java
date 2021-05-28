package stacksAndQueues;

import java.util.Queue;

public class ReverseQueue {

	
	public static void reverseQueue(Queue<Integer> input) {
		if(input.size()<=1) {
			return;
		}
		int temp =input.poll();
		reverseQueue(input);
		input.add(temp);
	}
	

	public static void main(String[] args) {
	
	}  
	
}
