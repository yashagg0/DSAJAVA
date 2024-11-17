package week17;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Hashmap {
    public static void main(String[] args) {
        
    HashMap<Integer, Integer> hp = new HashMap<>();
    TreeMap<Integer, Integer> tp = new TreeMap<>();               //properly ordered
    LinkedHashMap<Integer, Integer> lp = new LinkedHashMap<>();   //same as input

    hp.put(3, 30);
    hp.put(5, 50);
    hp.put(10, 20);
    hp.put(2, 10);
    hp.put(-5, -50);

    tp.put(3, 30);
    tp.put(5, 50);
    tp.put(10, 20);
    tp.put(2, 10);
    tp.put(-5, -50);

    lp.put(3, 30);
    lp.put(5, 50);
    lp.put(10, 20);
    lp.put(2, 10);
    lp.put(-5, -50);

    // for(Map.Entry<Integer, Integer> m : hp.entrySet()){
    //     System.out.print(m.getKey()+ " " +m.getValue());
    // }


    System.out.println(hp);
    System.out.println(tp);
    System.out.println(lp);


    }
}
