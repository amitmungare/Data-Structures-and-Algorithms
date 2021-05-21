package dp2;

public class MinCostPath {

	public static int minCostPath(int[][]arr) {
		int m=arr.length;
		int n=arr[0].length;
		int s[][]= new int[m][n];
		
		return minCostPath(arr,s);
		
	}
	
	private static int minCostPath(int[][] arr, int[][] s) {
		int m=arr.length;
		int n=arr[0].length;
		
		s[m-1][n-1] = arr[m-1][n-1];
		
		for(int j=n-2; j>=0; j--) {
			s[m-1][j]= s[m-1][j+1]+arr[m-1][j];
		}
		
		for(int i=m-2; i>=0; i--) {
			s[i][n-1]= s[i+1][n-1]+arr[i][n-1];
		}
		
		for(int i=m-2; i>=0; i--) {
			for(int j=n-2; j>=0;j--) {
				s[i][j]=arr[i][j]+ Math.min(s[i][j+1], Math.min(s[i+1][j+1], s[i+1][j]));
			}
		}
		return s[0][0];
	}

	public static void main(String[] args) {
		
		int arr[][]= {{1,1,1}, {4,5,2}, {7,8,9}};
		System.out.println(minCostPath(arr));
	}

}
