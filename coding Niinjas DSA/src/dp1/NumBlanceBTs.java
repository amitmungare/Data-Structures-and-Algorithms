package dp1;

public class NumBlanceBTs {
	
//	public static long balancedBTs(long n){
//
//// In recursion
//
//		if(n<=1) {
//			return 1;
//		}
//        
//		int mod = (int)Math.pow(10, 9)+7;
//		long x= balancedBTs(n-1);
//		long y= balancedBTs(n-2);
//		
//		// (h-1)   (h-2)
//		// (x*y) + (x*x) + (x*y)
//		
//		long a =(x*x)%mod;
//		long b =(2*x*y)%mod;
//		
//		return (a+b)%mod;
//	
//	}
	
	
	public static int balancedBTs(int n){
			
	////	In DP

		int mod=(int) Math.pow(10, 9)+7;
		int s[] =new int[n+1];
		
		s[0]=1;
		s[1]=1;
		
		for(int i=2; i<=n; i++) {
			
			int x=s[i-1];
			int y=s[i-2];
			
			long a=(long) x*x;
			long b=(long) 2*x*y;
			
			int m1=(int) (a%mod);
			int m2=(int) (b%mod);
			
			s[i]=(int) (m1+m2)%mod;
		}
		return s[n];
	}

	public static void main(String[] args) {
		
		System.out.println(balancedBTs(3));
	}

}
