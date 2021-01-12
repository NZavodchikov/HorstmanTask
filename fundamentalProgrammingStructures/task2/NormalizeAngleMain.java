package com.nzavod.fundamentalProgrammingStructures.task2;


public class NormalizeAngleMain {
    public static void main(String[] args) {
        System.out.println("Введите угол");
        int angle = NormalizeAngle.readAngle();
        System.out.println("Нормализованный:");
        System.out.println(NormalizeAngle.normalize(angle));
        System.out.println("Нормализованный floorMode:");
        System.out.println(NormalizeAngle.normalizeFloorMod(angle));

    }
}
