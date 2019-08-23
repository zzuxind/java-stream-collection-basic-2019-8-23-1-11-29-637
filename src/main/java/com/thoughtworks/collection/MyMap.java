package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.List;

public class MyMap {

    List<Integer> array;

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> sortFromBig() {
        throw new NotImplementedException();
    }

    public List<Integer> sortFromSmall() {
        throw new NotImplementedException();
    }
}
