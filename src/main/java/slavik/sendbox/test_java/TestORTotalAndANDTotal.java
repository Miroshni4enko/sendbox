package slavik.sendbox.test_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by vymi1016 on 09/25/2017.
 */
public class TestORTotalAndANDTotal {
    public static void main(String[] args) {


        Collection<Boolean> listTrue = new ArrayList<>(Arrays.asList(true, true, true));
        Collection<Boolean> listFalse = new ArrayList<>(Arrays.asList(false, false, false));
        Collection<Boolean> listRandom = new ArrayList<>(Arrays.asList(false, true, false, false, true));

        Boolean ANDTotal = true;
        Boolean ORTotal = false;
        for (Boolean b : listFalse) {
            ANDTotal &= b;
            ORTotal |= b;
        }

        System.out.println("ANDTotal = " + ANDTotal + " ORTotal =" + ORTotal + " for listfalse");

        ANDTotal = true;
        ORTotal = false;

        for (Boolean b : listTrue) {
            ANDTotal &= b;
            ORTotal |= b;
        }
        System.out.println("ANDTotal = " + ANDTotal + " ORTotal =" + ORTotal + " for listTrue");

        ANDTotal = true;
        ORTotal = false;
        for (Boolean b : listRandom) {
            ANDTotal &= b;
            ORTotal |= b;
        }
        System.out.println("ANDTotal = " + ANDTotal + " ORTotal =" + ORTotal + " for listRandom");


    }
}
