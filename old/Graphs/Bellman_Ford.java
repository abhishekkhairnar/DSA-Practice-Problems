class Bellman_Ford {
    public static class Graph{
        class Edge{
            private int src;
            private int dest;
            private int weight;
            Edge(){
                src=dest=weight=0;
            }
        }
        private int V;
        private int E;
        private Edge edge[];
        Graph(int v,int e){
            V = v;
            E = e;
            edge = new Edge[V];
            for(int i=0;i<V;i++){
                edge[i] = new Edge();
            }
        }
        public void bellman_ford(int source, Graph graph){
            int v = graph.V;
            int e = graph.E;
            int dist[] = new int[v];
            for(int i=0;i<v;i++){
                dist[i] = Integer.MAX_VALUE; // assigning infinity to all of the vertices
            }
            dist[source] = 0;
            
            for(int i=1;i<v;i++){
                for(int j=0;j<e;j++){
                    int u = graph.edge[j].src;
                    int v2 = graph.edge[j].dest;
                    int w = graph.edge[j].weight;
                    if(dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[v2]){
                        dist[v2] = dist[u] + w;
                    }
                }
            }

            // check for negative weight cycle in graph
            for(int j=1;j<e;j++){
                int u = graph.edge[j].src;
                int v2 = graph.edge[j].dest;
                int w = graph.edge[j].weight;
                if(dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[v2]){
                    System.out.println("Graph contains negative weight cycle");
                    return;
                }
            }
            printArr(dist, v);
        }
        void printArr(int dist[], int V)
        {
            System.out.println("Vertex Distance from Source");
            for (int i = 0; i < V; ++i)
                System.out.println(i + "\t\t" + dist[i]);
        }
        
    }
    static void makeGraph(){
        Graph graph = new Graph(5, 8);
        graph.edge[0].src = 0;
        graph.edge[0].dest = 1;
        graph.edge[0].weight = -1;
  
        graph.edge[1].src = 0;
        graph.edge[1].dest = 2;
        graph.edge[1].weight = 4;
  
        graph.edge[2].src = 1;
        graph.edge[2].dest = 2;
        graph.edge[2].weight = 3;
  
        graph.edge[3].src = 1;
        graph.edge[3].dest = 3;
        graph.edge[3].weight = 2;
  
        graph.edge[4].src = 1;
        graph.edge[4].dest = 4;
        graph.edge[4].weight = 2;
  
        graph.edge[5].src = 3;
        graph.edge[5].dest = 2;
        graph.edge[5].weight = 5;
  
        graph.edge[6].src = 3;
        graph.edge[6].dest = 1;
        graph.edge[6].weight = 1;
  
        graph.edge[7].src = 4;
        graph.edge[7].dest = 3;
        graph.edge[7].weight = -3;
        
        graph.bellman_ford(0, graph);
    }
    public static void main(String[] args) {
        makeGraph();
    }
}
