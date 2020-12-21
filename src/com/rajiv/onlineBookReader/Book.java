package com.rajiv.onlineBookReader;

public class Book {

    private Long id;
    private String title;
    private Author author;
    private String pdfUrl;

    public Book(Long id, String title, Author author, String pdfUrl) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.pdfUrl = pdfUrl;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public String getPdfUrl() {
        return pdfUrl;
    }
}
