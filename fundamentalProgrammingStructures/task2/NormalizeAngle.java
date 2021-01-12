package com.nzavod.fundamentalProgrammingStructures.task2;

import java.util.Scanner;

public class NormalizeAngle {
    public static int readAngle(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static int normalize (int angle){
        if (angle % 360 != 0){
            return angle > 0 ? angle % 360 : angle % 360 + 360;
        }
        return 0;
    }
    public static int normalizeFloorMod(int angle){
        return Math.floorMod(angle%360, 360);
    }
}
