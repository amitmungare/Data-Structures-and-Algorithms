package prioriyQueues;

import java.util.PriorityQueue;

public class KsortedArray {

	
	public static void Ksort(int arr[], int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int i=0;i<k;i++) {
			pq.add(arr[i]);
		}
		
		for(int i=k; i<arr.length;i++) {
			arr[i-k]=pq.remove();
			pq.add(arr[i]);
		}
		
		for(int j=arr.length-k; j< arr.length; j++) {
			arr[j] = pq.remove();
		}
		
	}
	
	public static void main(String[] args) {
		int a[] = {2,4,1,9,6,8};
		int k=3;
		Ksort(a, k);
		for(int i: a) {
			System.out.print(i+" ");
		}
	}

}
