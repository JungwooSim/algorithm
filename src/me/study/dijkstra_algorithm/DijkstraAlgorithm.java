package me.study.dijkstra_algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class DijkstraAlgorithm {
    Map<String, Map<String, Integer>> graph = new HashMap<>();
    Map<String, Integer> graphDetail = new HashMap<>();
    PriorityQueue<PriorityQueueStructure> priorityQueue = new PriorityQueue<>();


    // graph, start를 매게변수로 받아야 함
    public void dijkstra() {

        // 초기화
        String start = "A";

        Map<String, Integer> distances = new HashMap<>();
        int i = 0;
        for (Map.Entry<String, Map<String, Integer>> entry : graph.entrySet()) {
            if (i==0) {
                distances.put(entry.getKey(), 0);
            } else {
                distances.put(entry.getKey(), 10000); // 첫번째를 제외하곤 무한대 값을 넣어야함.
            }
            i++;
        }
        PriorityQueueStructure priorityQueueStructure = new PriorityQueueStructure();
        priorityQueueStructure.setNode(start);
        priorityQueueStructure.setDistance(0);
        priorityQueue.add(priorityQueueStructure);
        // 초기화 끝

        PriorityQueueStructure priorityQueueStructureTmp;

        while (priorityQueue.size() > 0) {
            priorityQueueStructureTmp =  priorityQueue.poll();
            Integer currentDistance = priorityQueueStructureTmp.getDistance();
            String currentNode = priorityQueueStructureTmp.getNode();

            if (distances.get(currentNode) < currentDistance) {
                continue;
            }

            for (Map.Entry<String, Integer> entry : graph.get(currentNode).entrySet()) {
                String adjacent = entry.getKey();
                int weight = entry.getValue();
                int distance = weight + currentDistance;

                System.out.println("distance : " + distance);
                System.out.println("node distance : " + distances.get(adjacent));
                System.out.println("----");

                if (distance < distances.get(adjacent)) {
                    distances.put(adjacent, distance);
                    priorityQueue.add(new PriorityQueueStructure(adjacent, distance));
                }
            }
        }
        System.out.println(distances);
    }

    public void setData() {
        graphDetail.put("B", 8);
        graphDetail.put("C", 1);
        graphDetail.put("D", 2);
        graph.put("A", graphDetail);

        graphDetail = new HashMap<>();
        graph.put("B", graphDetail);

        graphDetail = new HashMap<>();
        graphDetail.put("B", 5);
        graphDetail.put("D", 2);
        graph.put("C", graphDetail);

        graphDetail = new HashMap<>();
        graphDetail.put("E", 3);
        graphDetail.put("F", 5);
        graph.put("D", graphDetail);

        graphDetail = new HashMap<>();
        graphDetail.put("F", 1);
        graph.put("E", graphDetail);

        graphDetail = new HashMap<>();
        graphDetail.put("A", 5);
        graph.put("F", graphDetail);
    }
}
