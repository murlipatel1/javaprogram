import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    static class Edge{
        int src,dest,wt;
        public Edge(int src,int dest , int wt){
            this.dest = dest;
            this.wt = wt;
            this.src = src;
        }
    }
    
    private static void bfs(ArrayList<Edge> graph[], int V, boolean vis[],int start) {
        Queue<Integer> q = new LinkedList<>();
        // boolean vis[] = new boolean[V];
        q.add(start);
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
}
