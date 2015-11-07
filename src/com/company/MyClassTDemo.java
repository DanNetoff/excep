package com.company;

/**
 * Created by uitschool JV on 11/7/2015.
 */
public class MyClassTDemo {
    public static void main(String[] args) {
        Integer inums[] = {1,2,3,4,5,6};
        Character chs[] = {'b','r','p'};

        MyClassT<Integer> iOb = new MyClassT<Integer>(inums);

        MyClassT<Character> iOb2 = new MyClassT<>(chs);

        System.out.println("Max value in nums is " + iOb.max() + " Min value " + iOb.min());

        System.out.println("Max value in nums is " + iOb2.max() + " Min value " + iOb2.min());


    }
}
