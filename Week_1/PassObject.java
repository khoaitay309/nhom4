public class PassObject {
    static void f(Number m) {
        m.i = 15;
    }
    public static void main(String[] args) {
    Number n = new Number();
    n.i = 14; // gán giá trị cho n.i  bằng 14
    f(n); // gọi hàm f
    // thay đổi giá trị n.i bằng 15

    }
}