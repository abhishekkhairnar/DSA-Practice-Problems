import java.util.LinkedList;
import java.beans.Visibility;
import java.util.ArrayList;
import java.util.Queue;
public class Graph {
    // instance variables
    private ArrayList<ArrayList<Integer>> list;
    // constructor
    Graph(){
        list = new ArrayList<ArrayList<Integer>>();
    }

    public static void main(String[] args) {
        Graph g = new Graph();
        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(1);
        ls.add(2);
        g.list.add(0, ls);
        ArrayList<Integer> ls1 = new ArrayList<>();
        ls1.add(0);
        ls1.add(2);
        ls1.add(3);
        g.list.add(1, ls1);
        ArrayList<Integer> ls2 = new ArrayList<>();
        ls2.add(0);
        ls2.add(1);
        ls2.add(3);
        ls2.add(4);
        g.list.add(2, ls2);
        ArrayList<Integer> ls3 = new ArrayList<>();
        ls3.add(1);
        ls3.add(2);
        ls3.add(4);
        g.list.add(3, ls3);
        ArrayList<Integer> ls4 = new ArrayList<>();
        ls4.add(2);
        ls4.add(3);
        g.list.add(4, ls4);
        g.bfs(4, 0);
    }
    // there is some issue with linked list
    public void bfs(int v,int s){
        boolean visited[] = new boolean[v+1];
        Queue<Integer> q = new LinkedList<Integer>();
        visited[s]=true;
        q.add(s);
        while(q.isEmpty() == false){
            int cur = q.poll();
            System.out.print(cur+" ");
            for(int v2:list.get(cur)){
                if(visited[v2]==false){
                    list.get(cur).add(v2);
                }
            }
        }
    }

    // depth first search
    public void dfs(ArrayList<ArrayList<Integer>> ls,int s,boolean visited[]){
        visited[s] = true;
        System.out.print(s+" ");
        for(int u : ls.get(s)){
            if(visited[u] == false){
                dfs(ls,u,visited);
            }
        }
    }
}
