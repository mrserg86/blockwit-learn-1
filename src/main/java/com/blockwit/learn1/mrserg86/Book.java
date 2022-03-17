//4. Написать класс Book. В классе должны быть поля: name - название книги и ISBN - уникальный идентификатор книги.
//   Создать 6 книг и записать их в HashMap. Где, ключ - ISBN, а значение - сама книга.

package com.blockwit.learn1.mrserg86;

public class Book {

    private String name;

    private Integer ISBN;

    public Book(String name, Integer ISBN) {
        this.name = name;
        this.ISBN = ISBN;
    }
    public String getName() {
        return name;
    }

    public int getISBN() {
        return ISBN;
    }

}
