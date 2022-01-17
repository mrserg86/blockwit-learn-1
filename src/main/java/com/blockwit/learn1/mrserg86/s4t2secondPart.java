//s4t2
//Написать программу, которая спрашивает имена и года рождения 4 людей. После этого выводит имена и кол-во лет.

package com.blockwit.learn1.mrserg86;

import java.util.Scanner;

public class s4t2secondPart {

    public static void main(String[] args) {

        String[] names = new String[4];
        int[] ages = new int[4];
        Scanner scanName = new Scanner(System.in);
        Scanner scanYear = new Scanner(System.in);
        for (int i = 0; i < names.length; i++) {
            System.out.println("Введите имя " + i + " -го человека");
            names[i] = scanName.nextLine();
            System.out.println("Введите год рождения " + i + " -го человека");
            ages[i] = 2022 - scanYear.nextInt();
        }
        for (int j = 0; j < names.length; j++) {
            System.out.println("Человеку по имени " + names[j] + "  " + ages[j] + " лет");
        }


    }

}
