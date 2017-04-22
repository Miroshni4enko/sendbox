package slavik.sendbox.test_java.final_static;

/**
 * Created by Слава on 08.03.2017.
 */
public class FinalStatic {
    final static int use = 10;
    final static int notUse =getInt();
    static int getInt(){
        System.out.println("notUse");
        return 12;
    }
}
