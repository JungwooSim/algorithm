package me.study.recursivecall;

import java.util.List;

public class RecursiveCall {
    private int[] data;

    public RecursiveCall(int[] data) {
        this.data = data;
    }

    public void recursive() {
        for (int dataValue : data) {
            System.out.println(factorial(dataValue));
        }
    }

    public int factorial(int value) {
        if (value > 1) {
            return value * factorial(value - 1);
        } else {
            return value;
        }
    }

    public int multiple(int value) {
        if (value <= 1) {
            return value;
        } else {
            return value * multiple(value - 1);
        }
    }

    public Integer sumList(List<Integer> data) {
        if (data.size() == 1) {
            return data.get(0);
        } else {
            return data.get(0) + sumList(data.subList(1, data.size()));
        }
    }

    public boolean palindrome(String name) {
        if (name.length() <= 1) {
            return true;
        }

        if (name.charAt(0) == name.charAt(name.length()-1)) {
            return palindrome(name.substring(1, name.length()-1));
        } else {
            return false;
        }
    }
}
