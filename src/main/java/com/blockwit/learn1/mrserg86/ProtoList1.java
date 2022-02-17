//TaskS7T4
//Написать класс ProtoList1 в котором будет поле array типа массив целых чисел.
//Написать метод create который принимает размер и создает и присваивает полю array пустой массив целых чисел
// указанного размера.
// Написать метод getSize который возращает длину массива в поле array.
// Написать метод get, который принимает индекс и возращает элемент из массива array по указанному индексу.

package com.blockwit.learn1.mrserg86;

    public class ProtoList1{

            int[] array;

            public void create(int arraySize) {
                int[] tempArray = new int[arraySize];
                this.array = tempArray;
            }

            public int getSize() {
                return array.length;
            }

            public int get(int i) {
                return array[i];
            }

        }

