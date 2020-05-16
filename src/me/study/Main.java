package me.study;

import me.study.recursivecall.RecursiveCall;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] data = {3,2,1,9,8,6,4,7};
//        int[] data = {3,2,1};

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
        System.out.println("예제1. Factorial");
        recursiveCall.recursive();
        System.out.println("----------");
        System.out.println("예제2. 1부터 n 까지의 곱을 출력되게 만들기");
        System.out.println(recursiveCall.multiple(3));
        System.out.println("----------");

        System.out.println("예제3. 숫자가 들어 있는 리스트가 주어졌을 때, 리스트의 합을 리턴하는 함수 만들기");
        ArrayList<Integer> sumListData = new ArrayList<>();
        for (int i=0; i<100; i++) {
            sumListData.add(i);
        }
        System.out.println(recursiveCall.sumList(sumListData));
        System.out.println("----------");

        System.out.println("예제4. palindrome(회문)을 판별하는 함수 만들기");
        String name = "level";
        System.out.println(recursiveCall.palindrome(name));
    }
}
