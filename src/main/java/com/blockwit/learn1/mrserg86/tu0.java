//tu0
//Задан массив чисел 12,7,89,-4,8,9. Необходимо:
//1. Распечатать его.
//2. Отсортировать его в порядке возрастания.
//3. Распечатать еще раз.

package com.blockwit.learn1.mrserg86;

    public class tu0 {

        public static void main(String[] args) {

            Helper helper = new Helper();
            int[] array = {12, 7, 89, -4, 8, 9};
            helper.printIntArray(array);
            boolean changed = false;
            boolean isFirstIteration = true;
            while (changed || isFirstIteration) {
                changed = false;
                isFirstIteration = false;
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] > array[1 + i]) {
                        int tempNumber = array[i];
                        array[i] = array[1 + i];
                        array[1 + i] = tempNumber;
                        changed = true;

                    }
                }
            }
            helper.printIntArray(array);
        }
    }