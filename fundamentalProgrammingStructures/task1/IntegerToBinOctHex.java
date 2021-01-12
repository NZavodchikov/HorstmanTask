package com.nzavod.fundamentalProgrammingStructures.task1;

import java.io.IOException;
import java.util.Scanner;

public class IntegerToBinOctHex {
    public static int read() throws IOException {
        Scanner scanner = new Scanner(System.in);
        String number;
        number = scanner.next();
        return Integer.parseInt(number);
    }
    public static String printToBin(int number){
        return Integer.toBinaryString(number);
    }
    public static String printToOct(int number){
        return Integer.toOctalString(number);
    }
    public static String printToHex(int number){
        return Integer.toHexString(number);
    }
    public static String printReciprocalAsHex(int number){
        return Float.toHexString((float)1 / number);
    }
}
