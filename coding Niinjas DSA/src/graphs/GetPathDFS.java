package graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class GetPathDFS {
	
	
	private static ArrayList<Integer> getPathDFS(int[][] edges, int s, int num, boolean[] visited) {
		
		visited[s]=true;
		int n=edges.length;
		
		ArrayList<Integer> op = new ArrayList<>();
		if(s==num) {
			op.add(s);
			return op;
		}
		
		for(int i=0;i<n;i++) {
			if(edges[s][i]==1 && !visited[i]) {
				visited[i]=true;
				ArrayList<Integer> temp = getPathDFS(edges, i, num, visited);
				if(temp!=null) {
					temp.add(s);
					return temp;
				}
			}
		}
		return null;
	}
	

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
		
		int s= sc.nextInt();
		int num=sc.nextInt();
		boolean visited[] = new boolean[edges.length];
		ArrayList<Integer> op = getPathDFS(edges,s,num,visited);
		if(op !=null) {
			for(int i: op) {
				System.out.print(i+" ");
			}
		}
		
	}

	

}
