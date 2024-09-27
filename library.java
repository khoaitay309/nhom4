package com.mycompany.librarymanagement;

public class Main {
    public static void main(String[] args) {
        Library library = new Library("Central Library", "123 Library Street");
        Librarian librarian = new Librarian("EMP123");

        Book book1 = new Book("Java Programming", "Author A", "ISBN12345");
        Member member1 = new Member("MEM001", "John Doe", "john@example.com");

        library.addBook(book1);
        library.registerMember(member1);

        System.out.println("Library name: " + library.getName());
        System.out.println("Member name: " + member1.getName());
    }
}
