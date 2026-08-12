import java.util.*;
public class day65 {
    public static void main(String[] args) {
    Set<String> visited = new HashSet<>();
    dfs("A", visited);
    }
    static Map<String, List<String>> graph = new HashMap<>();

    static {
        graph.put("A", Arrays.asList("B", "C"));
        graph.put("B", Arrays.asList("A", "D", "E"));
        graph.put("C", Arrays.asList("A", "F"));
        graph.put("D", Arrays.asList("B"));
        graph.put("E", Arrays.asList("B", "F"));
        graph.put("F", Arrays.asList("C", "E"));
    }
    static void dfs(String node, Set<String> visited) {
        if (visited.contains(node)) {
            return;
        }
        visited.add(node);
        System.out.println(node);
        for (String neighbor : graph.get(node)) {
            dfs(neighbor, visited);
        }
    }
}
