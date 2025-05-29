// clone a DAG - Directed Asyclic Graph

import java.util.ArrayList;
import java.util.Arrays;

public class CloneDAG {
    static class Node{
        int key;
        ArrayList<Node> adj = new ArrayList<Node>();
        Node(int key){
            this.key = key;
        }
    }

    static Node cloneGraph(Node oldSource, Node newSource, boolean visited[]){
        Node clone = null;
        if(!visited[oldSource.key] && !oldSource.adj.isEmpty()){
            for(Node old : oldSource.adj){
                if(clone == null || clone != null && clone.key != old.key)
                    clone = new Node(old.key);
                newSource.adj.add(clone);
                cloneGraph(old, clone, visited);
                visited[old.key] = true;
            }
        }
        return newSource;
    }
    

    public static void main(String[] args)
    {
        Node n0 = new Node(0);
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        
        n0.adj.add(n1);
        n0.adj.add(n2);
        n1.adj.add(n2);
        n1.adj.add(n3);
        n1.adj.add(n4);
        n2.adj.add(n3);
        n3.adj.add(n4);
        
        // Flag to check if a node is already visited.
        // Stops indefinite looping during recursion
        boolean visited[] = new boolean[5];
        System.out.println("Graph Before Cloning:-");
        printGraph(n0, visited);
        Arrays.fill(visited, false);
        
        System.out.println("\nCloning Process Starts");
        Node clonedGraphHead = cloneGraph(
            n0, new Node(n0.key), visited);
        System.out.println("Cloning Process Completes.");
        
        Arrays.fill(visited, false);
        System.out.println("\nGraph After Cloning:-");
        printGraph(clonedGraphHead, visited);
    }


    private static void printGraph(Node startNode, boolean[] visited) {
        if(startNode.adj.isEmpty() == false){
            for(Node i : startNode.adj){
                if(!visited[startNode.key]){
                    System.out.println("edge " + startNode +
                             "-" + i + ":" + startNode.key +
                             "-" + i.key);
                    if(!visited[i.key]){
                        printGraph(i, visited);
                        visited[i.key] = true;
                    }
                }
            }
        }
    }
}
