package basicQuestion;

public class MultiplesOf3and5 {

	public static void main(String[] args) {
	
		int n=12;
		int sum=0;
		for(int i=0; i<=n; i++) {
			
			if(i%3 ==0 || i%5==0) {
				sum +=i;
			}
			
		}

		System.out.println(sum);
	}

}
