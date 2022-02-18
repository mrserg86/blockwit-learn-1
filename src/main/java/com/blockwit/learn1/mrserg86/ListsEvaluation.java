//TaskS8T4 Найти как получить время в формате миллисекунд (unix timestamp).
// Написать класс ListsEvaluation , который содержит метод evalMyList. Который ринимает на вход пустой список из задачи 1.
// Затем наполняет список миллионом произвольных элементов и замеряет время за которое он это сделад. Затем выводит это время.

package com.blockwit.learn1.mrserg86;

import java.util.*;

public class ListsEvaluation {

    public void evalMyList(MyIntArrayList list) {
        Random ran = new Random();
        Date start = new Date();
        for (int i = 1; i <= 1000000; i++) {
            list.add(ran.nextInt());
        }
        Date finish = new Date();
        System.out.println(start.getTime() - finish.getTime());
    }

}
