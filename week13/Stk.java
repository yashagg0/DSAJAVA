package week13;
import java.util.Stack;
public class Stk {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        System.out.println(stk.empty());

        stk.push(1);
        stk.add(2);
        stk.push(3);

        // stk.addElement(obj);
        // System.out.println(stk.peek());
        // System.out.println(stk.pop());

        System.out.println(stk.search(5));  //it return the distance from the top
        System.out.println(stk.capacity());
        System.out.println(stk.size());

        //LC 155

        //LC 20 
    }
}
