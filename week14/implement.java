package week14;

public class implement {
    public static void main(String[] args) {
        Queues q = new Queues();

        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);
        // System.out.print(q.get());

        // while (! q.isEnpty()){
        //     System.out.print(q.deQueue() + " ");
        // }

        q.display();
    }
}
