package com.nzavod.interfacesandlambda.task9;

import com.nzavod.interfacesandlambda.task9.Greeter;

public class Main {
    public static void main(String[] args) {
        Greeter greeter = new Greeter("Kola", 7);
        Greeter greeter1 = new Greeter("Yula", 10);
        Thread thread = new Thread(greeter);
        Thread thread1 = new Thread(greeter1);
        thread.start();
        thread1.start();
    }
}
