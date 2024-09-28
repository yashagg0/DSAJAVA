package week12;
public class Linked_Lists {
    class Node{
        int data;
        Node next;
    }
    Node head;  // to store the address of the data for next path to be read 
    Node tail;          // 3 data members
    private int size;

    //TC O(1)
    public void addFirst(int item){
        Node nn = new Node();
        nn.data = item;
        if (size == 0){
            head = nn;
            tail = nn;
        }
        else{
            nn.next = head;
            head = nn;
        }
        size++;
    }

    public void addLast (int item){
        if(size == 0)
            addFirst(item);
        else {
            Node nn = new Node();
            nn.data = item;
            tail.next = nn;
            tail = nn;
            size++ ;
        }
    }

    public Node getNode(int index){
        Node temp = head;
        for (int i = 0; i < index; i++)
            temp = temp.next;
        return temp;
    }

    public void addMid(int item, int index){
        if (index == 0)
        addFirst(item);
        else if (index == size-1)
        addLast(item);

        Node nn = new Node();
        nn.data = item;

        Node k_1th = getNode(index -1);
        nn.next = k_1th;
        k_1th.next = nn;
        size++ ;
    }

    public int getFirst(){
        return head.data;
    }

    public int getLast(){
        return tail.data;
    }

    public int getMid(int index){
        if (index >= size || index < 0)
            return -1;

        else if (index == 0)
            return getFirst();

        else if (index == size - 1)
            return getLast();

        else
            return getNode(index).data;
    }

    public int removeFirst(){
        int rv = head.data;
        if(size == 1){
            head = null;
            tail = null;
        }
        else{
            Node temp = head;
            head = head.next;
            temp.next = null;
        }
        size-- ;
        return rv;
    }

    public int removeLast(){
        int rv = tail.data;
        if(size == 1){
            head = null;
            tail = null;
        }
        else{
            Node temp = getNode(size-2);
            temp.next = null;
            tail = temp;
        }
        size-- ;
        return rv;
    }

    public int removeMid(int index){
        if (index == 0)
        return removeFirst();

        else if (index == size -1)
        return removeLast();

        else{
            Node k_1th = getNode(index - 1);
            Node k_th = k_1th.next;
            k_1th.next = k_th.next;
            k_th.next = null;
            size-- ;
            return k_th.data;
        }
    }

    public void Display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public int size(){
        return size;
    }
}
