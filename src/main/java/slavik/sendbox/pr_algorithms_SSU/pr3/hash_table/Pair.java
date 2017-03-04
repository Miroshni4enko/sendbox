package slavik.sendbox.pr_algorithms_SSU.pr3.hash_table;

/**
 * Created by vymi1016 on 02/23/2017.
 */
public class Pair<T1,T2> {
    private final T1 key;
    private final T2 value;
    private  boolean deleted;

    public Pair(T1 key, T2 value) {
        this.key = key;
        this.value = value;
        this.deleted = false;
    }
    public T1 getKey() {
        return key;
    }

    public T2 getValue() {
        return value;
    }

    /*public boolean isDeleted() {
        return deleted;
    }

    public boolean deletePair(){
        if (!this.deleted){
            this.deleted = true;
            return true;
        }else{
            return false;
        }
    }*/
}
