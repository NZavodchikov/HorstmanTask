package com.nzavod.fundamentalProgrammingStructures.task8;

import java.util.Scanner;

public class Substrings {
    public static void main(String[] args) {
        String s;
        System.out.println("введите строку");
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length()+1; j++) {
                if (!s.substring(i, j).isEmpty()) {
                    System.out.println(s.substring(i, j));
                }
            }
        }

    }
}
