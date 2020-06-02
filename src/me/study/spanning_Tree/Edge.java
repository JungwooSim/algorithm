package me.study.spanning_Tree;

public class Edge implements Comparable<Edge> {
    private int weight;
    private String startNode;
    private String endNode;

    public Edge(int weight, String startNode, String endNode) {
        this.weight = weight;
        this.startNode = startNode;
        this.endNode = endNode;
    }


    @Override
    public int compareTo(Edge target) {
        if (this.weight > target.weight) {
            return 1;
        } else if (this.weight < target.weight) {
            return -1;
        }
        return 0;
    }
}
