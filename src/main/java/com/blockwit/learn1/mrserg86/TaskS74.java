package com.blockwit.learn1.mrserg86;



public class TaskS74 {
    public static void main(String[] args) {
        ProtoList1 array1 = new ProtoList1();       //создание объекта
        ProtoList1 array2 = new ProtoList1();
        array1.create(7);
        array2.create(3);                       //вызвал метод и передал размер массива
        int[] a1 = array1.array;
        int[] a2 = array2.array;
        System.out.println(array1.getSize());
        //System.out.println(array2.getSize(a2));
        //System.out.println(array1.getIndex(a1, 4));
        //System.out.println(array2.getIndex(a2, 1));
    }
}
