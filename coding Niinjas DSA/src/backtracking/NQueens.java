package backtracking;

public class NQueens {

	public static void queenplace(int n) {
		int board[][] = new int[n][n];
		printallqueens(board,0);
	}
	
	
	private static boolean safe(int[][] chess, int r, int c) {
		for(int i=r-1,j=c ; i>=0 ; i--) {
			if(chess[i][j]==1) {
				return false;
			}
		}
		
		for(int i=r-1,j=c-1 ; i>=0 && j>=0 ; i--, j--) {
			if(chess[i][j]==1) {
				return false;
			}
		}
		
		for(int i=r-1,j=c+1; i>=0 && j<chess.length ; i--,j++) {
			if(chess[i][j]==1) {
				return false;
			}
		}
		return true;
	}

	
	private static void printallqueens(int[][] chess, int r) {
		
		if(r==chess.length) {
			for(int i=0;i<chess.length;i++) {
				for(int j=0;j<chess.length;j++) {
					System.out.print(chess[i][j]+" ");
				}
			}
			System.out.println();
			return;
		}
		
		for(int c=0 ;c<chess.length;c++) {
			if(safe(chess,r,c)==true) {
				chess[r][c]=1;
				printallqueens(chess, r+1);
				chess[r][c]=0;
			}
		}
		
	}

	

}
