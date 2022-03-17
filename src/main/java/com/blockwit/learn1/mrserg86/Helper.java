//tu1
//Сделать класс Helper. Внутри него метод printIntArray, который принимает массив чисел и распечатывает их.
// Переписать предыдущую задачу, так чтобы она использовала метод printIntArray.


//5. Написать в Helper функцию , которая принимает на вход ассоциативный массив из 6 книг ,
// который сделали в 4ой задаче и isbn. Функция по isbn должна возвращать книгу из полученного ассоциативного массива.


package com.blockwit.learn1.mrserg86;
import java.util.HashMap;
import java.util.Map;

    public class Helper {

        public void printIntArray(int[] array) {
            for(int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }

        public Book getBookByISBN(Map<Integer, Book> books, Integer ISBN){
            return books.get(ISBN);
        }

    }
