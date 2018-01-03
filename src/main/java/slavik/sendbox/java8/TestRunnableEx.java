package slavik.sendbox.java8;

import static slavik.sendbox.java8.RunnableEx.uncheck;

public class TestRunnableEx{
    public static void main(String[] args){
        new Thread(uncheck(() -> {
            System.out.println("Zzz");
            Thread.sleep(1000);
        })).start();
    }
}
