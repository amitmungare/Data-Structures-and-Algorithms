package timeAndSpaceComplexity;

public class UniqueElement {
	
	private static int unique(int[] a ) {
		int num=0;
		for(int i=0;i<a.length;i++) {
			num^=a[i];
		}
		return num;
	}

	public static void main(String[] args) {
		
		int a[] = {2,5,2,6,6};
		int num = unique(a);
		System.out.println(num);

	}

}
