package me.study.selection_sort;

import java.util.Arrays;

public class SelectionSort {
    int[] data;

    public SelectionSort(int[] data) {
        this.data = data;
    }

    public void selection() {
        int lowest = 0;
        int swapValue = 0;
        for (int stand = 0; stand < data.length; stand++) {
            lowest = stand;
            for (int index = stand+1; index < data.length; index++) {
                if (data[lowest] > data[index]) {
                    lowest = index; //제일 작은 값의 index

                    swapValue = data[stand];
                    data[stand] = data[lowest];
                    data[lowest] = swapValue;
                }
            }
        }
    }
    @Override
    public String toString() {
        return "data=" + Arrays.toString(data);
    }
}
