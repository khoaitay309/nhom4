package com.mycompany.librarymanagement;

public class Librarian {
    private String employeeId;

    public Librarian(String employeeId) {
        this.employeeId = employeeId;
    }

    public void addBook(Book book) {
        System.out.println("Book added by librarian");
    }

    public void removeBook(Book book) {
        System.out.println("Book removed by librarian");
    }

    // Getter và Setter khác (nếu cần)
}
