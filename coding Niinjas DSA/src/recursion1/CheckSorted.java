package recursion1;

public class CheckSorted {
	
	public static boolean sorted(int arr[]) {
		
		if(arr.length <=1) {
			return true;
		}
		
		if(arr[0]>arr[1]) {
			return false;
		}
		
		int smallarr[] =new int[arr.length-1];
		for(int i=1;i<arr.length;i++) {
			smallarr[i-1] =arr[i];
		}
		
		boolean sans= sorted(smallarr);
		return sans;
		
		
	}
	
	
	
public static void main(String[] args) {
		
		int input[] = {1,2,3,4};
		
		System.out.println(sorted(input));
	}

}
