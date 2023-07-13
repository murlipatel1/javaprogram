import java.util.*;

public class Graph{
    static class Edge{
        int src,dest,wt;
        public Edge(int src,int dest , int wt){
            this.dest = dest;
            this.wt = wt;
            this.src = src;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,1,10));
        graph[1].add(new Edge(1,2,12));
        graph[1].add(new Edge(1,3,7));

    }

    private static void bfs(ArrayList<Edge> graph[], int V, boolean vis[],int start) {
        Queue<Integer> q = new LinkedList<>();
        // boolean vis[] = new boolean[V];
        q.add(0);
        while (!q.isEmpty()){
            int curr = q.remove();
            if(vis[curr] == false){
                System.out.print(curr+ "");
                vis[curr]=true;

                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
                
            }
        }
    }
    public static void main(String[] args) {
     int V=4;k
     
     ArrayList<Edge> graph[] = new ArrayList[V];
     createGraph(graph);
    //  for (int i = 0; i < graph[1].size(); i++) {
    //     Edge e = graph[1].get(i);
    //     System.out.println(e.dest+ " ");
    //  }

    boolean vis[] = new boolean[V];
    for (int i = 0; i < V; i++) {
        if(vis[i]==false) {
            bfs(graph, V , vis,i);
        }
    }
    }
}