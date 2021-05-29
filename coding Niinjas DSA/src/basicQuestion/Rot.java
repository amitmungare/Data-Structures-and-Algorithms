package basicQuestion;

import java.util.Scanner;

public class Rot {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0; i<n;i++) {
			int numofele = sc.nextInt();
			int rot =sc.nextInt();
			int arr[]= new int[numofele];
			
			for(int j=0; j<numofele; j++) {
				arr[j] = sc.nextInt();
			}
			
			rotate(arr,rot);
			
			for(int e:arr) {
				System.out.print(e+" ");
			}
			
		}
	
	}

	private static void rotate(int[] arr,int r) {
		
		int temp[] = new int[arr.length]; 
		for(int i=0; i<r;i++) {
			temp[i]=arr[i];
		}
		
		for(int i=0; i<arr.length-r;i++) {
			arr[i] = arr[i+r];
		}
		
		int j=0;
		for(int i=arr.length-r; i<arr.length;i++) {
			arr[i] = temp[j];
			j++;
		}
		
	}
}
