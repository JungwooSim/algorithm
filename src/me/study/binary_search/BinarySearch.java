package me.study.binary_search;

import java.util.Arrays;

public class BinarySearch {

    public boolean binary(Integer[] data, Integer search) {
        //  Divide and Conquer 나오는 조건
        if (data.length == 1 && search == data[0]) {
            return true;
        }

        if (data.length == 1 && search != data[0]) {
            return false;
        }

        if (data.length == 0) {
            return false;
        }

        // index는 0부터 시작이지만, length는 1부터 시작이므로 -1을 해줌
        Integer medium = data.length / 2;
        Integer[] returnData;

        if (data[medium] == search) {
            return true;
        } else {
            returnData = new Integer[medium];
            if (data[medium] < search) {
                for (Integer index = 0; index < medium; index++) {
                    returnData[index] = data[medium+index];
                }
                return binary(returnData, search);
            } else {
                for (Integer index = 0; index < medium; index++) {
                    returnData[index] = data[index];
                }
                return binary(returnData, search);
            }
        }
    }
}
