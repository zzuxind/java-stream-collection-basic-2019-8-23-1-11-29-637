package com.thoughtworks.collection;

import java.util.Collections;
import java.util.List;

public class MyMap {

    List<Integer> array;

    public MyMap(List<Integer> array) {

        this.array = array;
    }

    //从大到小排序
    public List<Integer> sortFromBig() {

        Collections.reverse(array);
        return array;
    }

    //从小到大排序
    public List<Integer> sortFromSmall() {
        Collections.sort(array);
        return array;
    }
}
