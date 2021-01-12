package com.nzavod.objectOrientedProgramming;

public class ImmutablePointMain {
    public static void main(String[] args) {
        ImmutablePoint point = new ImmutablePoint(3,4).translate(1,3).scale(0.5);
        System.out.println(point);
    }
}
