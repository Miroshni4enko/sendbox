package slavik.sendbox.pr_algorithms_SSU.pr1.stack;

/**
 * Created by vymi1016 on 02/15/2017.
 */
public class Stack {
    private int stackInfo[];
    private int topNumber = -1;

    public Stack(int size) {
        stackInfo = new int[size];

    }
    public void push(int element){
        stackInfo[++topNumber] = element;
    }
    public int pop(){
        return stackInfo[topNumber];
    }
    public int back(){
        return stackInfo[topNumber--];
    }
    public int size(){
        return topNumber + 1;
    }
}
