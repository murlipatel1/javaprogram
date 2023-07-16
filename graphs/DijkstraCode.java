import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijkstraCode{
    public static class Edge{
        int src,dest,wt;
        public Edge(int src,int dest , int wt){
            this.dest = dest;
            this.wt = wt;
            this.src = src;
        }
    }

    public static class Pair implements Comparable<Pair>{
        int node , dist;
        public Pair(int n , int d){
            this.node = n; this.dist = d;
        }
        @Override
        public int compareTo(DijkstraCode.Pair o) {
            return this.dist-o.dist;
        }

    }
    public static void Dijkstra(ArrayList<Edge> graph[],int src , int V){
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int dist[] = new int[V]; 
        for(int i=0;i<V;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }
        boolean vis[]= new boolean[V];
        pq.add(new Pair(0,0));

        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!vis[curr.node]){
                vis[curr.node]=true;
                for (int i = 0; i < graph[curr.node].size(); i++) {
                 Edge e = graph[curr.node].get(i);
                 int u = e.src, v=e.dest;
                 if(dist[u]+e.wt < dist[v]){
                    dist[v]=dist[u]+e.wt;
                    pq.add(new Pair(v, dist[v]));
                                 }
                }
            }
        }
        for (int i = 0; i < V; i++) {
            System.out.println(dist[i]+" ");
        }
    }
    public static void main(String[] args) {
        
    }
}