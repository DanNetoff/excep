package com.company;

/**
 * Created by uitschool JV on 11/7/2015.
 */
public class Gen<T> {
    T obg;


    Gen(T o){
        obg =o;
    }

    T getObg(){
        return obg;
    }

    void showObg(){
        System.out.println("ClassClassName " + obg.getClass().getName());
    }
}
