package week17;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();  //unordered 
        TreeSet<Integer> ts = new TreeSet<>();  //ascending order 
        LinkedHashSet<Integer> ls = new LinkedHashSet<>();   // same order as adding (all operations are slow)


        hs.add(2);
        hs.add(1);
        hs.add(20);
        hs.add(3);
        hs.add(5);
        hs.add(-10);

        ts.add(2);
        ts.add(1);
        ts.add(20);
        ts.add(3);
        ts.add(5);
        ts.add(-10);

        ls.add(2);
        ls.add(1);
        ls.add(20);
        ls.add(3);
        ls.add(5);
        ls.add(-10);
        ls.remove(2);
        // ls.contains(10);

        // for (int i : hs)
        //     System.out.println(i+ " ");

        System.out.println(hs);
        System.out.println(ts);
        System.out.println(ls);
        
    }
}
