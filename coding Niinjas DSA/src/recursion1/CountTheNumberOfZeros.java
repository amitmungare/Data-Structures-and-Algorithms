package recursion1;

public class CountTheNumberOfZeros {
	
	private static int count(int n) {
		
	if(n < 10) {
		if(n==0) {
			return 1;
		}else {
			return 0;
		}
	}
		
		int ans =0;
		
		if(n%10==0) {
			ans++;
		}
		
		return ans + count(n/10);
		
	}
	
	public static void main(String[] args) {
		int n =5020 ;
		System.out.println(count(n));
	}

	

}
