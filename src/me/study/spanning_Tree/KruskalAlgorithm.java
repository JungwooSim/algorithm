package me.study.spanning_Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class KruskalAlgorithm {
    String[] vertices;
    List<Edge> edges = new ArrayList<>();
    HashMap<String, String> parent = new HashMap<>();
    HashMap<String, Integer> rank = new HashMap<>();

    public void kruskal() {

        // 1. 초기화, n개의 원소가 개별 집합을 이루도록
        for (String node : vertices) {
            rank.put(node, 0);
            parent.put(node, node); // 처음은 나 자신이 부모
        }

        // 3. Edge 연결
        for (Edge value : edges) {
            int weight = value.getWeight();
            String node_v = value.getStartNode();
            String node_u = value.getEndNode();

            if (find(node_v) != find(node_u)) {
                union(node_v, node_u);
                System.out.println("weidght : "+value.getWeight()+" / StartNode : "+value.getStartNode()+" / EndNode : "+value.getEndNode());
            }
        }
    }
    // Union-Find Algorithm 의 Union 에 해당
    public void union(String node_v, String node_u) {
        String root1;
        String root2;

        root1 = find(parent.get(node_v));
        root2 = find(parent.get(node_u));

        if (rank.get(root1) > rank.get(root2)) {
            parent.put(root2, root1);
        } else {
            parent.put(root1, root2);
            if (rank.get(root1) == rank.get(root2)) {
                rank.put(root2, rank.get(root2) + 1);
            }
        }
    }

    // Union-Find Algorithm 의 Find 에 해당
    public String find(String node) {
        if (parent.get(node) != node) {
            parent.put(node, find(parent.get(node)));
        }
        return parent.get(node);
    }
    public void makeGraph() {
        vertices = new String[]{"A", "B", "C", "D", "E", "F", "G"};
        edges.add(new Edge(5, "A", "D"));
        edges.add(new Edge(7, "B", "A"));
        edges.add(new Edge(8, "B", "C"));
        edges.add(new Edge(9, "B", "D"));
        edges.add(new Edge(7, "B", "E"));
        edges.add(new Edge(8, "C", "B"));
        edges.add(new Edge(5, "C", "E"));
        edges.add(new Edge(5, "D", "A"));
        edges.add(new Edge(9, "D", "B"));
        edges.add(new Edge(7, "D", "E"));
        edges.add(new Edge(6, "D", "F"));
        edges.add(new Edge(7, "E", "B"));
        edges.add(new Edge(5, "E", "C"));
        edges.add(new Edge(7, "E", "D"));
        edges.add(new Edge(8, "E", "F"));
        edges.add(new Edge(9, "E", "G"));
        edges.add(new Edge(6, "F", "D"));
        edges.add(new Edge(8, "F", "E"));
        edges.add(new Edge(11, "F", "G"));
        edges.add(new Edge(9, "G", "E"));
        edges.add(new Edge(11, "G", "F"));

        Collections.sort(edges); // weight 기준 정렬
    }
}
