package Graph;

import java.util.*;

public class BFS {
    public static void BFS(Map<Character, List<Character>> graph, Character start){
        Set<Character> visited = new HashSet<>();
        visited.add(start);
        System.out.print(start+" ");
        Deque<Character> queue = new ArrayDeque<>();
        queue.add(start);

        while(!queue.isEmpty()){
            Character vertex = queue.removeFirst();
            List<Character> neighbours = graph.getOrDefault(vertex, Arrays.asList());
            for(Character neighbour : neighbours){
                if (!visited.contains(neighbour)){
                    visited.add(neighbour);
                    System.out.print(neighbour+" ");
                    queue.addLast(neighbour);
                }
            }
        }

    }

    public static void main(String[] args) {
        Map<Character, List<Character>> graph = new HashMap<>();
        graph.put('A', Arrays.asList('B', 'C'));
        graph.put('B', Arrays.asList('D', 'E'));
        graph.put('C', Arrays.asList('F'));
        graph.put('D', Collections.emptyList());
        graph.put('E', Arrays.asList('F'));
        graph.put('F', Collections.emptyList());

        // Run BFS starting from node 'A'
        System.out.print("BFS traversal starting from A: ");
        BFS.BFS(graph, 'A');
    }
}
