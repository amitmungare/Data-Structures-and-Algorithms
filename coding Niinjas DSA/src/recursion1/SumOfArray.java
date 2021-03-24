package recursion1;

public class SumOfArray {
	
	public static int sum(int arr[]) {
		
		if(arr.length <=1) {
			return arr[0];
		}
		
		int sarr[] = new int[arr.length-1];
		for(int i=1; i<arr.length;i++) {
			sarr[i-1] = arr[i];
		}
		
		return arr[0] +sum(sarr);
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		int input[] = {1,2,3,4,5};
		System.out.println(sum(input));
	}

}
