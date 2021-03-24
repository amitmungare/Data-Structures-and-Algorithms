package recursion1;

public class GemetriCount {
	

	private static double gemSum(double n) {
		
		if(n==0) {
			return 1;
		}
		double op = gemSum(n-1);
		double ans=1;
		for(int i=0;i<n;i++) {
			ans=ans*2;
		}
		return op+(1/ans);
		
	}

	public static void main(String[] args) {
		double n =4 ;
		System.out.println(gemSum(n));
	}


}
