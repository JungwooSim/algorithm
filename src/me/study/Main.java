package me.study;

import me.study.binary_search.BinarySearch;
import me.study.breadth_first_search.BreadthFirstSearch;
import me.study.dijkstra_algorithm.DijkstraAlgorithm;
import me.study.dynamicprogramming.DynamicProgramming;
import me.study.greedy_algorithm.GreedyAlgorithm;
import me.study.merge_sort.MergeSort;
import me.study.quick_sort.QuickSort;
import me.study.recursivecall.RecursiveCall;
import me.study.sequential_search.SequentialSearch;
import me.study.spanning_Tree.KruskalAlgorithm;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] data = {3,2,1,9,8,6,4,7};

        ArrayList<Integer> dataList = new ArrayList<>();
        dataList.add(3);dataList.add(2);dataList.add(1);dataList.add(9);dataList.add(8);dataList.add(6);dataList.add(4);dataList.add(7);

        /*
        Bubble Sort
         */
//        BubbleSort bubbleSort = new BubbleSort(data);
//        System.out.println("before : " + bubbleSort);
//        bubbleSort.bubble();
//        System.out.println("after : " + bubbleSort);

        /*
        Selection Sort
         */
//        SelectionSort selectionSort = new SelectionSort(data);
//        System.out.println("before : " + selectionSort);
//        selectionSort.selection();
//        System.out.println("after : " + selectionSort);

        /*
        Insertion Sort
         */
//        InsertionSort insertionSort = new InsertionSort(data);
//        System.out.println("before : " + insertionSort);
//        insertionSort.insertion();
//        System.out.println("after : " + insertionSort);

        /*
        Recursive Call
         */
        RecursiveCall recursiveCall = new RecursiveCall(data);
//        System.out.println("예제1. Factorial");
//        recursiveCall.recursive();
//        System.out.println("----------");
//        System.out.println("예제2. 1부터 n 까지의 곱을 출력되게 만들기");
//        System.out.println(recursiveCall.multiple(3));
//        System.out.println("----------");
//
//        System.out.println("예제3. 숫자가 들어 있는 리스트가 주어졌을 때, 리스트의 합을 리턴하는 함수 만들기");
//        ArrayList<Integer> sumListData = new ArrayList<>();
//        for (int i=0; i<100; i++) {
//            sumListData.add(i);
//        }
//        System.out.println(recursiveCall.sumList(sumListData));
//        System.out.println("----------");
//
//        System.out.println("예제4. palindrome(회문)을 판별하는 함수 만들기");
//        String name = "level";
//        System.out.println(recursiveCall.palindrome(name));
//        System.out.println("----------");
//        System.out.println("예제5. 정수 n에 대하여, n이 홀수이면 3 X n + 1 을 하고 n이 짝수이면 n / 2를 한다. 이렇게 계속 진행하여 n 이 결국 1 이 될 때까지 반복한다.예제5. 정수 n에 대하여, n이 홀수이면 3 X n + 1 을 하고 n이 짝수이면 n / 2를 한다. 이렇게 계속 진행하여 n 이 결국 1 이 될 때까지 반복한다.예제5. 정수 n에 대하여, n이 홀수이면 3 X n + 1 을 하고 n이 짝수이면 n / 2를 한다. 이렇게 계속 진행하여 n 이 결국 1 이 될 때까지 반복한다.예제5. 정수 n에 대하여, n이 홀수이면 3 X n + 1 을 하고 n이 짝수이면 n / 2를 한다. 이렇게 계속 진행하여 n 이 결국 1 이 될 때까지 반복한다.");
//        recursiveCall.example_5(3);
//        System.out.println("----------");
//        System.out.println("예제6. 정수 4를 1, 2, 3의 조합으로 나타내는 방법은 다음과 같이 총 7가지가 있다.");
//        System.out.println("1+1+1+1");
//        System.out.println("1+1+2");
//        System.out.println("1+2+1");
//        System.out.println("2+1+1");
//        System.out.println("2+2");
//        System.out.println("1+3");
//        System.out.println("3+1");
//        System.out.println("정수 n 이 입력으로 주어졌을 때, n을 1, 2, 3의 합으로 나타낼 수 있는 방법의 수를 구하시오.");
//        System.out.println(recursiveCall.example_6(4));

        /*
        DynamicProgramming
         */
//        DynamicProgramming dynamicProgramming = new DynamicProgramming();
//        System.out.println("fibonacciSequence With RecursiveCall : " + dynamicProgramming.fibonacciSequence(10));
//        System.out.println("fibonacciSequence With DynamicProgramming : " + dynamicProgramming.fibonacciSequence_DP(10));

        /*
        Quick Sort
         */
//        ArrayList<Integer> dataList = new ArrayList<>();
//        QuickSort quickSort = new QuickSort();
//        System.out.println("before : " + dataList);
//        System.out.println("after : " + quickSort.quick(dataList));

        /*
        Merge Sort
         */
//        MergeSort mergeSort = new MergeSort();
//        System.out.println("before : " + dataList);
//        System.out.println("after : " + mergeSort.split(dataList));

        /*
        Binary Search
         */
//        BinarySearch binarySearch = new BinarySearch();
//        Integer[] sortedData = {1,2,3,4,5,6,7,8,9,10};
////        System.out.println(binarySearch.binary(sortedData, 10));
//        for (Integer value : sortedData) {
//            System.out.println(binarySearch.binary(sortedData, value));
//        }
        /*
        Sequential Search
         */
//        SequentialSearch sequentialSearch = new SequentialSearch();
//        System.out.println(sequentialSearch.sequential(data, 3));

        /*
        Breadth First Search - BFS
         */
//        BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch();
//        breadthFirstSearch.setData();
//        breadthFirstSearch.BFS();

        /*
        Greedy Algorithm
         */
//        GreedyAlgorithm greedyAlgorithm = new GreedyAlgorithm();
//        greedyAlgorithm.coinProblem();
//        greedyAlgorithm.fractionalKnapsackProblem();
        /*
        Dijkstra Algorithm
         */
//        DijkstraAlgorithm dijkstraAlgorithm = new DijkstraAlgorithm();
//        dijkstraAlgorithm.setData();
//        dijkstraAlgorithm.dijkstra();

        /*
        Kruskal Algorithm
         */
        KruskalAlgorithm kruskalAlgorithm = new KruskalAlgorithm();
        kruskalAlgorithm.makeGraph();
    }
}
