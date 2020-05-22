package me.study.breadth_first_search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

import static java.util.Arrays.asList;

public class BreadthFirstSearch {

    HashMap<String, ArrayList<String>> graph = new HashMap<>();
    Queue visitedQueue = new LinkedList<>();
    Queue needVisitedQueue = new LinkedList<>();

    public void setData() {
        graph.put("A", new ArrayList<>(asList("B", "C")));
        graph.put("B", new ArrayList<>(asList("A", "D")));
        graph.put("C", new ArrayList<>(asList("A", "G", "H", "I")));
        graph.put("D", new ArrayList<>(asList("B", "E", "F")));
        graph.put("E", new ArrayList<>(asList("D")));
        graph.put("F", new ArrayList<>(asList("D")));
        graph.put("G", new ArrayList<>(asList("C")));
        graph.put("H", new ArrayList<>(asList("C")));
        graph.put("I", new ArrayList<>(asList("C","J")));
        graph.put("J", new ArrayList<>(asList("I")));
    }

    public void BFS() {
        String startNode = "A";
        needVisitedQueue.add("A");
        ArrayList<String> visitedNode = new ArrayList<>();

        Integer count = 0;
        // 노드를 순차적으로 방문.
        while(needVisitedQueue.size() != 0) {
            String needNode = needVisitedQueue.poll().toString();

            // 방문이 필요한 노드 설정
            if (graph.get(needNode) != null) {
                for (String node : graph.get(needNode)) {
                    needVisitedQueue.add(node);
                }
                graph.remove(needNode);
            }

            // 방문 했던 노드 체크
            if (!visitedNode.contains(needNode)) {
                visitedQueue.add(needNode);
            }

            visitedNode.add(needNode);
            count++;
        }

        System.out.println("count : " + count);
        System.out.println("VisitedQueue : " + visitedQueue);
    }
}
