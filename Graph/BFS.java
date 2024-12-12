package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    public static ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> arr = new ArrayList<>();
        // arr.add(0);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        boolean[] visitedArray = new boolean[V];
        // Arrays.fill(visitedArray,0);
        int node;
        while(!queue.isEmpty()){
            node = queue.poll();
            arr.add(node);
            for (int i : adj.get(node)) {
                if(visitedArray[i]==false)
                    queue.add(i);
                    visitedArray[node]=true;
            }   
        }
        return arr;
}
    public static void main(String[] args) {
        int V = 3; // Number of vertices
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(V); 

        // Initialize adjacency lists
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges to the graph
        addEdge(adj, 0, 2);
        addEdge(adj, 2, 1);
        addEdge(adj, 0, 1);
        // addEdge(adj, 2, 4);  

        bfsOfGraph(V,adj);

    }
    public static void addEdge(ArrayList<ArrayList<Integer>> adj, 
                                    int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u); // Undirected graph
    }
}
    

