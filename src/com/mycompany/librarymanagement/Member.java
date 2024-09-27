package com.mycompany.librarymanagement;

public class Member {
    private String memberId;
    private String name;
    private String email;

    public Member(String memberId, String name, String email) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
    }

    // Thêm phương thức getName()
    public String getName() {
        return name;
    }

    public void borrowBook(Book book) {
        book.checkOut();
    }

    public void returnBook(Book book) {
        book.returnBook();
    }
}
