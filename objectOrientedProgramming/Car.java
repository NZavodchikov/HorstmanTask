package com.nzavod.objectOrientedProgramming;

public class Car {
    private double quantityOfGasolineInGallons;
    private double distanceFromTheOrigin;
    private double gallonsPerHundredMiles;

    public Car() {
    }

    public Car(double gallonsPerHundredMiles) {
        this.gallonsPerHundredMiles = gallonsPerHundredMiles;
    }

    public Car(double quantityOfGasolineInGallons, double gallonsPerHundredMiles) {
        this.quantityOfGasolineInGallons = quantityOfGasolineInGallons;
        this.gallonsPerHundredMiles      = gallonsPerHundredMiles;
    }

    public void moving(double distance){
        if(possibleDistance() >= Math.abs(distance)){
            distanceFromTheOrigin += distance;
            quantityOfGasolineInGallons -= Math.abs(distance) / 100 * gallonsPerHundredMiles;
        }
        else {
            System.out.println("failure");
        }
    }
    public void addGasoline(double gallons){
        quantityOfGasolineInGallons += gallons;
    }

    public double getQuantityOfGasolineInGallons() {
        return quantityOfGasolineInGallons;
    }

    public double getDistanceFromTheOrigin() {
        return distanceFromTheOrigin;
    }
    /*
    расстояние на которое хватит топлива(не от начала координат а просто как величина
     */
    public double possibleDistance(){
        return quantityOfGasolineInGallons / gallonsPerHundredMiles * 100;
    }

}
