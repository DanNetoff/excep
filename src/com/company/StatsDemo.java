package com.company;

/**
 * Created by uitschool JV on 11/7/2015.
 */
public class StatsDemo {
    public static void main(String[] args) {
        Integer inums[] = {1,2,3,4,5};
        Stats<Integer> iOb= new Stats<Integer>(inums);

        Double inums2[] = {1.0,2.0,3.0,4.0,5.0};
        Stats<Double> iOb2= new Stats<Double>(inums2);

        System.out.println(iOb.average());
        System.out.println(iOb2.average());

        System.out.println(iOb.compareTo(iOb2));

    }
}
