import java.util.*;

public class DFS {
    static class Edge{
        int src,dest,wt;
        public Edge(int src,int dest , int wt){
            this.dest = dest;
            this.wt = wt;
            this.src = src;
        }
    }

    public static void dfs(ArrayList<Edge> graph[] , int curr , boolean vis[]){
        System.out.println(curr+" ");
        vis[curr] = true;

         for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    if(vis[e.dest]==false){
                        dfs(graph, e.dest, vis);
                    }
                }
    }

    public static void main(String[] args) {
         int V=4;
     
     ArrayList<Edge> graph[] = new ArrayList[V];

        boolean vis[] = new boolean[V];
    for (int i = 0; i < V; i++) {
        if(vis[i]==false) {
            dfs(graph, 0, vis);
        }
    }
    }

}

