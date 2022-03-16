//2. Записать 100000 элементов в массив java.util.ArrayList. Вывести на экран эти 100000 элементов.
// Замерить время на запись и чтение.

package com.blockwit.learn1.mrserg86;

import java.util.*;

public class TestArrayList {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        Date startOfRecording = new Date();
        for(int i = 1; i <= 100000; i++) {
            list.add(i);
        }
        Date finishOfRecording = new Date();
        System.out.print("Время на запись: ");
        System.out.println(finishOfRecording.getTime() - startOfRecording.getTime());

        Date startOfReading = new Date();
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        Date finishOfReading = new Date();
        System.out.println("Время на чтение: ");
        System.out.println(finishOfReading.getTime() - startOfReading.getTime());
    }

}
