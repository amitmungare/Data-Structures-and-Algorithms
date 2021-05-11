package basicQuestion;

public class SumOfDigitsOfNumber {

	public static void main(String[] args) {
		
		int n=123456789;
		int sum=0;
		int count=0;
		
		for(int i=0; i<=count; i++) {
			if(n!=0) {
				count++;
			}
			sum+=n%10;
			n=n/10;
		}

		System.out.println(sum);
	}

}
