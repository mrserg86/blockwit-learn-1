//tu1
//Написать класс Utils. Внутри него метод sort. Метод sort должен принимать на вход массив чисел.
//Метод сортирует числа внутри массива в порядке возрастания.

package com.blockwit.learn1.mrserg86;

    public class Utils {

        public void sort(int[] array) {
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
        }

    }
