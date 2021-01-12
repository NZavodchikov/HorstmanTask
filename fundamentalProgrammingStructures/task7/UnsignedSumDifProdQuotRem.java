package com.nzavod.fundamentalProgrammingStructures.task7;


import java.util.Scanner;

public class UnsignedSumDifProdQuotRem {
    private int a;
    private int b;
    public void read(){
        System.out.println("Введите числа");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
    }
    public String sum(){
        return Integer.toUnsignedString(a + b);
    }
    public  String dif(){
        return Integer.toUnsignedString(a - b);
    }
    public String multiply(){
        return Integer.toUnsignedString(a * b);
    }
    public String quot(){
        return Integer.toUnsignedString(Integer.divideUnsigned(a,b));
    }
    public String remaind(){
        return Integer.toUnsignedString(Integer.remainderUnsigned(a,b));
    }

}
