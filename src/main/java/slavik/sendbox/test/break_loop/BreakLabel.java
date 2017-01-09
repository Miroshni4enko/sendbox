package slavik.sendbox.test.break_loop;

/**
 * Created by Слава on 08.01.2017.
 */
public class BreakLabel {
    public static void main(String[] args) {
        real_data:
        for(int i=0;i<10;i++){
            System.out.println(i);
            break real_data;

        }
    }
}
