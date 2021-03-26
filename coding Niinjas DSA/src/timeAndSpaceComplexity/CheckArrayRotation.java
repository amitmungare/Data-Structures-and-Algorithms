package timeAndSpaceComplexity;

public class CheckArrayRotation {
	
	private static int rotate(int[] arr) {
		int num =Integer.MAX_VALUE;
		int rot=0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]<num) {
				num=arr[i];
				rot=i;
			}
		}
		return rot;
	}

	public static void main(String[] args) {
		int[] a= {3,4,1,2};
		int d=2;
		int num= rotate(a);
		
		
		System.out.print(num);
		
	}

}
