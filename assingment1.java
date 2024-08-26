public class Number { // tạo lớp number
    public int i;// tạo thuộc tính i có kiểu số nguyên 
}
public class Assignment1 { // tạo lớp assigment
    public static void main(String[] args) { //hàm main
        Number n1 = new Number(); // khởi tạo đối tượng n1 có kiểu Number
        Number n2 = new Number();// khởi tạo đối tượng n2
        n1.i = 2; // gán thuộc tính i của n1 bằng 2
        n2.i = 5;// gán thuộc tính i của n2 bằng 5
        n1.i = n2.i; // gán giá trị i của n1 bằng i của n2 và bằng 5
        n2.i = 10; // gán giá trị i của n2 bằng 10 không ảnh hưởng đến n1.i nên n1.i vẫn bằng 5
    }
}
