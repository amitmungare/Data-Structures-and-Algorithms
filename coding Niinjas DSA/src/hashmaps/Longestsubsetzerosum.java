package hashmaps;

import java.util.HashMap;

public class Longestsubsetzerosum {
	
	public static int LongestSubsetWithZeroSum(int a[]) {
		int sum=0;
		int max=0;
		HashMap<Integer,Integer> map =new HashMap<Integer, Integer>();
		
		for(int i=0; i<a.length;i++) {
			sum+=a[i];
			if(sum==0) {
				if(i>max) {
					max=i++;
				}
				map.put(sum,i);
			}else if(map.containsKey(sum)) {
				int num =i-map.get(sum);
				if(num>max) {
					max=num;
				}
			}else {
				map.put(sum,i);
			}
		}
		return max;
	}


	public static void main(String[] args) {
		
		int a[] = {95,-97,-387,-435,-5,-70,897,127,23,284};
		System.out.println(LongestSubsetWithZeroSum(a));
		
	}

}
