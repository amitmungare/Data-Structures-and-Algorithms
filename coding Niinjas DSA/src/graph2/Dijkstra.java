package graph2;

import java.util.Scanner;

public class Dijkstra {
	
	private static void dijkstra(int[][] adjacencyMatrix) {
		int v= adjacencyMatrix.length;
		boolean visited[]= new boolean[v];
		int dist[]= new int[v];
		for(int i=1 ; i<v; i++) {
			dist[i]=Integer.MAX_VALUE;
		}
		
		for(int i=0; i<v-1; i++) {
			int minVertex = findMinVertex(dist, visited);
			visited[minVertex] =true;
			for(int j=0; j<v; j++) {
				if(adjacencyMatrix[minVertex][j] !=0 && !visited[j] && dist[minVertex] != Integer.MAX_VALUE) {
					int newDist = dist[minVertex] +adjacencyMatrix[minVertex][j];
					if(newDist< dist[j]) {
						dist[j]=newDist;
					}
				}
			}
		}
		
		for(int i=0; i<v; i++) {
			System.out.println(i +" "+dist[i]);
		}
		
	}

	private static int findMinVertex(int[] weight, boolean[] visited) {
		int minVertex = -1;
		for(int i=0; i< weight.length;i++) {
			if(!visited[i] && (minVertex== -1 || weight[i]< weight[minVertex])) {
				minVertex=i;
			}
		}
		return minVertex;
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int v=sc.nextInt();
		int e=sc.nextInt();
		int adjacencyMatrix[][] = new int[v][v];
		for(int i=0;i<e;i++) {
			int v1=sc.nextInt();
			int v2=sc.nextInt();
			int weight =sc.nextInt();
			adjacencyMatrix[v1][v2]=weight;
			adjacencyMatrix[v2][v1]=weight;
		}
		dijkstra(adjacencyMatrix);
		
	}

	

}
