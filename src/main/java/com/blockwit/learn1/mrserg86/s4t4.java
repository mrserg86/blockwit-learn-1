//s4t4
//Написать программу, которая спрашивает, сколько у Вас друзей. А потом спрашивает имена этих друзей.
// Затем выводит имена друзей в обратном порядке.

package com.blockwit.learn1.mrserg86;

import java.util.Scanner;

    public class s4t4 {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Сколько у Вас друзей?");
            String[] friends = new String[scan.nextInt()];
            for (int i = 0; i < friends.length; i++) {
                int numberOfFriend = 1+i;
                System.out.println("Введите имя " + numberOfFriend + "-го друга");
                friends[i] = scan2.nextLine();
            }
            System.out.println("Список друзей в обратном порядке: ");
            for (int j = friends.length - 1; j >= 0; j--) {
                System.out.println(friends[j]);
            }
            scan.close();
            scan2.close();
        }

    }
