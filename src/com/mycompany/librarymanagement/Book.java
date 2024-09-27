package com.mycompany.librarymanagement;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private String status;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.status = "available";
    }

    public void checkOut() {
        this.status = "checked out";
    }

    public void returnBook() {
        this.status = "available";
    }

    // Getter và Setter khác (nếu cần)
}
