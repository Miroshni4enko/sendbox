package slavik.sendbox.pr_algorithms_SSU.pr3.hash_table;

/**
 * Created by Слава on 03.03.2017.
 */
public interface HashTable<T1,T2> {
    public  boolean  push(T1 x, T2 y);
    public  boolean delete(T1 x);
    public  T2  get (T1 x);
}
