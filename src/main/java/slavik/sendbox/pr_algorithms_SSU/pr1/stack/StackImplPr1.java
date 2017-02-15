package slavik.sendbox.pr_algorithms_SSU.pr1.stack;
import slavik.sendbox.random.DefaultRandom;
/**
 * Created by Слава on 16.02.2017.
 */
public class StackImplPr1 {
    public static void main(String[] args) {
        int variant = DefaultRandom.rnd(1, 30);
        int size = variant * 50 + 100;
        Stack mainStack = new Stack(size);
        for (int i = 0; i < size; i++) {
            mainStack.push(DefaultRandom.rnd(1, 100));
        }
        Stack pairNumber = new Stack(mainStack.size());
        Stack notPairNumber = new Stack(mainStack.size());
        for (int i = 0; mainStack.size() != 0; i++) {
            if ((mainStack.pop() % 2) == 0) {
                pairNumber.push(mainStack.back());
            } else {
                notPairNumber.push(mainStack.back());
            }
        }

        System.out.println("Pair");
        printStack(pairNumber);

        System.out.println("Not Pair");
        printStack(notPairNumber);
    }
    static private void printStack(Stack stack){
        for(int i = 0;i<stack.size();i++){
            System.out.print(stack.back() + ", ");
        }
        System.out.println();
    }
}
