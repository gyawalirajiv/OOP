package com.rajiv.onlineBookReader;

import java.util.List;

public class Category {

    private Long id;
    private String name;
    private List<Book> books;

    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void removeBook(Long bookId){
        books.remove(bookId);
    }
}
