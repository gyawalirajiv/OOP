package com.rajiv.onlineBookReader;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class DisplaySystem {

    private Map<User, UserState> currentlyUserReadingBookList = new HashMap<>();

    public DisplaySystem() {}

    public UserState getCurrentUserState(Long userId) {
        Optional<UserState> userState = currentlyUserReadingBookList.entrySet().stream().filter(v -> v.getKey().getId() == userId).map(Map.Entry::getValue).findFirst();
        if(!userState.isPresent()) return null;
        return userState.get();
    }

    public void setBookToUser(Long userId, Book book) {
        Optional<UserState> userState = currentlyUserReadingBookList.entrySet().stream().filter(v -> v.getKey().getId() == userId).map(Map.Entry::getValue).findFirst();
        userState.get().setBook(book);
        userState.get().setPageNumber(0);
    }
}