package slavik.sendbox.recursion;

/**
 * Created by Слава on 06.01.2017.
 * This class implement task  for consider unduplicat combination of zeros
 */
public class RecursionCombination {
    public static int recurs(int zeros, int ones){
        if(zeros>ones+1){
            return 0;
        }
        if(zeros==0||ones==0){
            return 1;
        }
        return recurs(zeros,ones -1) + recurs(zeros-1,ones-1);
    }

    public static void main(String[] args) {
        System.out.println(recurs(1,2));
    }
}
