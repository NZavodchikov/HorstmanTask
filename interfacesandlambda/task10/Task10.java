package com.nzavod.interfacesandlambda.task10;

public class Task10 {
    public static void runTogether(Runnable... tasks){
        for(int i = 0; i < tasks.length; i++){
            new Thread(tasks[i]).start();
        }
    }public static void runlnOrder(Runnable... tasks){
        for(int i = 0; i < tasks.length; i++){
            tasks[i].run();
        }
    }


}
