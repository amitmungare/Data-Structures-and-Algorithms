package hashmaps;

import java.util.HashMap;

public class MaxFreqNum {
	
	 public static int maxFreqNum(int[] a){ 
		
		 HashMap<Integer, Integer> map = new HashMap<>();
		 int max=0;
		 int num=a[0];
		 		 
		 for(int i=0;i<a.length;i++) {
			 if(map.containsKey(a[i])) {				 
				 map.put(a[i],map.get(a[i])+1);				 
			 }else {
				 map.put(a[i], 1);
			 }
		 }
		 
		 for(int i=0;i<a.length;i++) {
			 
			 if(map.get(a[i])> max) {
				 max = map.get(a[i]);
				 num = a[i];
			 }
			 
		 }
		 return num;
	 }
	

	public static void main(String[] args) {
		
		int a[] = {1,2,2,2,1};
		System.out.println(maxFreqNum(a));

	}

}
