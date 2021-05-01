package prioriyQueues;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargest {

	public static int kthLargest(int n, int[] arr, int k) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		
		for(int i=0;i<arr.length;i++) {
			pq.add(arr[i]);
		}
		
		for(int i=0; i<arr.length;i++) {
			arr[i]=pq.remove();
		}
		
		return arr[k-1];
		

	}
	
	public static void main(String[] args) {
		int a[] = {2,4,1,9,6,8};
		int k = kthLargest(1,a, 3);
		System.out.println(k);

	}

}
