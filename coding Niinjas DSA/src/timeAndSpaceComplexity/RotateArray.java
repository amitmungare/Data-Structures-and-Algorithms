package timeAndSpaceComplexity;

public class RotateArray {
	
	private static void rotate(int[] arr, int d) {

		int n=arr.length;
		int a[]=new int[n];
		
		for(int i=0; i<n; i++) {
			a[i]=arr[i];
		}
		
		for(int i=0; i<n-d; i++) {
			arr[i] = a[i+d];
		}
		
		int j=0;
		for(int i=n-d;i<n;i++) {
			arr[i]=a[j];
			j++;
		}
		
	}
	
	


	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		int d=2;
		rotate(a,d);
		
		for(int i:a) {
		System.out.print(i+" ");
		}
	}

	
}
