public class PassObject {
    static void f(Number m) {// Phương thức f nhận một tham số là đối tượng Number
        m.i = 15;//thuộc tính i của đối tượng m được gán giá trị 15
    }
    public static void main(String[] args) {
        Number n = new Number();//Tạo một đối tượng n từ lớp Number 
        n.i = 14;//gán giá trị 14 cho thuộc tính i
        f(n); // what is n.i now? n.i = 15(Khi n được truyền vào phương thức f, đối tượng m trong phương thức f tham chiếu đến cùng một đối tượng mà n đang tham chiếu. Do đó, khi m.i được gán giá trị 15 bên trong phương thức f, thuộc tính i của đối tượng n cũng sẽ thay đổi thành 15).
    }
}
