package com.nzavod.objectOrientedProgramming;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarMain {
    public static void main(String[] args) throws IOException {

        Car car = new Car(12,6);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            System.out.println("1 Количество толива");
            System.out.println("2 Расстояние от начала координат");
            System.out.println("3 Сколько возможно проехать на остатке бензина");
            System.out.println("4 Проехать х миль");
            System.out.println("5 Заправить х галлонов");
            System.out.println("Прочее - выход");
            int i = Integer.parseInt(reader.readLine());
            if(i == 1){
                System.out.println();
                System.out.println(car.getQuantityOfGasolineInGallons());
                System.out.println();
            }
            else if(i == 2){
                System.out.println();
                System.out.println(car.getDistanceFromTheOrigin());
                System.out.println();

            }
            else if(i == 3){
                System.out.println();
                System.out.println(car.possibleDistance());
                System.out.println();
            }
            else if(i == 4){
                System.out.println();
                System.out.println("Введите количество миль");
                int mills = Integer.parseInt(reader.readLine());
                car.moving(mills);
            }
            else if(i == 5){
                System.out.println();
                System.out.println("Введите количество галлонов");
                int gallons = Integer.parseInt(reader.readLine());
                car.addGasoline(gallons);
            }
            else {
                break;
            }
        }
    }
}
