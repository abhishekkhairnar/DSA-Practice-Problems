public class CyclesOfNLength {
    public static final int V = 5;
    static int count = 0;

    public static void DFS(int[][] graph, boolean[] visited,int n, int vert, int source){
        visited[vert] = true;
        if(n==0){
            visited[vert] = false;
            if(graph[vert][source] == 1){
                count++;
                return;
            }
            else{
                return;
            }
        }
        for(int i=0;i<V;i++){
            if(!visited[i] && graph[vert][i] == 1){
                DFS(graph, visited, n-1, i, source);
            }
        }
        visited[vert] = false;
    }
    public static int countCycles(int[][] graph, int n){
        boolean visited[] = new boolean[V];
        for(int i=0;i<(V-(n-1));i++){
            DFS(graph,visited,n-1,i,i);
            visited[i] = true;
        }
        return count / 2;
    }
    public static void main(String[] args) {
        int graph[][] = {{0, 1, 0, 1, 0},
                        {1, 0, 1, 0, 1},
                        {0, 1, 0, 1, 0},
                        {1, 0, 1, 0, 1},
                        {0, 1, 0, 1, 0}};
         
        int n = 4;
         
        System.out.println("Total cycles of length "+
                          n + " are "+
                          countCycles(graph, n));
    }
}
