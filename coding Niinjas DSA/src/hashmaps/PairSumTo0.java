package hashmaps;

import java.util.HashMap;

public class PairSumTo0 {

	
	public static int PairSum(int[] a, int size) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		 for(int i=0;i<a.length;i++) {
			 if(map.containsKey(a[i])) {				 
				 map.put(a[i],map.get(a[i])+1);				 
			 }else {
				 map.put(a[i], 1);
			 }
		 }
		
		 int output=0;
		 for(int i=0;i<a.length;i++) {
			 int num = 0-a[i];
			 if(map.containsKey(num)) {
				 int a1 = map.get(a[i]);
				 int b1 = map.get(num);
				 
				 if(a[i]==0) {
					 output+=(a1*(a1-1))/2;
				 }else {
					 output +=a1*b1;
				 }
				 map.put(a[i],0);
				 map.put(num,0);
			 }
		 }
		return output; 
	}
	
	public static void main(String[] args) {
		int a[]= { 2, 1, -2, 2, 3};
		System.out.println(PairSum(a, 6));
	}

}
