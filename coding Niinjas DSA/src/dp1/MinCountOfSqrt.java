package dp1;

public class MinCountOfSqrt {
	
	public static int minCount(int n) {
		
		int s[] = new int[n+1];
        
        s[0]=0;
        s[1]=1;
        
        for(int i=2; i<=n ; i++){
            int count = Integer.MAX_VALUE;
            int j=1;
            while(j*j <= i){
                int num = i - j*j;
            	if(s[num]< count){
                    count =s[num];
                }
                j++;
            }
            s[i]=count+1;
        }
		return s[n];  
		
	}
	

	public static void main(String[] args) {

	}

}
