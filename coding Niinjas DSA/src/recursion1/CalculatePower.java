package recursion1;

import java.util.Scanner;

public class CalculatePower {
	
	
public static int power(int x, int n) {
	
	if(n==0) {
		return 1; 
	}
	
	x = x * power(x , n-1);
	return x;
	
		
}

	
	
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int x = 2;
		int n = 3;
		
		System.out.println(power(x, n));
	}

}




	

