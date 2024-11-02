package week14;

import java.util.Iterator;

public class Queues {
        private int[] arr;
        private int front = 0;
        private int size = 0;

        public Queues(){  // default constructor
            arr = new int[5];
        }

        public Queues(int n){  // custom constructor
            arr = new int[n];
        }

        public boolean isEnpty(){  //check if arr is empty
            return (size == 0);
        }

        public void enQueue (int item){ // add element to queue
            // int ptr = front+ size;  //linear queue
            int ptr = (front+ size)% arr.length;  //circular queue
            arr[ptr] = item;
            size++;
        }

        public int deQueue(){  //remove element from queue
            int rv = arr[front];
            front++;
            size--;
            return rv;
        }

        public int get(){  //get the first value in array
            return arr[front];
        }

        public int size(){
            return size;
        }

        // public void display(){  
        //     for (int i = 0; i< size; i++){
        //         System.out.print(arr[i]+ " ");
        //     }
        // }

        public void display(){   //using iterators
            Iterator value = Queues.iterator();
            while(value.hasNext()){
                System.out.print(value.next() + " ");
                }
        }
}
