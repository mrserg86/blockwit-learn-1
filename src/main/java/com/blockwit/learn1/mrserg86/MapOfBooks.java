//4. Написать класс Book. В классе должны быть поля: name - название книги и ISBN - уникальный идентификатор книги.
//   Создать 6 книг и записать их в HashMap. Где, ключ - ISBN, а значение - сама книга.

package com.blockwit.learn1.mrserg86;

import java.util.*;

public class MapOfBooks {

    public static void main(String[] args) {

        Book book1 = new Book("Strugackie", 654321);
        Book book2 = new Book("Bradbarry", 123456);
        Book book3 = new Book("Gugo", 456789);
        Book book4 = new Book("Tolstoy", 987654);
        Book book5 = new Book("Biblia", 123789);
        Book book6 = new Book("Gauf", 987321);

        Map<Integer, Book> books = new HashMap();
        books.put(book1.getISBN(), book1);
        books.put(book2.getISBN(), book2);
        books.put(book3.getISBN(), book3);
        books.put(book4.getISBN(), book4);
        books.put(book5.getISBN(), book5);
        books.put(book6.getISBN(), book6);

    }

}
