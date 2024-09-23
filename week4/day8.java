package week4;
public class day8 {   //NEXT GREATEST ELEMENT
    // static int[] NGER(int[] arr){
    //     int maxelement = 0;
    //     int[] nger = new int[arr.length];
    //     for(int i = arr.length-1; i>=0;i--){
    //         nger[i]= maxelement;
    //         maxelement = Math.max(maxelement, arr[i]);
    //     }
    //     return nger;
    // }

    // public static void main(String[] args) {
    //     int[] arr = {7,1,5,3,6,4};
    //     int[] num= NGER(arr);
    //     for (int i:num)
    //     System.out.print(i+ " ");
    // }
    // }

    // NEXT GREATEST ELEMENT FROM LEFT

    // static int[] NGEL(int[] arr){
    //     int maxelement = 0;
    //     int[] ngel = new int[arr.length];
    //     for(int i=0;i<arr.length;i++){
    //         ngel[i] = maxelement ;
    //         maxelement= Math.max(arr[i],maxelement);
    //     }
    //     return ngel;
    // }

    // public static void main(String[] args) {
    //     int[] arr = {7,1,5,3,6,4};
    //     int[] num= NGEL(arr);
    //     for (int i:num)
    //     System.out.print(i+ " ");
    // }

    // NEXT SMALLEST ELEMENT FROM RIGHT

//     static int[] NSER(int[] arr){
//         int minelement = Integer.MAX_VALUE;
//         int[] temp = new int[arr.length];
//         for (int i = arr.length-1;i>=0;i--){
//             if(minelement == Integer.MAX_VALUE)
//                 temp[i] = 0;
//             else{
//             temp[i] = minelement;
//             }
//             minelement = Math.min(minelement, arr[i]);
//     }
//     return temp;
// }
//     public static void main(String[] args) {
//         int[] arr = {9,6,4,1,7,3,5,2,8};
//         int[] num= NSER(arr);
//         for(int i:num)
//         System.out.print(i+ " ");
//     }
//     }

static int[] NSEL(int[] arr){
    int minelement = Integer.MAX_VALUE;
    int[] temp = new int[arr.length];
    for (int i =0;i<=arr.length-1;i++){
        if(minelement == Integer.MAX_VALUE)
            temp[i] = 0;
        else{
        temp[i] = minelement;
        }
        minelement = Math.min(minelement, arr[i]);
}
return temp;
}
public static void main(String[] args) {
    int[] arr = {9,6,4,1,7,3,5,2,8};
    int[] num= NSEL(arr);
    for(int i:num)
    System.out.print(i+ " ");
}
}