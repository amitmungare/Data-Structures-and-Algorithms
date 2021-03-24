package recursion1;

public class CheckElement {
	
	public static boolean checkNumber(int arr[], int x) {
		
		if(arr.length<=0) {
			return false;
		}
		
		if(arr[0] ==x) {
			return true;
		}
		
		int smallarr[] =new int[arr.length-1];
		for(int i=1;i<arr.length;i++) {
			smallarr[i-1] =arr[i];
		}
		
		boolean ans = checkNumber(smallarr, x);
		return ans;
		
	}
	
	
	public static void main(String[] args) {
		
		int input[] = {1,2,3,4,5,6};
		int x = 1;
		System.out.println(checkNumber(input, x));
	}

}
