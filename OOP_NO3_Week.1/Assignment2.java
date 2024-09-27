public class Assignment2 {
    public static void main(String[] args) {
    Number n1 = new Number();  // tạo đối tượng n1 cho class Number
    Number n2 = new Number();  // tạo đối tượng n2 cho class Number
    n1.i = 2; // gán giá trị n1.i bằng 2
    n2.i = 5; // gán giá trị n1.i bằng 5
    n1 = n2;   // n1 và n2 tham chiếu đến cùng 1 đối tượng
    n2.i = 10;  // thay đổi giá trị n2.i bằng 10.
    n1.i = 20;  // thay đổi giá trị n1.i bằng 20.
    }
}