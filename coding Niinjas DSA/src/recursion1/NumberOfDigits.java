package recursion1;

import java.util.Scanner;

public class NumberOfDigits {

	public static int count(int n){
		if(n == 0){
			return 0;
		}
		int smallAns = count(n / 10);
		return smallAns +1;
	}
	
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = 156;
		System.out.println(count(n));
	}
	
}
