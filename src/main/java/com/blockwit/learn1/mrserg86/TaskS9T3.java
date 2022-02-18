//TaskS9T3 Найти как генерировать произвольное целое число.
//Сгенерированные числа добавить в список созданный на основе класса из первой задачи.
//Распечатать с помощью метода из задачи 2.

package com.blockwit.learn1.mrserg86;

import java.util.*;

public class TaskS9T3 {

    public static void main(String[] args) {

        MyIntArrayList listOfRandomInt = new MyIntArrayList();
        Random ran = new Random();
        PrintHelper printer = new PrintHelper();
        listOfRandomInt.add(ran.nextInt());
        printer.printInList(listOfRandomInt);
    }

}


