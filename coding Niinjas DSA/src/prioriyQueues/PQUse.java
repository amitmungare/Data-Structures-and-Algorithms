package prioriyQueues;

import java.util.PriorityQueue;

public class PQUse {

	public static void main(String[] args) {
		
//		MaxPriorityQueue pq = new MaxPriorityQueue();
//		int arr[]= {4,3,6,1,8,2,4};
//		for(int i=0;i<arr.length;i++) {
//			pq.insert(arr[i]);
//		}
//		
//		System.out.println(pq);
//		
//		while(!pq.isEmpty()) {
//			System.out.print(pq.removeMax()+" ");
//		}
//		System.out.println();
//		
///////////////////////////////////////////////////////////////////////////////////////////	
//	
//		MinPriorityQueue pq1 = new MinPriorityQueue();
//		int arr1[]= {4,3,6,1,8,2,4};
//		for(int i=0;i<arr1.length;i++) {
//			pq1.insert(arr1[i]);
//		}
//		
//		while(!pq1.isEmpty()) {
//			System.out.print(pq1.removeMin()+" ");
//		}
//		System.out.println();
		
	
	
	
	PriorityQueue<Integer> pq2 = new PriorityQueue<>();
	int arr2[]= {4,3,6,1,8,2,4};
	
	for(int i=0;i<arr2.length;i++) {
		pq2.add(arr2[i]);
	}
	
	System.out.println(pq2.peek());
	System.out.println(pq2.poll());
	
	while(!pq2.isEmpty()) {
		System.out.print(pq2.remove()+" ");
	}
	System.out.println();
	
}	

}
