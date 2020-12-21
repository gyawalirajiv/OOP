package com.rajiv.onlineBookReader;

import java.util.List;

public class OnlineBookReader {

    private List<Category> categoryList;
    private List<Book> books;
    private DisplaySystem displaySystem;
    private List<User> users;

    public OnlineBookReader(List<Category> categoryList, List<Book> books, List<User> users) {
        this.categoryList = categoryList;
        this.books = books;
        this.displaySystem = new DisplaySystem();
        this.users = users;
    }

    public void userWantsToRead(Long userId, Book book){
        displaySystem.setBookToUser(userId, book);
    }

}
