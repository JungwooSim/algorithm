package me.study;

import me.study.bubble_sort.BubbleSort;
import me.study.insertion_sort.InsertionSort;
import me.study.selection_sort.SelectionSort;

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
        InsertionSort insertionSort = new InsertionSort(data);
        System.out.println("before : " + insertionSort);
        insertionSort.insertion();
        System.out.println("after : " + insertionSort);
    }
}
