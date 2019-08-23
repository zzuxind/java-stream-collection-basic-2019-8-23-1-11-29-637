package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.List;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {

        this.array = array;
    }

    //求数组中的偶数
    public List<Integer> filterEven() {
        List<Integer> evenLlist=new ArrayList<>();
        for(int i : array){
            if(i%2 == 0){
                evenLlist.add(i);
            }
        }
        return evenLlist;

    }
    //求数组中3的倍数
    public List<Integer> filterMultipleOfThree() {
        List<Integer> resultList=new ArrayList<>();
        for(int i: array){
            if(i%3 == 0){
                resultList.add(i);
            }
        }
        return resultList;

    }
}
