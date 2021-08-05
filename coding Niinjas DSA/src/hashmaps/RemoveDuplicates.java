package hashmaps;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {
	
	public static int[] removeDup(int a[]){
		
		ArrayList<Integer> output =new ArrayList<>();
		HashMap<Integer, Boolean> map = new HashMap<>();
		
		for(int i=0; i<a.length; i++) {
			
			if(map.containsKey(a[i])) {
				continue;
			}
			output.add(a[i]);
			map.put(a[i], true);
		}
		
		int op[]  =new int[output.size()];
		for(int k=0;k<output.size();k++) {
			op[k] = output.get(k);
		}
		
		return op;
	}

	public static void main(String[] args) {
	
		int a[] = {1,2,3,4,2,1,2,7,5334,2321,1,8};
//		ArrayList<Integer> arr  = removeDup(a);
		int[] arr  = removeDup(a);
		for(int e:arr) {
			System.out.print(e+" ");
		}
		
	}
	
	
	
	


}
