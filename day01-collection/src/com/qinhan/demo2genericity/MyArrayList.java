package com.qinhan.demo2genericity;

import java.util.ArrayList;

public class MyArrayList<E>{

    private ArrayList list = new ArrayList();


    public boolean add(E e){
        list.add(e);
        return true;
    }

    public boolean remove(E e){
        return list.remove(e);
    }

    public String toString(){
        return list.toString();
    }
}
