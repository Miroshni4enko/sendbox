package slavik.sendbox.test_java.order_inicialise;

/**
 * Created by Слава on 09.01.2017.
 */
public class InitialiseImp1 {
    void checkA() {
        System.out.print("a2=" + a + ", ");
    }

    {
        checkA();
    }
    int a = 1;
    {
        System.out.print("a1=" + a + ", ");
    }

    public static void main(String[] args) {
        new InitialiseImp1();
    }
}
