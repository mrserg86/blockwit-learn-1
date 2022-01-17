//s4t3
//Написать программу, которая спрашивает температуру за последние три дня, вычисляет среднюю температуру и выводит ее.

package com.blockwit.learn1.mrserg86;

import java.util.Scanner;

public class s4t3 {

    public static void main(String[] args) {

        double summOfTemperatures = 0;
        double averageTemperature = 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i < 4; i++) {
            System.out.println("Введите температуру " + i + "-го дня");
            summOfTemperatures = summOfTemperatures + scan.nextDouble();
            averageTemperature = summOfTemperatures / i;
        }
        System.out.println("Средняя температура за 3 дня: " + averageTemperature);


    }

}
