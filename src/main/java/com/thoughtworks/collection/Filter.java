package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
        throw new NotImplementedException();
    }

    public List<Integer> filterMultipleOfThree() {
        throw new NotImplementedException();
    }
}
