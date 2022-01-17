//s4t5
//Написать программу, которая спрашивает у пользователя четыре числа.
// А затем меняет местами первое и последнее число и выводит все числа.

package com.blockwit.learn1.mrserg86;

import java.util.Scanner;

    public class s4t5 {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int[] numbers = new int[4];
            System.out.println("Введите 4 числа");
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = scan.nextInt();
            }
            int tempNumber = numbers[0];
            numbers[0] = numbers[3];
            numbers[3] = tempNumber;
            for (int i = 0; i < numbers.length; i++) {
                System.out.println((numbers[i]));
            }
        }

    }
