import java.util.ArrayList;

public class CycleDetectionInGraph {
    public static boolean isCycleUndirected(ArrayList<Edge> graph[], boolean vis[], int curr , int par  ) //int par is parent node
    {
        vis[curr]= true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(vis[e.dest] && e.dest != par){
                return true;
            }
            else if(!vis[e.dest]){
                if(isCycleUndirected(graph , vis , e.dest , curr)) return true;
            }
        }
        return false;
    }
    
}
