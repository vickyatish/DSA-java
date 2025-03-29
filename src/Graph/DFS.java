package Graph;
import java.util.*;

public class DFS {
    public static void DFS(Map<Integer, List<Integer>> adj_list, int start){
        Set<Integer> visited = new HashSet<>();
        dfsUtil(adj_list, start, visited);
    }

    public static void dfsUtil(Map<Integer, List<Integer>> adj_list, int node, Set<Integer> visited){
        visited.add(node);
        System.out.println(node);

        List<Integer> neighbours = adj_list.getOrDefault(node, Arrays.asList());
        for(Integer neighbour : neighbours){
            if(!visited.contains(neighbour)){
                dfsUtil(adj_list, neighbour, visited);
            }
        }
    }

    public static void main(String[] args) {
        Map<Integer, List<Integer>> adjList = new HashMap<>();

        // Initialize the graph structure
        adjList.put(0, Arrays.asList(1, 2));
        adjList.put(1, Arrays.asList(3));
        adjList.put(2, Arrays.asList(4));
        adjList.put(3, new ArrayList<>());  // Empty list for node 3
        adjList.put(4, Arrays.asList(0));

        System.out.print("DFS starting from node 0: ");
        DFS(adjList, 0);
    }
}
