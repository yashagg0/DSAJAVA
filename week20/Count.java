package week20;

import java.util.Arrays;

public class Count {
    
    public static int[] sort(int[] arr){
        int max = Arrays.stream(arr).max().getAsInt();
        int[] freq = new int[max+1];
        
        for (int i = 0; i<arr.length; i++){
            freq[arr[i]]++;
        }
        //preSum arr
        for (int i = 1; i<freq.length; i++){
            freq[i] = freq[i-1] + freq[i];
        }

        int [] ans = new int[arr.length];
        for (int i= arr.length-1; i>=0; i--){
            int idx = arr[i];
            int val = freq[idx];
            ans[val -1] = idx;
            freq[idx]--;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,4,9,7,5,7,1,5,6,2};

        System.out.println(Arrays.toString(sort(arr)));
    }
}
