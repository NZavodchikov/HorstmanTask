package com.nzavod.fundamentalProgrammingStructures.task5;

public class DoubleToInt {
    public static void main(String[] args) {
        int maxInteger = Integer.MAX_VALUE;
        System.out.println(maxInteger);//2147483647
        double value = Integer.MAX_VALUE;
        value += 555;
        System.out.println(value);//2147484202
        int doubleToInt = (int)value;
        System.out.println(doubleToInt);//2147483647 отсекло последние разряды и вернул Integer.MAX_VALUE
    }
}
