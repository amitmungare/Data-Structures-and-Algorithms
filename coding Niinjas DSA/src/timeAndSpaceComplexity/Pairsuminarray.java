package timeAndSpaceComplexity;

public class Pairsuminarray {
	
	public static int sum(int[] a, int d) {	
		
		int count=0;
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<i; j++) {
				
				if((a[i]+a[j])==d) {
					count++;
				}
				
			}
		}
		return count;
		
	}

	public static void main(String[] args) {
		int arr1[] = {1, 3 ,6, 2, 5, 4, 3, 2 ,4};
		int s =sum(arr1,12);
		System.out.println(s);
		
	}
	
	
}
