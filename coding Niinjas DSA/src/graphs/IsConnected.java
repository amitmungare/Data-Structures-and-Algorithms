package graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class IsConnected {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int v=sc.nextInt();
		int e=sc.nextInt();
		int edges[][]= new int[v][v];
		for(int i=0; i<e;i++) {
			int fv=sc.nextInt();
			int sv=sc.nextInt();
			edges[fv][sv]=1;
			edges[sv][fv]=1;
		}
		
		boolean visited[] = new boolean[edges.length];
		
		connectedDFS(edges,0,visited);
		boolean check= true;
		for(int i=0; i<edges.length;i++) {
			if(!visited[i]) {
				check=false;
				break;
			}
		}
		System.out.println(check);
	}

	private static void connectedDFS(int[][] edges, int i, boolean[] visited) {
		int n=edges.length;
		if(i>=n) {
			return;
		}
		visited[i]=true;
		for(int j=0;j<n;j++) {
			if(edges[i][j]==1 && !visited[j]) {
				connectedDFS(edges,j,visited);
			}
		}
	}

}
