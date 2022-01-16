//s4t2
//Написать программу, которая спрашивает у пользователя 5 имен. А затем выводит все эти имена.

package com.blockwit.learn1.mrserg86;

import java.util.Scanner;

    public class s4t2 {

        public static void main(String[] args) {

            System.out.println("Введите 5 имён");
            String[] names = new String[5];
                for (int i = 0; i < names.length; i++) {
                    Scanner scan = new Scanner(System.in);
                    names[i] = scan.nextLine();
            }
                for (int j = 0; j < names.length; j++) {
                    System.out.println(names[j]);
                }


        }

    }
