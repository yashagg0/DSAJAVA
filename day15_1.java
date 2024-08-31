import java.util.*;
public class day15_1 {
    public static void main(String[] args) {

        int[] arr = {30,30,30,10,20,10,1,40,40};
        int k = 2;
        System.out.println(findSubArray(arr, k));

        // WrapperClass wc = new WrapperClass();
        // System.out.println(wc.num);
        // //syntax
        // ArrayList<Integer> s = new ArrayList<>();
        // //add
        // s.add(30);
        // s.add(40);
        // s.add(50);
        // s.add(10);
        // s.add(20);
       
        // System.out.println(s);
        // System.out.println(s.size());
        // System.out.println(s.get(0));
        // //remove
        // // s.remove(2);
        // // System.out.println(s);
        // // System.out.println(s.size());
        // //update
        // s.set(3,50);
        // System.out.println(s);
        // System.out.println(s.size());
        // //sort
        // Collections.sort(s);
        // System.out.println(s);
        // //add
        // s.add(0,10);
        // System.out.println(s);
    }
        //Q CREATE A FN TO FIND THE MAX SUM SUB ARRAY OF SIZE K
        // [30,30,30,10,20,10,1,40,40] k=3  [30,30,30]

        static ArrayList<Integer> findSubArray(int[]arr , int k){
            ArrayList<Integer> maxSum = new ArrayList<>();
            int low = arr[0];
            int tax = 0;
            int l = 0;
            int aer=0;
            for(int i = 1 ; i < arr.length ; i++){
                if(arr[i] + low > tax)
                aer = arr[i] + low;
                tax = Math.max(tax, aer);
                l = low;
                low = arr[i];
            }
            maxSum.add(l);
            maxSum.add(low);
            return maxSum;
    }
}

        // ans

        // int start = 0;
        // int end = k-1;
        // int maxSum = 0;
        // for (int i = 0; i<= end; i++)
        // maxSum += arr[i];
        // int currsum = maxSum;
        // int index =0;
        //  while (end < arr.length-1){
        //     currsum -= arr[start];
        //     start++;
        //     end++;
        //     currsum += arr[end];
        //     if(currsum > maxSum){
        //         maxSum = currsum;
        //         index = start;
        //         }
        //  }
        // ArrayList<Integer> nums = new ArrayList<>();
        // for (int i = index; i< index+k;i++)
        // nums.add(arr[i]);
        // return nums;



        // Integer a1 = 127;
        // Integer a2 = 127;
        // System.out.println(a1 == a2);
    
