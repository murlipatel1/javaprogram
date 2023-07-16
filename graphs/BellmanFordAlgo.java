import java.util.ArrayList;

public class BellmanFordAlgo {
    public static class Edge{
        int src,dest,wt;
        public Edge(int src,int dest , int wt){
            this.dest = dest;
            this.wt = wt;
            this.src = src;
        }
    }

    public static void bellmanFord(ArrayList<Edge> graph[] , int src , int V){
        int dist[] = new int [V];
        for (int i = 0; i < V; i++) {
            if(i!=src) dist[i]=Integer.MAX_VALUE;
        }
        for (int k = 0; k < V-1; k++) {
        for (int i = 0; i < V; i++) {
            for(int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                int u=e.src;int v=e.dest;

                if(dist[u]!= Integer.MAX_VALUE && dist[u]+e.wt<dist[v]) {
                    dist[v]=dist[u]+e.wt;

                }
        }
    }
}
for (int i = 0; i < V; i++) {
            for(int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                int u=e.src;int v=e.dest;

                if(dist[u]!= Integer.MAX_VALUE && dist[u]+e.wt<dist[v]) {
                    // dist[v]=dist[u]+e.wt;
                    System.out.println("Negative wt cycle detected");

                }
        }
    }
    for (int i = 0; i < dist.length; i++) {
        System.out.print(dist[i]+" ");   
    }
    System.out.println();
}
} 
