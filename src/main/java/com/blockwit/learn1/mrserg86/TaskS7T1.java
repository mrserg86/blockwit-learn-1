//TaskS7T1
//Есть два массива чисел. Первый - 9,1,5,6,8. И второй 7,3,1. Вывести их на экран.
//Затем создать такой массив, который бы умещал первые два. И скопировать туда элементы первых двух массивов.
//Вывести получный массив на экран.

package com.blockwit.learn1.mrserg86;

    public class TaskS7T1 {

        public static void main(String[] args) {

            Helper helper = new Helper();
            int[] num1 = {9,1,5,6,8};
            int[] num2 = {7,3,1};
            helper.printIntArray(num1);
            helper.printIntArray(num2);
            int[] num3 = new int[num1.length + num2.length];
            for(int i = 0; i < num1.length; i++) {
                num3[i] = num1[i];
            }
            for(int i = num1.length; i < num3.length; i++) {
                num3[i] = num2[i-num1.length];
            }
            helper.printIntArray(num3);
        }

    }
