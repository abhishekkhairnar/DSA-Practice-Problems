public class NegativeCycle {
    static int v = 4;
    static int  INF = Integer.MAX_VALUE;

    // O(v^3) Time complexity
    private static boolean negCycleFolydWarshall(int graph[][]){
        int dist[][] = new int[v][v];
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                dist[i][j] = graph[i][j];
            }
        }
        
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                for(int k=0;k<v;k++){
                    if(dist[j][i] + dist[i][j] < dist[j][k]){
                        dist[j][k] = dist[j][i] + dist[i][j];
                    }
                }
            }
        }
        
        for(int i=0;i<v;i++){
            if(dist[i][i] < 0){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        /* Let us create the following weighted graph
                1
        (0)----------->(1)
        /|\              |
         |               |
      -1 |               | -1
         |              \|/
        (3)<-----------(2)
            -1     */
             

            int graph[][] = { 
                {0, 1, INF, INF},
                {INF, 0, -1, INF},
                {INF, INF, 0, -1},
                {-1, INF, INF, 0}
            };

            if (negCycleFolydWarshall(graph))
            System.out.print("Yes");
            else
            System.out.print("No");
    }
}
