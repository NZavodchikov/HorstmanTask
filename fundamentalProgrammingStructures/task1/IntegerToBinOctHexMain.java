package com.nzavod.fundamentalProgrammingStructures.task1;

import java.io.IOException;

public class IntegerToBinOctHexMain {
    public static void main(String[] args) {
        try {
            int number = IntegerToBinOctHex.read();

            System.out.println("Bin:");
            System.out.println(IntegerToBinOctHex.printToBin(number));
            System.out.println("Oct:");
            System.out.println(IntegerToBinOctHex.printToOct(number));
            System.out.println("Hex:");
            System.out.println(IntegerToBinOctHex.printToHex(number));
            System.out.println("reciprocal:");
            System.out.println(IntegerToBinOctHex.printReciprocalAsHex(number));

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
