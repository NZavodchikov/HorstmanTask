package com.nzavod.fundamentalProgrammingStructures.task3;

public class MaximumMain {

    public static void main(String[] args) {
        Maximum maximum = new Maximum();
        maximum.readNumber();
        System.out.println("max=" + maximum.maximum());
        System.out.println("mathMax=" + maximum.maxMath());

    }

}
