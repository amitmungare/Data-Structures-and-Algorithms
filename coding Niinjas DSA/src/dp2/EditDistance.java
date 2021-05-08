package dp2;

public class EditDistance {
	
	public static int editDist(String s,String t) {
		int m=s.length();
		int n=t.length();
		int a[][] = new int[m+1][n+1];
		
		for(int i=0; i<=m;i++) {
			a[i][0]=i;
		}
		for(int j=0; j<=n;j++) {
			a[0][j]=j;
		}
		for(int i=1; i<=m;i++) {
			for(int j=1;j<=n;j++) {
				if(s.charAt(m-i)==t.charAt(n-j)) {
					a[i][j]=a[i-1][j-1];
				}else {
					a[i][j]= 1+ Math.min(a[i][j-1], Math.min(a[i-1][j], a[i-1][j-1]));
				}
			}
		}
	return a[m][n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
