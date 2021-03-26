package timeAndSpaceComplexity;

public class DuplicateInArray {

	private static int dup(int[] a ) {
		int sum =0;
		int n=a.length;
		for(int i=0;i<n;i++) {
			sum +=a[i];
		}
		int num= ((n-2)*(n-1))/2;
		
		return sum-num;
	}
	
public static void main(String[] args) {
		
		int a[] = {0,1,2,3,4,4};
		int num = dup(a);
		System.out.println(num);

	}
}
