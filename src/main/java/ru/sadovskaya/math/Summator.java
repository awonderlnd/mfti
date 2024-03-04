package ru.sadovskaya.math;

import java.util.ArrayList;
import java.util.List;

public class Summator {
    public static double getSum(Number... nums) {
        ArrayList<Number> numsArrayList = new ArrayList<>(List.of(nums));
        double totalSum = 0;
        for (Number num : numsArrayList) {
            totalSum += num.doubleValue();
        }
        return totalSum;
    }
}
