//TaskS8T1 1. Написать класс MyIntArrayList. Этот класс будет представлять собой список. Этот класс должен иметь методы:
//add - добавляет элемент в конец списка. Возвращает индекс, по которому элемент добавлен.
//get - получает индекс и возвращает соответствующий индексу элемент.
//size - возращает длину списка.
//clear - очищает список

package com.blockwit.learn1.mrserg86;

public class MyIntArrayList {

    private int count = 0;
    private int[] elements = new int[3];

    public void add(int nextElementOfCollection) {
        elements[count] = nextElementOfCollection;
        count++;
        if (count == elements.length - 1) {
            int[] elements1 = new int[elements.length + 2];
            for (int k = 0; k <= elements.length - 1; k++) {
                elements1[k] = elements[k];
            }
            elements = elements1;
        }
    }

    public int get(int index) {
        return elements[index];
    }



    public void clear(int n) {
        int[] elements2 = new int[elements.length - 1];
        for (int m = 0; m < n; m++) {
            elements2[m] = elements[m];
        }
        for (int l= n; l <= elements.length - 2; l++) {
            elements2[l] = elements[l + 1];
        }
        count--;
        elements = elements2;
    }

    public int size() {
        return elements.length;
    }

}
