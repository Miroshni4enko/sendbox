package slavik.sendbox.java8;

public interface RunnableEx  {

    void run() throws Exception;

    static Runnable uncheck(RunnableEx runnable){
        return () -> {
            try {
                runnable.run();
            } catch (Exception e) {
                e.printStackTrace();
            }
        };
    };
}
