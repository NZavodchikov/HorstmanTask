package com.nzavod.inheritanceAndReflection.task5;

import com.nzavod.inheritanceAndReflection.task3.Point;
import com.nzavod.inheritanceAndReflection.task5.Shape;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(Point point) {
        super(point);
    }

    public Rectangle(Point topLeft, double width, double height) {
        super(topLeft);
        this.width  = width;
        this.height = height;
    }

    @Override public Point getCenter() {
        return new Point(this.point.getX() + (this.width) / 2,
                this.point.getY() -( this.height) / 2);
    }
    public Rectangle clone(){
        return new Rectangle(point,width,height);
    }
}
