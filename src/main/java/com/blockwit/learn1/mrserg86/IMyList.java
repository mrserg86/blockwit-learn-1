// Написать интерфейс для списка MyArrayList (который реализовали в 8-ой задаче).
// В интерфейсе должны быть методы: size, get, add.

package com.blockwit.learn1.mrserg86;

public interface IMyList {

    public void add(int nextElementOfCollection);

    public int get(int index);

    public int size();

}
