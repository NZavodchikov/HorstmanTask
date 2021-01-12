package com.nzavod.fundamentalProgrammingStructures.task7;

public class Main {
    public static void main(String[] args) {
        UnsignedSumDifProdQuotRem unsignedSumDifProdQuotRem = new UnsignedSumDifProdQuotRem();
        unsignedSumDifProdQuotRem.read();
        System.out.println("summ:");
        System.out.println(unsignedSumDifProdQuotRem.sum());
        System.out.println("difference");
        System.out.println(unsignedSumDifProdQuotRem.dif());
        System.out.println("multiply:");
        System.out.println(unsignedSumDifProdQuotRem.multiply());
        System.out.println("quotient:");
        System.out.println(unsignedSumDifProdQuotRem.quot());
        System.out.println("remainder:");
        System.out.println(unsignedSumDifProdQuotRem.remaind());

    }
}
