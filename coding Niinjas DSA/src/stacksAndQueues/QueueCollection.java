package stacksAndQueues;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;

public class QueueCollection {

	public static void main(String[] args) {
		
		Queue<Integer> queue =new LinkedList<Integer>();
			
			
		
		
		int[] arr= {14,22,35,42,50};
		for(int i=0; i<arr.length;i++) {
			queue.add(arr[i]);
		}
		System.out.println(queue.isEmpty());
		System.out.println(queue.size());
		System.out.println(queue.peek());

		while(!queue.isEmpty()) {
			System.out.print(queue.poll()+" ");
		}

	}

}
