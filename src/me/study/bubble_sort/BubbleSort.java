package me.study.bubble_sort;

import java.util.Arrays;

public class BubbleSort {
    int[] data;

    public BubbleSort(int[] data) {
        this.data = data;
    }

    public void bubble() {
        for (int i=0; i < data.length-1; i++) {
            for (int j=0; j< data.length-1-i; j++) {
                int swapValue;
                if (data[j] > data[j+1]) {
                    swapValue = data[j+1];
                    data[j+1] = data[j];
                    data[j] = swapValue;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "data=" + Arrays.toString(data);
    }
}
