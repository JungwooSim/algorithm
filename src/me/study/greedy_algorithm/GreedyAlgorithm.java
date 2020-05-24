package me.study.greedy_algorithm;

import java.util.*;

public class GreedyAlgorithm {

    public void coinProblem() {
        Integer[] coinArray = {1, 50, 100, 500};
        Integer price = 4720;
        Integer coinTotalCount = 0;

        HashMap<Integer, Integer> needsCoin = new HashMap<>();
        Arrays.sort(coinArray, Collections.reverseOrder());

        for (Integer coin : coinArray) {
            Integer coinCount = price / coin;
            coinTotalCount = coinTotalCount + coinCount;
            price -= coinCount * coin;

            needsCoin.put(coin, coinCount);
        }

        System.out.println(needsCoin);
        System.out.println("Total Coin Count : " + coinTotalCount);
    }

    public void fractionalKnapsackProblem() {
        Integer capacity = 30;
        HashMap<Integer, Float> insertItem = new HashMap<>();
        Float totalValue = 0f;

        HashMap<Integer, Integer> item = new HashMap<>();
        HashMap<Integer, Float> itemValue = new HashMap<>();
        item.put(10, 10);
        item.put(15, 12);
        item.put(20, 10);
        item.put(25, 8);
        item.put(30, 5);

        // 무게 대비 가치 순으로 정렬 후 key값을 KeySetList에 추가
        // KeySetList는 값으로 정렬후 key값이 순서대로 들어가게 됨
        item.forEach( (key, value)
            -> itemValue.put(key, (float) value / key)
        );
        List<Integer> keySetList = new ArrayList<>(itemValue.keySet());
        Collections.sort(keySetList, (o1, o2) -> (itemValue.get(o2).compareTo(itemValue.get(o1))));

        for (Integer index : keySetList) {
            if (capacity >= index) {
                capacity -= index;
                insertItem.put(index, 1f);
                totalValue += item.get(index);
            } else {
                Float fraction = (float) capacity / index;
                insertItem.put(index, fraction);
                totalValue += item.get(index) * fraction;
                break;
            }
        }
        System.out.println("총 가치 : " + totalValue);
        System.out.println("item 넣은 양(쪼개기 때문에 소수가 나올 수 있음) : " + insertItem);
    }
}
