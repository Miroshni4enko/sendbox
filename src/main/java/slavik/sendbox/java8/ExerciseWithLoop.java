package slavik.sendbox.java8;

import java.util.ArrayList;
import java.util.List;

public class ExerciseWithLoop {

    public static void perform() {
        String[] names = {"Peter", "Paul", "Mary"};
        List<Runnable> runners = new ArrayList<>();
        for (String name : names) {
            runners.add(() -> System.out.println(name));
        }
        for (Runnable runner : runners) {
            new Thread(runner).start();
        }
    }

    public static void main(String[] args) {
        perform();
    }
}
