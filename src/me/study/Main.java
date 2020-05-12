package me.study;

import me.study.bubble_sort.BubbleSort;

public class Main {
    public static void main(String[] args) {
        // Bubble Sort
        int[] data = {3,2,1,9,8,6,4,7};
        BubbleSort bubbleSort = new BubbleSort(data);
        System.out.println("before : " + bubbleSort);
        bubbleSort.bubble();
        System.out.println("after : " + bubbleSort);
    }
}
