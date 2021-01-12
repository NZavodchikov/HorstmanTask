package com.nzavod.interfacesandlambda.task1Andtask2;

public class Emploee implements Measurable {
    private String position;
    private double salary;

    public Emploee() {
    }

    public Emploee(String position, double salary) {
        this.position = position;
        this.salary   = salary;
    }



    @Override public double getMeasure() {
        return salary;
    }
    public static double average(Measurable[] array){
        double sum = 0;
        for (Measurable m: array){
            sum += m.getMeasure();
        }
        return sum/array.length;
    }
    public static Measurable largest(Measurable[] array){
        double maxSalary = 0;
        int indexMaxSalary = 0;
        int i = 0;
        for (Measurable m : array){
            if (m instanceof Emploee){
                if (maxSalary<m.getMeasure()){
                    maxSalary = m.getMeasure();
                    indexMaxSalary = i;
                }
            }
            i++;
        }
        return array[i];
    }

}
