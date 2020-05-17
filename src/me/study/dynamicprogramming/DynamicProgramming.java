package me.study.dynamicprogramming;

import java.util.ArrayList;

public class DynamicProgramming {

    /*
    recursive call 활용
     */
    public Integer fibonacciSequence(Integer value) {
        if (value <= 1) {
            return value;
        }
        return fibonacciSequence(value - 1) + fibonacciSequence(value - 2);
    }
    /*
    DynamicProgramming 활용
    Fibonacci sequence 보다 시간 복잡도가 우수하다.
     */
    public Integer fibonacciSequence_DP(Integer value) {
        ArrayList<Integer> cache = new ArrayList<>();
        cache.add(0, 0);
        cache.add(1, 1);

        // Memorization 기법
        for (int index = 2; index <= value+1; index++) {
            cache.add(index, cache.get(index-1) + cache.get(index-2));
        }

        return cache.get(value);
    }
}
