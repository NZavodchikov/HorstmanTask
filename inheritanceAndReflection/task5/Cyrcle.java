package com.nzavod.inheritanceAndReflection.task5;

import com.nzavod.inheritanceAndReflection.task3.Point;
import com.nzavod.inheritanceAndReflection.task5.Shape;

public class Cyrcle extends Shape{
    private double radius;

    public Cyrcle(Point center, double radius) {
        super(center);
        this.radius = radius;
    }

    @Override public Point getCenter() {
        return point;
    }
    public Cyrcle clone(){
        return new Cyrcle(point, radius);
    }

}
