package hashmaps;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {
	
	public static ArrayList<Integer> removeDup(int a[]){
		ArrayList<Integer> output =new ArrayList<>();
		HashMap<Integer, Boolean> map = new HashMap<>();
		
		for(int i=0; i<a.length; i++) {
			
			if(map.containsKey(a[i])) {
				continue;
			}
			output.add(a[i]);
			map.put(a[i], true);
		}
		return output;
	}

	public static void main(String[] args) {
	
		int a[] = {1,2,3,4,2,1,2,7,5334,2321,1,8};
		ArrayList<Integer> arrlist = removeDup(a);
		for(int e:arrlist) {
			System.out.print(e+" ");
		}
		
	}

}
