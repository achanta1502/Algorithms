package graphs;

import java.util.LinkedList;
import java.util.Queue;

public class Graph {
	
	private int vertices;
	LinkedList<Integer> adj[];
	
	public Graph(int vertices) {
		this.vertices = vertices;
		
		init();
	}
	
	@SuppressWarnings("unchecked")
	private void init() {
		adj = new LinkedList[vertices];
		for (int i = 0; i < vertices; i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	public void addEdge(int src, int dst) {
		adj[(int) src].add(dst);
	}
	
	
	public String dfs() {
		
		return dfs(0);
	}
	
	public String dfs(int v) {
		StringBuilder sb = new StringBuilder();
		
		dfsUtil(v, sb, new boolean[vertices]);
		
		return sb.substring(0, sb.length() - 2);
	}

	private void dfsUtil(int v, StringBuilder sb, boolean visited[]) {
		if (visited[v]) {
			return;
		}
		
		visited[v] = true;
		sb.append(v).append("->");
		
		for (int i: adj[v]) {
			if (!visited[i]) {
				dfsUtil(i, sb, visited);
			}
		}
	}
	
	public String bfs() {
		
		return bfs(0);
	}

	public String bfs(int v) {
		StringBuilder sb = new StringBuilder();
		
		bfsUtil(v, sb, new boolean[vertices]);
		
		return sb.substring(0, sb.length() - 2);
	}

	private StringBuilder bfsUtil(int v, StringBuilder sb, boolean[] visited) {
		
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(v);
		visited[v] = true;
		
		while(!queue.isEmpty()) {
			int poll = queue.poll();
			sb.append(poll).append("->");
			
			for (int i: adj[poll]) {
				if (!visited[i]) {
					visited[i] = true;
					queue.add(i);
				}
			}
		}
		
		return sb;
	}
}
