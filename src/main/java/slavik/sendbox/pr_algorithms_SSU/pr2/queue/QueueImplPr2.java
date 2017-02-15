package slavik.sendbox.pr_algorithms_SSU.pr2.queue;

import slavik.sendbox.random.DefaultRandom;

/**
 * Created by Слава on 16.02.2017.
 */
public class QueueImplPr2 {
    public static void main(String[] args) {
        int variant = DefaultRandom.rnd(1, 30);
        int size = variant * 50 + 100;
        Queue queue = new Queue(size);
        for (int i = 0; i < size; i++) {
            queue.store(DefaultRandom.rnd(1, 100));
        }
        for (int i = 0; i<size; i++) {
            int currentNum = queue.retrieve();
            if(isPrime(currentNum)){
                System.out.print(currentNum + ",  ");
            }
        }
    }

    static private boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if ((num % i) == 0) {
                return false;
            }
        }
        return true;
    }
}
