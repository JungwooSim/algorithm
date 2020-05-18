package me.study.quick_sort;

import java.util.ArrayList;

public class QuickSort {
    public ArrayList<Integer> quick(ArrayList<Integer> value) {
        if (value.size() <= 1) {
            return value;
        }
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        Integer pivot = value.get(0);
        ArrayList<Integer> newList = new ArrayList<>();

        // pivot가 0이고, 오른쪽으로 비교하기 때문에 index = 1
        for (int index=1; index < value.size(); index++) {

            if (pivot >= value.get(index)) {
                left.add(value.get(index));
            } else {
                right.add(value.get(index));
            }
        }

        newList.addAll(quick(left));
        newList.add(pivot);
        newList.addAll(quick(right));
        return newList;
    }
}
