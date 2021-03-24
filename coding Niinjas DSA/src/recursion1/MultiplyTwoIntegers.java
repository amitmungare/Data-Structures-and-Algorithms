package recursion1;

public class MultiplyTwoIntegers {

	
	public static int mul(int m , int n) {
		
		if(n==0) {
			return 0;
		}
		return m+mul(m,n-1);
		
	}
	
	
	public static void main(String[] args) {
		int m = 2;
		int n = 3;
		System.out.println(mul(m, n));
	}

}
