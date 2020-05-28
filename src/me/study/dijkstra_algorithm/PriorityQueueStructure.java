package me.study.dijkstra_algorithm;

public class PriorityQueueStructure implements Comparable<PriorityQueueStructure> {
    String node;

    public PriorityQueueStructure() {

    }
    public PriorityQueueStructure(String node, Integer distance) {
        this.node = node;
        this.distance = distance;
    }

    Integer distance;

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    @Override
    public int compareTo(PriorityQueueStructure target) {
        if (this.distance > target.distance) {
            return 1;
        } else if(this.distance > target.distance) {
            return -1;
        }
        return 0;
    }
}
