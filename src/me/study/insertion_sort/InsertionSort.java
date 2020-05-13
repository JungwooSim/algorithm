package me.study.insertion_sort;

import java.util.Arrays;

public class InsertionSort {
    int[] data;

    public InsertionSort(int[] data) {
        this.data = data;
    }
    public void insertion() {
        int swapValue;
        for (int i = 0; i < data.length; i++) {
            for (int j = i; j > 0; j--) {
                if (data[j] < data[j-1]) {
                    swapValue = data[j-1];
                    data[j-1] = data[j];
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
