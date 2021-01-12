package com.nzavod.objectOrientedProgramming;

public final class  ImmutablePoint {
    private double x;
    private double y;

    public ImmutablePoint() {

    }

    public ImmutablePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public ImmutablePoint translate(double x, double y){
        ImmutablePoint point = new ImmutablePoint(this.x + x, this.y + y);
        return point;
    }
    public ImmutablePoint scale(double x){
        return new ImmutablePoint(this.x * x, this.y * x);
    }

    @Override public String toString() {
        return x +";" + y;
    }
}
