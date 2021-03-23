package recursion1;

import java.util.Scanner;

public class PrintNumber {
	
	public static void print(int n){
		if(n == 1){
			System.out.print(n + " ");
			return;
		}
		
		print(n - 1);
		System.out.print(n+" ");
	}

	public static void main(String args[]) {
		int n = 4;
		print(n);
	}
}
