import java.util.LinkedList;

public class Graphs {
    private int v;
    private LinkedList<LinkedList<Integer>> adj;
    @SuppressWarnings("unchecked")
    Graphs(int v){
        this.v = v;
        adj = new LinkedList<>();
        for (int i = 0; i < v; i++) {
            adj.add(new LinkedList<>());
        }
    }
    public void addEdge(int source,int destination){
        adj.get(source).add(destination);
    }
    // check if directed graph contains cycle or not
    public boolean isCyclic(){
        boolean visited[] = new boolean[v];
        boolean recStack[] = new boolean[v];
        
        for (int i = 0; i < v; i++) {
            if(isCyclicUtil(i,visited,recStack))
                return true;
        }
        return false;
    }
    private boolean isCyclicUtil(int i, boolean[] visited, boolean[] recStack) {
        if(recStack[i]) return true;
        if(visited[i]) return true;
        visited[i] = true;
        recStack[i] = true;
        LinkedList<Integer> children = adj.get(i);
        for(Integer child : children){
            if(isCyclicUtil(child, visited, recStack)){
                return true;
            }
        }
        recStack[i] = false;
        return false;
    }
    public static void main(String[] args) {
        Graphs g = new Graphs(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        // Back Edge
        g.addEdge(3, 3);

        System.out.println(g.isCyclic());

    }
}
