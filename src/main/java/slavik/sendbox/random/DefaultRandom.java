package slavik.sendbox.random;

/**
 * Created by Слава on 16.02.2017.
 */
public class DefaultRandom {
    public static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public static int[] fillMassRandom(int mass[]){
        return null;
    }
}
