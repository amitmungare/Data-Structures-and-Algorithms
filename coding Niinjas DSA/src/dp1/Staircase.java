package dp1;

public class Staircase {
	
	public static long staircase(int n) {
        
        long s[] = new long[n+2];
        s[0]=1;
        s[1]=1;
        s[2]=2;
        
        for(int i=3;i<=n;i++) {
        	s[i]=s[i-1]+s[i-2]+s[i-3];
        }
        return s[n];
        
        
       
//        int arr[] = new int[5];
//        System.out.println();
	}

	public static void main(String[] args) {
		System.out.println(staircase(4));

	}

}
