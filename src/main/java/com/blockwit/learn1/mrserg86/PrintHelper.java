//TaskS8T2 2. Добавить в PrintHelper метод printInList, который бы распечатывал все числа списка из задачи 1.

package com.blockwit.learn1.mrserg86;

public class PrintHelper {

    public void printIntArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
        }
    }

    public void printInList(MyIntArrayList list) {
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}


