//TaskS7T3
//Есть два массива. Первый 7,4,2,8,6,7 и второй 6,2,9. Вывести их на экран.
//А затем создать такой массив, который вмещал бы первые два. И скопировать в новый массив элементы первых двух массивов.
//При этом элементы из первого и второго массивов должны чередоваться в новом массиве.
//Если в какой-то момент из-за нехватки элементов в одном из массивов чередовать будет нельзя,
//то копировать элементы из оставшегося массива.

package com.blockwit.learn1.mrserg86;

import static java.lang.Math.abs;

public class TaskS7T3 {

        public static void main(String[] args) {

            Helper helper = new Helper();
            int[] num1 = {7,4,2,8,6,7};
            int[] num2 = {6,2,9};
            helper.printIntArray(num1);
            helper.printIntArray(num2);
            int[] num3 = new int[num1.length + num2.length];
            int difference = abs(num1.length - num2.length);
            if(num1.length > num2.length) {
                for(int i = 0; i < num2.length * 2; i = i+2) {
                    num3[i] = num1[i/2];
                    num3[i+1] = num2[i/2];
                }
                for(int i = num2.length * 2; i < num3.length; i++) {
                    num3[i] = num1[i-difference];
                }
            }


            helper.printIntArray(num3);

        }

    }
