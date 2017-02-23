package slavik.sendbox.pr_algorithms_SSU.pr3.hash_table;

/**
 * Created by vymi1016 on 02/23/2017.
 */
public class HashMaker<T> {
    public int returnHash(T x)
    {
        return x.hashCode();
    }
}
