package week14;
import java.util.*;
public class PracticeSTK {

    //INSERT AT FIRST

    // public static void main(String[] args) {
    //     Stack<Integer> stk1 = new Stack<>();
    //     Stack<Integer> stk2 = new Stack<>();
    //     stk1.push(10);
    //     stk1.push(20);
    //     stk1.push(30);
    //     stk1.push(40);
    //     int m =5;

    //     while(stk1.empty() ){
    //         stk2.add(stk1.peek()); //peek
    //         stk1.pop();
    //     }
    //     stk1.add(m);
    //     while(stk2.empty() ){
    //         stk1.add(stk2.peek()); //peek
    //         stk2.pop();
    //     }
    //     System.out.println(stk1);
    // }

    // static void insertAtFirst(Stack<Integer> stk, int m){
    //     if(stk.empty()){
    //         stk.push(m);
    //         return;
    //     }
    //     int temp = stk.pop();
    //     insertAtFirst(stk, m);
    //     stk.add(temp);
    // }

    // public static void main(String[] args) {
    //     Stack<Integer> stk = new Stack<>();
    //     stk.add(10);
    //     stk.add(20);
    //     stk.add(30);
    //     stk.add(40);
    //     int m = 5;
    //     insertAtFirst(stk, m);
    //     System.out.println(stk);
    // }

    // REVERSE STACK VALUE

    // static void insertAtFirst(Stack<Integer> stk, int x){
    //         if(stk.empty()){
    //             stk.push(x);
    //             return;
    //         }
    //         int temp = stk.pop();
    //         insertAtFirst(stk, x);
    //         stk.add(temp);
    //     }

    // static void revStack(Stack<Integer> stk){
    //     if(stk.empty()){
    //         return;
    //     }
    //         int x = stk.pop();
    //         revStack(stk);
    //         insertAtFirst(stk, x);
            
    // }

    // public static void main(String[] args) {
    //     Stack<Integer> stk = new Stack<>();
    //     stk.add(10);
    //     stk.add(20);
    //     stk.add(30);
    //     stk.add(40);
        
    //     revStack(stk);
    //     System.out.println(stk);
    // }

    // NGER AND NSER STACK

    // static void display(int[] arr){
    //     for(int i = 0; i < arr.length; i++){
    //         System.out.print(arr[i] + " ");
    //         }
    //         System.out.println();
    // }

    // static void Compare(int[] arr){
    //     Stack<Integer> stk = new Stack<>();
    //     int [] ans= new int[arr.length];

    //     for (int i=0; i<arr.length;i++){
    //         while(!stk.empty() && arr[i] > arr[stk.peek()])
    //             ans[stk.pop()] = arr[i];
    //         stk.push(i);
            
    //     }
    //     while (!stk.empty())
    //         ans[stk.pop()] = -1;
    //     display(ans);
    // }
    // public static void main(String[] args) {
    //     Stack<Integer> stk = new Stack<>();
        
    //     stk.add(1);
    //     stk.add(2);
    //     stk.add(4);
    //     stk.add(3);
    //     stk.add(2);
    //     stk.add(2);
    //     stk.add(3);
    //     stk.add(1);
        
    //     Compare(new int[] {1,3,4,2,3,3,2});
    //     System.out.println(stk);
    // }

    // NSER STACK

    static void display(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
            }
            System.out.println();
    }

    static void Compare(int[] arr){
        Stack<Integer> stk = new Stack<>();
        int [] ans= new int[arr.length];

        for (int i=0; i<arr.length;i++){
            while(!stk.empty() && arr[i] < arr[stk.peek()])
                ans[stk.pop()] = arr[i];
            stk.push(i);
            
        }
        while (!stk.empty())
            ans[stk.pop()] = -1;
        display(ans);
    }
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        
        stk.add(1);
        stk.add(2);
        stk.add(4);
        stk.add(3);
        stk.add(2);
        stk.add(2);
        stk.add(3);
        stk.add(1);
        
        Compare(new int[] {2,3,1,2,4,2,5});
        System.out.println(stk);
    }
}
