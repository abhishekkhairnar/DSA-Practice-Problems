import java.util.*;
public class MST {
    public List<List<Integer>> findCriticalAndPseudoCriticalEdges(int n,int [][]edges){
        List<Integer> critical = new ArrayList<>();
        List<Integer> pseudocritical = new ArrayList<>();
        Map<int[],Integer>edgeIndexMap = new HashMap<>();
        for(int i=0;i<edges.length;i++)
        {
            edgeIndexMap.put(edges[i], i);
        }
        Arrays.sort(edges,(e1,e2)-> Integer.compare(e1[2],e2[2]));
        int minCost = MST(n,edges,null,null);
        for(int[]edge:edges){
            int excludeCost = MST(n, edges, null, edge);
            if(excludeCost > minCost){
                critical.add(edgeIndexMap.get(edge));
            }
            else{
                int includeCost = MST(n, edges, edge, null);
                if(includeCost == minCost)
                    pseudocritical.add(edgeIndexMap.get(edge));
            }
        }
        return Arrays.asList(critical,pseudocritical);

    }
    class UnionFind{
        int size;
        private int[] parents;
        UnionFind(int n){
            parents = new int[n];
            for(int i=0;i<n;i++){
                parents[i] = i;
            }
            size = n;
        }
        int find(int i){
            if(parents[i] == i) return i;
            int root = find(parents[i]);
            parents[i] = root;
            return root;
        }
        boolean union(int i,int j){
            int rooti = find(i);
            int rootj = find(j);
            if(rooti != rootj){
                parents[rooti] = rootj;
                size--;
                return true;
            }
            return false;
        }
    }

    private int MST(int n,int[][]edges,int []include,int[]exclude){
        UnionFind uf = new UnionFind(n);
        int cost=0;
        if(include!=null){
            uf.union(include[0]);
            cost += include[2];
        }
        for(int[]edge:edges){
            if(exclude != edge && uf.union(edge[0],edge[1])){
                cost += edge[2];
            }
        }
        return uf.size == 1 ? cost : Integer.MAX_VALUE;
    }
}
