package slavik.sendbox.parallel_execut_on_cores;

import java.util.concurrent.TimeUnit;

public class ThreadTest {
    Thread thread1;
    Thread thread2;
    Thread thread3;
    Thread thread4;

    class Run implements Runnable{

        @Override
        public void run() {
            try {
                for(int i = 0; ; i++ ) {
                    System.out.println("213213" + i);

                    TimeUnit.SECONDS.sleep(1);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        }
    public void start(){
        (thread1 = new Thread(new Run())).start();
        (thread2 = new Thread(new Run())).start();
        (thread3 = new Thread(new Run())).start();
        (thread4 = new Thread(new Run())).start();
    }

    public static void main(String[] args) {
        new ThreadTest().start();
    }

}
