public class day8 {
    static int[] NGER(int[] arr){
        int maxelement = 0;
        int[] nger = new int[arr.length];
        for(int i = arr.length-1; i>=0;i--){
            nger[i]= maxelement;
            maxelement = Math.max(maxelement, arr[i]);
        }
        return nger;
    }

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int[] num= NGER(arr);
        for (int i:num)
        System.out.print(i+ " ");
    }
    }

