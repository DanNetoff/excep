package com.company;

/**
 * Created by uitschool JV on 11/7/2015.
 */


public class MyClassT<T extends Comparable<T>> implements MinMax<T> {
    T[] vals;
    MyClassT(T[] o) {
        vals = o;
    }



    @Override
    public T min() {
        T v = vals[0];
        for (int i = 0; i < vals.length; i++) {
            if(vals[i].compareTo(v)<0){
                v = vals[i];
            }
        }
        return v;
    }

    @Override
    public T max() {
        T v = vals[0];
        for (int i = 0; i < vals.length; i++) {
            if(vals[i].compareTo(v)>0){
                v = vals[i];
            }
        }
        return v;
    }
}
