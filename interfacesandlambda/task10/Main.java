package com.nzavod.interfacesandlambda.task10;

public class Main {
    public static void main(String[] args) {
        Task10.runlnOrder(() -> {
            for (int i = 0; i < 7; i++){
                System.out.println(i + "Hi" + i);
            }
        }, () -> {
            for (int i = 0; i < 7; i++) {
                System.out.println(i + "Hao" + i);
            }
        });
        Task10.runTogether(() -> {
            for (int i = 0; i < 7; i++){
                System.out.println(i + "Hi" + i);
            }
        }, () -> {
            for (int i = 0; i < 7; i++) {
                System.out.println(i + "Hao" + i);
            }
        });
    }
}
