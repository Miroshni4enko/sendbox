package slavik.sendbox.test.OrderInicialise;

/**
 * Created by Слава on 09.01.2017.
 */
public class InitialiseImp1 {
    void checkA() {
        System.out.print("a=" + a + ", ");
    }

    {
        checkA();
    }
    int a = 1;
    {
        System.out.print("a=" + a + ", ");
    }

    public static void main(String[] args) {
        new InitialiseImp1();
    }
}
