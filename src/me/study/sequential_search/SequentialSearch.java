package me.study.sequential_search;

public class SequentialSearch {

    public Integer sequential(int[] data, int search) {
        for (int index=0; index < data.length; index++) {
            if (data[index] == search) {
                return index;
            }
        }
        return -1;
    }
}
