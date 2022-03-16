//3. Записать 100000 элементов в массив java.util.LinkedList. Вывести на экран эти 100000 элементов.
// Замерить время на запись и чтение.

package com.blockwit.learn1.mrserg86;

import java.util.*;

public class TestLinkedList {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        Date startOfRecording = new Date();
        for(int i = 1; i <= 100000; i++) {
            list.add(i);
        }
        Date finishOfRecording = new Date();
        System.out.println("Время на запись: " + (finishOfRecording.getTime() - startOfRecording.getTime()));

        Date startOfReading = new Date();
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        Date finishOfReading = new Date();
        System.out.println("Время на чтение: " + (finishOfReading.getTime() - startOfReading.getTime()));

    }

}
