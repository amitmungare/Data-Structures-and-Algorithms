package prioriyQueues;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KlargestEle {
	
	public static ArrayList<Integer> kLargest(int arr[], int k) {
		
//		ArrayList<Integer> al = new ArrayList<>();		
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//       
//        for(int i=0; i<k;i++) {
//        	pq.add(arr[i]);
//        }        
//        for(int i=k;i<arr.length;i++) {
//        	if(arr[i]>pq.peek()) {
//        		pq.poll();
//        		pq.add(arr[i]);       		
//        	}
//        }       
//        while(!pq.isEmpty()) {
//        	al.add(pq.poll());
//        }       
//        return al;
		
				
      PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());
      ArrayList<Integer> al1 = new ArrayList<>();	
      
      for(int i=0; i<arr.length;i++) {
      	pq1.add(arr[i]);
      }
      
      for(int i=0; i<k;i++) {
    	  al1.add(pq1.poll());
      }
		return al1;
		
		
	}

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		int a[] = {2,4,1,9,6,8};
		int k=3;
		al=kLargest(a, k);
		
		for(int i: al) {
			System.out.print(i+" ");
		}
		
	}

}
