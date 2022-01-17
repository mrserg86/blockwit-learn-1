//s4t6
//Написать программу, которая спрашивает у пользователя четыре числа.
// А затем меняет местами первое и последнее число только если последнее больше первого. Затем выводит числа.

package com.blockwit.learn1.mrserg86;

import java.util.Scanner;

    public class s4t6 {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int[] numbers = new int[4];
            System.out.println("Введите 4 числа");
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = scan.nextInt();
            }
            if(numbers[numbers.length-1] > numbers[0]) {
                int tempNumber = numbers[numbers.length-1];
                numbers[numbers.length-1] = numbers[0];
                numbers[0] = tempNumber;
            }
            for(int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }
        }
    }