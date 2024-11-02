package week14;
import java.util.*;

public class QueueUsingStk {
    static Stack<Integer> stk1 = new Stack<>();
    static Stack<Integer> stk2 = new Stack<>();

    static void enQueue(int x){
        while (!stk1.isEmpty()){
            stk2.push(stk1.pop());
            
        }
        stk1.push(x);
        while (!stk2.isEmpty()){
            stk1.push(stk2.pop());
    }
}
    static int deQueue(){
        if (stk1.isEmpty()){
        return -1;  
        }
        int x = stk1.peek();
        stk1.pop();
        return x;
        }

    public static void main(String[] args) {
        Queues q = new Queues();
        enQueue(1);
        enQueue(2);
        enQueue(3);

        System.out.print(q.deQueue());
        System.out.print(q.deQueue());
    }
}


