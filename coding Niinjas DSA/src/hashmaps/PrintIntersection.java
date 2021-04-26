package hashmaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class PrintIntersection {
	
	public static void intersection(int[] arr1, int[] arr2) {
		
//		Arrays.sort(arr1);
//        Arrays.sort(arr2);
//		int i=0;
//		int j=0;
//		
//		while(i<arr1.length && j<arr2.length) {
//			
//			if(arr1[i] ==arr2[j]) {
//				System.out.println(arr1[i]);
//				i++;
//				j++;
//			}
//			else if(arr1[i] < arr2[j] ) {
//				i++;
//			}else{
//				j++;
//			}
//		}
	
		
		
//		HashSet<Integer> set = new HashSet<>();
//		
//		for(int i:arr1) {
//			set.add(i);
//		}
//		for(int i:arr2) {
//			if(set.contains(i)) {
//				System.out.print(i+ " ");
//			}
//		}
		
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0;i<arr1.length;i++) {
			 if(map.containsKey(arr1[i])) {				 
				 map.put(arr1[i],map.get(arr1[i])+1);				 
			 }else {
				 map.put(arr1[i], 1);
			 }
		 }
		
		for(int i=0;i<arr2.length;i++) {
			if(map.containsKey(arr2[i])) {
				System.out.print(arr2[i]+" ");
			}
		}
		
	}

	public static void main(String[] args) {
		int a[] = {2, 6, 1, 2};
		int b[] = {1, 2, 3, 4, 2};
		intersection(a,b);
		
	}

}
