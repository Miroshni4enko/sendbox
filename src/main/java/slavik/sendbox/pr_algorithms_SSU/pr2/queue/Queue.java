package slavik.sendbox.pr_algorithms_SSU.pr2.queue;

/**
 * Created by Слава on 16.02.2017.
 */
public class Queue {
    private int queueInfo[];
    private int counterFirst = -1;
    private int counterLast = -1;


    public Queue(int size) {
        this.queueInfo = new int[size];
    }

    public int retrieve(){
        if (counterFirst>counterLast) {
            return -1;
        }
        return queueInfo[++counterFirst];
    }

    public void store(int element){
        queueInfo[++counterLast] = element;
    }

}
