package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GetPathBFS {
	
	private static ArrayList<Integer> getPathBFS(int[][] edges, int s, int num, boolean[] visited) {		
		
		int n=edges.length;
		ArrayList<Integer> op = new ArrayList<>();
		
		if(s==num) {
			op.add(s);
			return op;
		}
		Queue<Integer> queue = new LinkedList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		queue.add(s);
		visited[s]=true;
		
		while(!queue.isEmpty()) {
			int front =queue.remove();
			for(int i=0;i<n;i++) {
				if(edges[front][i]==1 && !visited[i]) {
					map.put(i, front);
					if(i==num) {
						op.add(num);
						while(i != s) {
							i=map.get(i);
							op.add(i);
						}
						return op;
					}
					queue.add(i);
					visited[i]=true;
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
		ArrayList<Integer> op = getPathBFS(edges,s,num,visited);
		if(op !=null) {
			for(int i: op) {
				System.out.print(i+" ");
			}
		}
	}

	

}
