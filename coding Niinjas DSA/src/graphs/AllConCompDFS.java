package graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AllConCompDFS {

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
		
		ArrayList<ArrayList<Integer>> op = new ArrayList<>();
		boolean[] visited = new boolean[edges.length];
		
		for(int i=0; i<edges.length; i++) {
			if(!visited[i]) {
				ArrayList<Integer> opsmall = allConnectedCompDFS(edges,i,visited);
				op.add(opsmall);
			}
		}
		
		for(int i=0; i<op.size();i++) {
			Collections.sort(op.get(i));
			for(int j=0;j<op.get(i).size();j++) {
				System.out.print(op.get(i).get(j)+" ");
			}
			System.out.println();
		}
		
	}

	private static ArrayList<Integer> allConnectedCompDFS(int[][] edges, int i, boolean[] visited) {
		ArrayList<Integer> ans = new ArrayList<>();
		ans.add(i);
		visited[i] = true;
		
		for(int j=0;j<edges.length; j++) {
			if(edges[i][j]==1 && !visited[j]) {
				ArrayList<Integer> temp = allConnectedCompDFS(edges, j, visited);
				for(int e:temp) {
					ans.add(e);
				}
			}
		}
		return ans;
	}

}
