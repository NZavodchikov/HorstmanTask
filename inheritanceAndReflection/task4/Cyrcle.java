package com.nzavod.inheritanceAndReflection.task4;

import com.nzavod.inheritanceAndReflection.task3.Point;

public class Cyrcle extends Shape {
    private double radius;

    public Cyrcle(Point center, double radius) {
        super(center);
        this.radius = radius;
    }

    @Override public Point getCenter() {
        return point;
    }
}
