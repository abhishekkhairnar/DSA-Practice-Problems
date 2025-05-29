import java.util.ArrayList;
import java.util.Scanner;

public class DetectCycle2{
    // Graph1 is using 2D matrix
    static class Graph1{
        Boolean[][] adjMat;
        // here n is number of vertices and m is number of edges
        Graph1(int n,int m){
            adjMat = new Boolean[n + 1][n + 1];
        }
        public void addEdge(Boolean[][] adjMat2, int i, int ver) {
            adjMat2[i][ver] = true;
            adjMat2[ver][i] = true;
        }
    }
    // Graph2 is using Adjacency List
    static class Graph2{
        // Adjacency List representation
        ArrayList<ArrayList<Integer>> list;
        Graph2(int v){
            list = new ArrayList<>(v);
        }
        static void addEdge(ArrayList<ArrayList<Integer>> list,int u,int v){
            list.get(u).add(v);
            // list.get(v).add(u);
            // in the undirected graph adding edge point from u to v and v to u
        }
        public void addList(int degree) {
            this.list.add(new ArrayList<>(degree));
        }
    }
    static void displayAdjMat(Graph1 g){
        for(int i=0;i<g.adjMat.length;i++){
            for(int j=0;j<g.adjMat.length;j++){
                if(g.adjMat[i][j])
                    System.out.print(1+" ");
                else
                    System.out.print(0+" ");
            }
            System.out.println();
        }
    }
    static void displayAdjList(Graph2 g){
        int it=0;
        for(ArrayList<Integer> ls : g.list){
            System.out.print(it);
            it++;
            for(Integer v : ls){
                System.out.print(" -> "+v);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose which graph you do want to make (Adjacency Matrix : A / Adjacency List : B ) : ");
        char choice = sc.next().charAt(0);
        if(choice == 'A' || choice == 'a'){
            System.out.print("Enter number of vertices : ");
            int n = sc.nextInt();
            System.out.print("Enter number of edges : ");
            int m = sc.nextInt();
            Graph1 g = new Graph1(n, m);
            for(int i=0;i<n;i++){
                System.out.print("Enter degree of vertex "+i+" : ");
                int degree = sc.nextInt();
                for(int j=0;j<degree;j++){
                    System.out.print("Add edge "+(j+1)+" from "+i+" to : ");
                    int ver=sc.nextInt();
                    if(ver >= n){
                        System.out.println("Please enter valid vertex !!!");
                    }
                    else{
                        g.addEdge(g.adjMat,i,ver);
                    }
                }
            }
            displayAdjMat(g);
        }
        else{
            System.out.print("Enter number of vertices : ");
            // here v is number of vertices
            int v = sc.nextInt();
            Graph2 g = new Graph2(v);
            for(int i = 0; i < v; i++){
                System.out.print("Enter degree of node ("+i+") : ");
                int degree = sc.nextInt();
                g.addList(degree);
                for(int j = 0; j < degree; j++){
                    System.out.print("Edge "+(j+1)+" from : "+i+" to :");
                    int node = sc.nextInt();
                    if(node >= v){
                        System.out.println("Please enter valid vertex !!!");
                    }
                    else{
                        g.addEdge(g.list, i, j);
                    }
                }
            }
            displayAdjList(g);
        }
    }
}