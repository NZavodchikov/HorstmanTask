package com.nzavod.fundamentalProgrammingStructures.task3;

import java.util.Scanner;

public class Maximum {
    private int number1, number2, number3;

    public void readNumber() {
        System.out.println("Введите числа");
        Scanner scanner = new Scanner(System.in);
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();
        number3 = scanner.nextInt();
    }

    public int maximum() {
        if (number1 >= number2) {
            if (number1 >= number3) {
                return number1;
            }
            else {
                return number3;
            }
        }
        else {
            if (number2 >= number3) {
                return number2;
            }
            else {
                return number3;
            }

        }
    }
    public int maxMath(){
        return number1 >= number2 ?  Math.max(number1, number3) :  Math.max(number2, number3);
    }

}
