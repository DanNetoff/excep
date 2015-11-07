package com.company;

/**
 * Created by uitschool JV on 11/7/2015.
 */
public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb;
        iOb = new Gen<Integer>(88);
        iOb.showObg();
        int v = iOb.getObg();

        System.out.println("Value v=" + v);

        Gen<String> strObg = new Gen<>("Generic Test");
        strObg.showObg();

        String str = strObg.getObg();

        System.out.println(str);

    }
}
