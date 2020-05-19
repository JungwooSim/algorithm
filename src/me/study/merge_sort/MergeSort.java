package me.study.merge_sort;

import java.util.ArrayList;

public class MergeSort {

    public ArrayList<Integer> split(ArrayList<Integer> data) {
        if (data.size() <= 1) {
            return data;
        }

        Integer medium = data.size() / 2;
        ArrayList<Integer> leftSplit = new ArrayList<>();
        ArrayList<Integer> rightSplit = new ArrayList<>();

        for (int index = 0; index < data.size(); index++) {
            if (index < medium) {
                leftSplit.add(data.get(index));
            } else {
                rightSplit.add(data.get(index));
            }
        }
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        left.addAll(split(leftSplit));
        right.addAll(split(rightSplit));

        return merge(left, right);
    }

    public ArrayList<Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right) {
        ArrayList<Integer> merged = new ArrayList<>();
        Integer leftPoint = 0;
        Integer rightPoint = 0;

        // case1 : left/right 아직 남아 있을 때
        while (left.size() > leftPoint && right.size() > rightPoint) {
            if (left.get(leftPoint) > right.get(rightPoint)) {
                merged.add(right.get(rightPoint));
                rightPoint++;
            } else {
                merged.add(left.get(leftPoint));
                leftPoint++;
            }
        }

        // case2 : left 만 있을 떄
        while (left.size() > leftPoint) {
            merged.add(left.get(leftPoint));
            leftPoint++;
        }

        // case3 : right 만 있을 때
        while (right.size() > rightPoint) {
            merged.add(right.get(rightPoint));
            rightPoint++;
        }

        return merged;
    }
}
