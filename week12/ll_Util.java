package week12;

public class ll_Util {
    public static void main(String[] args) {
        Linked_Lists ll = new Linked_Lists();
        ll.addFirst(40);
        ll.addFirst(30);
        ll.addFirst(20);
        ll.addFirst(10);
        // System.out.println(ll.head);
        // System.out.println(ll.head.data);
        // System.out.println(ll.tail);
        // System.out.println(ll.tail.data);
        
        ll.addLast(50);
        ll.addLast(60);
        ll.Display();

        // ll.addMid(30, 3);
        // ll.Display();
        // System.out.println(ll.getNode(3));

        // System.out.println(ll.getFirst()+ " " +ll.getLast()+ " " +ll.getMid(3));

        System.out.println(ll.removeMid(2));
        ll.Display();

    }
}
