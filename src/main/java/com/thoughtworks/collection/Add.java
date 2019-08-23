package com.thoughtworks.collection;

import java.util.List;

public class Add {
    //求leftBorder 和rightBorder之间的偶数和
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int sum=0;
        for(int number=Math.min(leftBorder,rightBorder);number<=Math.max(leftBorder,rightBorder);number++){
            if(number%2 == 0){
                sum+=number;
            }
        }
        return sum;
    }

    //求数组中每个元素的3倍加2的和
    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int sum=0;
        for(int i:arrayList){
            sum+=i*3+2;
        }
        return sum;
    }

    //求数组中所有偶数的平均数
    public double getAverageOfEven(List<Integer> arrayList) {
        int sum=0,count=0;
        for(int i:arrayList){
            if(i%2 == 0 ){
                sum+=i;
                count++;
            }
        }
        return sum/count;
    }
}
