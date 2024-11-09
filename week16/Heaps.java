package week16;

import java.util.*;

public class Heaps {
    // create a max heap HW

    //ADD FUNCTION
    public ArrayList<Integer> ll = new ArrayList<>();

    public Heaps(){};  //constructor
    public Heaps(int[] arr){
        for (int i : arr)
            Add(i);
    }

    public void Add (int i){
        ll.add(i);
        upHeapify(ll.size() - 1);
    }

    private void upHeapify(int Ci){  //child index Ci
        int Pi = (Ci - 1) / 2;

        if (ll.get(Pi) > ll.get(Ci)){
            swap(Pi, Ci);
            upHeapify(Pi);
        }
    }

    private void swap (int Pi, int Ci){
        int val1 = ll.get(Pi);
        int val2 = ll.get(Ci);
        ll.set(Pi, val2);
        ll.set(Ci, val1);
    }

    public void display (){
        System.out.println(ll);
    }

    public int get(){
        return ll.get(0);
    }

    public int size(){
        return ll.size();
    }

    //REMOVE FUNCTION 1. swap 2. remove last index 3. downheapify
    public int Remove(){
        swap(0, ll.size()-1);
        int re = ll.remove(ll.size()-1);
        downHeapify(0);  //index 0
        return re;
    }

    private void downHeapify(int Pi){
        int LCi = 2*Pi+1;
        int RCi = 2*Pi+2;
        int min = Pi;

        if (LCi < ll.size() && ll.get(LCi) < ll.get(min)){
            min = LCi;
        }
        if (RCi < ll.size() && ll.get(RCi) < ll.get(min)){
            min = RCi;
        }

        if (min != Pi){
            swap(min, Pi);
            downHeapify(min);
        }
    }
}
