package com.nzavod.fundamentalProgrammingStructures.task6;

import java.math.BigInteger;

public class BigIntFactorial {
    public static BigInteger factorial(int number){
        if(BigInteger.valueOf(number).equals(BigInteger.valueOf(1)))
            return BigInteger.valueOf(1);

        return BigInteger.valueOf(number).multiply(factorial(number -1));
    }

    public static void main(String[] args) {
        System.out.println(factorial(1000));
    }
}
