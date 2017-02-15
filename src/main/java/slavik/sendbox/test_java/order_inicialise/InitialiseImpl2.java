package slavik.sendbox.test_java.order_inicialise;

/**
 * Created by Слава on 10.01.2017.
 */
public class InitialiseImpl2 {
    void checkA() {
        System.out.print("a=" + a + ", ");
    }
    {
        checkA();
 //       System.out.print("a=" + a + ", ");
    }
    int a = 1;
    public static void main(String[] args) {
        new InitialiseImpl2();
    }
}
