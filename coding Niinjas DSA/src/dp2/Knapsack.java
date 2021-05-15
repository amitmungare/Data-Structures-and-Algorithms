package dp2;

public class Knapsack {
	
	private static int knapsack(int[] w, int[] v, int maxW) {
		return knapsack(w, v, maxW,0);
	}

	private static int knapsack(int[] w, int[] v, int maxW, int i) {
		
		if(i==w.length || maxW==0) {
			return 0;
		}
		
		if(w[i]>maxW) {
			return knapsack(w, v, maxW, i+1);
		}else {
			int op1 =v[i]+ knapsack(w, v, maxW-w[i], i+1);
			int op2= knapsack(w, v, maxW, i+1);
			return Math.max(op1, op2);
		}
		
	}
	
	
	private static int knapsackDP(int[] w, int[] v, int maxW) {
		
		int m=w.length;
		int n=maxW;
		
		int s[][]=new int[m+1][n+1]; 
		
		for(int i=0;i<m+1;i++) {
			s[i][0]=0;
		}
		for(int i=0;i<n+1;i++) {
			s[0][i]=0;
		}
		
		for(int i=1;i<m+1;i++) {
			for(int j=1;j<n+1;j++) {
				if(w[i-1]>j) {
					s[i][j]=s[i-1][j];
				}else {
					s[i][j]=Math.max(s[i-1][j], v[i-1]+s[i-1][j-w[i-1]]);
				}
			}
		}
		return s[w.length][maxW];
	}
	

	public static void main(String[] args) {
		int w[]= {6,1,2,4,5};
		int v[]= {10,5,4,8,6};
		int maxW= 5;
		System.out.println(knapsack(w,v,maxW));
	}

	

}
