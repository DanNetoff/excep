package com.company;

/**
 * Created by uitschool JV on 11/7/2015.
 */
public class Stats<T extends Number> {
    T[] nums;

    Stats(T[] o){
        nums = o;
    }

    double average() {
        double sum = 0.0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();

        }
        return sum;
    }

    boolean compareTo(Stats<?> iOb2) {
        double o1;
        double o2;

        o1 =average();
        o2 = iOb2.average();

        if (o1==o2){
            return  true;
        } else {
            return false;
        }

    }
}
