package week16;

public class Implementation {
    public static void main(String[] args) {
        int [] arr = {10,20,30,1,5,7,3,2};
        Heaps hp = new Heaps(arr);

        hp.display();  //displays the heap
        hp.Add(-2);
        hp.display();  //displays the heap after adding -1
        hp.Remove();
        hp.display();  //displays the heap after removing the root
    }
}
