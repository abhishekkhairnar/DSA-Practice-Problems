import java.util.*;
import java.util.LinkedList;

public class BFS {
    class Graph{
        private int V;
        private LinkedList<Integer> adj[];
        Graph(int v){
            V = v;
            for (int j = 0; j < v; j++) {
                adj[j] = new LinkedList();
            }
        }
        public void addEdge(int v,int w){
            adj[v].add(w);
        }

        public void breadthFirstSearch(int source){
            boolean visited[] = new boolean[V]; // visited array
            LinkedList<Integer> queue = new LinkedList<>(); // queue to maintain order
            visited[source] = true;
            queue.add(source);
            while(!queue.isEmpty()){
                source = queue.poll();
                System.out.print(source+" ");
                Iterator<Integer> it = adj[source].listIterator();
                while(it.hasNext()){
                    int n = it.next();
                    if(!visited[n]){
                        visited[n] = true;
                        queue.add(n);
                    }
                }
            }
        }
    }    
    public static void main(String args[])
    {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println(
            "Following is Breadth First Traversal "
            + "(starting from vertex 2)");
 
        g.breadthFirstSearch(2);
    }
}
