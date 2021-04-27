package hashmaps;

import java.util.HashMap;

public class PiarsWithDiffK {
	
	public static int PairsWithDiffK(int a[], int k) {
		
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
			 int num = a[i]-k;
			 if(map.containsKey(num)) {				 
				 int b = map.get(num);				 
				 if(b>0) {
					 if(k!=0) {
						 output+=map.get(a[i]*b);
						 map.put(num,0);
					 }else {
					 output +=(b-1)*2;
					 map.put(num,0);
					 map.put(a[i],0);
				}
			}
		}
	}
	return output; 
		
	}

	public static void main(String[] args) {
		
		int arr[] = {5, 1, 2, 4};
		System.out.println(PairsWithDiffK(arr,3));

	}

}
