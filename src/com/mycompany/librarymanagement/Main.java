package com.mycompany.librarymanagement;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Thiết lập tên đăng nhập và mật khẩu mặc định
        String correctUsername = "admin";
        String correctPassword = "admin";

        // Tạo JPanel chứa 2 trường nhập tên đăng nhập và mật khẩu
        JPanel panel = new JPanel(new GridLayout(2, 2));
        JLabel userLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField();
        JLabel passLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();

        panel.add(userLabel);
        panel.add(usernameField);
        panel.add(passLabel);
        panel.add(passwordField);

        // Hiển thị hộp thoại đăng nhập
        int result = JOptionPane.showConfirmDialog(null, panel, "Login", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (result == JOptionPane.OK_OPTION) {
            String enteredUsername = usernameField.getText();
            String enteredPassword = new String(passwordField.getPassword());

            // Kiểm tra tên đăng nhập và mật khẩu
            if (correctUsername.equals(enteredUsername) && correctPassword.equals(enteredPassword)) {
                // Nếu đúng, tiếp tục chương trình
                Library library = new Library("Central Library", "123 Library Street");
                Librarian librarian = new Librarian("EMP123");

                Book book1 = new Book("Java Programming", "Author A", "ISBN12345");

                // Thêm các thành viên mới với tên mong muốn
                Member member1 = new Member("MEM001", "Le Manh Dung", "dung@example.com");
                Member member2 = new Member("MEM002", "Nguyen Van Hieu", "hieu@example.com");

                library.addBook(book1);
                library.registerMember(member1);
                library.registerMember(member2);

                // Hiển thị thông tin thư viện và các thành viên
                JOptionPane.showMessageDialog(null,
                        "Login successful!\n\n" +
                                "Library name: " + library.getName() +
                                "\nMember 1 name: " + member1.getName() +
                                "\nMember 2 name: " + member2.getName());
            } else {
                // Nếu sai, thông báo lỗi
                JOptionPane.showMessageDialog(null, "Login failed! Incorrect username or password.");
            }
        } else {
            // Nếu người dùng nhấn Cancel hoặc đóng hộp thoại
            JOptionPane.showMessageDialog(null, "Login canceled.");
        }
    }
}
