package com.nzavod.inheritanceAndReflection.task4;

import com.nzavod.inheritanceAndReflection.task3.Point;

public class Line extends Shape {
    Point point1;

    public Line(Point point) {
        super(point);
    }

    public Line(Point from, Point to) {
        super(from);
        this.point1 = to;
    }

    @Override public Point getCenter() {
        double x = ( this.point.getX() +this.point1.getX()) / 2;
        double y = ( this.point.getY() + this.point1.getY()) / 2;
        return new Point(x, y);
    }
}
