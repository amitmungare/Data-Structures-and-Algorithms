package graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HasPath {
	
	
	private static boolean haspathBFS(int[][] edges, int s, int num, boolean[] visited) {
		
		int n= edges.length;
		
		if(num>=edges.length) {
			return false; 
		}
		if(edges[s][num]==1) {
			return true;
		}
		Queue<Integer> q = new LinkedList<>();
		q.add(s);
		visited[s]=true;
		while(!q.isEmpty()) {
			int front = q.remove();
			if(edges[front][num]==1) {
				return true;
			}
			for(int i=0;i<n;i++) {
				if(edges[front][i]==1 && !visited[i]) {
					q.add(i);
					visited[i]=true;
				}
			}
		}
		return false;
	}
		
	

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int e=s.nextInt();
		
		int edges[][] = new int[n][n];
		for(int i=0;i<e;i++) {
			int fv=s.nextInt();
			int sv=s.nextInt();
			edges[fv][sv]=1;
			edges[sv][fv]=1;
		}
		
		int sh=s.nextInt();
		int num=s.nextInt();
		
		boolean[] visited = new boolean[edges.length];
		boolean c = haspathBFS(edges,sh,num,visited);
		System.out.println(c);
	}

}
