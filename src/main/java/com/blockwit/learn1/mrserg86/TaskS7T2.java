//TaskS7T2
//Есть два массива. Первый 6,3,8,9 и второй 0,3,1,5. Вывести их на экран.
//А затем создать такой массив, который вмещал бы первые два. И скопировть в новый массив элементы первых двух массивов.
//При этом элементы из первого и второго массивов должны чередоваться в новом массиве.

package com.blockwit.learn1.mrserg86;

        public class TaskS7T2 {

            public static void main(String[] args) {

                Helper helper = new Helper();
                int[] num1 = {6,3,8,9};
                int[] num2 = {0,3,1,5};
                helper.printIntArray(num1);
                helper.printIntArray(num2);
                int[] num3 = new int[num1.length + num2.length];
                for(int i = 0; i < num3.length; i = i+2) {
                    num3[i] = num1[i/2];
                    num3[i+1] = num2[i/2];
                }
                helper.printIntArray(num3);

            }

        }
