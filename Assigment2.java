public class Assignment2 {// tạo lớp asigment 2
    public static void main(String[] args) {// hàm main
        Number n1 = new Number(); // khởi tạo đối tượng n1
        Number n2 = new Number();// khởi tạo đối tượng n2
        n1.i = 2; //gán i của n1 bằng 2
        n2.i = 5;// gán i của n2 bằng 5
        n1 = n2; //n1 tham chiếu tới đối tượng mà n2 đang tham chiếu có i=5 nên n1.i = n2.i = 5
        n2.i = 10; // what is n1.i? n1.i = n2.i = 10
        n1.i = 20; // what is n2.i? n2.i = n1.i = 20
    }
}
