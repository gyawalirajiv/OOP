package com.rajiv.onlineBookReader;

import java.util.ArrayList;
import java.util.List;

public class User {

    private Long id;
    private String username;
    private String password;
    private List<Book> favoriteBooks = new ArrayList<>();

    public User(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void addBookToFavorite(Book book){
        favoriteBooks.add(book);
    }

}
