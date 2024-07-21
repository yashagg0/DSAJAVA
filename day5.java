public class day5 {
//     public static int sumarray(int[] arr, int a, int b) {
//         if (a>b || a<0 || b<0 || b>=arr.length)
//         return 0;
//         int sum = 0;
//         for (int i = a; i <=b; i++) {
//             sum += arr[i];
//             return sum;
//         }    
//     }
//     public static void main(String[] args) {
//         int[] arr = {7,2,1,0,8,1};
//     }
// }


//create a swap function to swap 2 values inside an array
static void swap(int[] arr, int i, int j){
    // for(i=0;i<arr.length/2;i++)
    // j=arr.length-1-i;
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    System.out.println();
}

static void reverseusingswap(int[] arr,int a,int b){
    for(int i=a,j=b ; i<j ;j--,i++){
        swap(arr,i,j);
        printArr(arr);
        System.out.println();
    }
}

static void printArr(int[] arr){
   for(int i:arr)
   System.out.print(i+ " ");
//    System.out.println();
}
//q3 reverse an array

// static void reversearr(int[] arr){
//     int[] temp=new int[arr.length];
//     for(int i=0;i<arr.length ;i++)
//     temp[i]=arr[arr.length-1 -i];
//     for(int i=0 ; i<arr.length ; i++)  //for deep copy loop
//     arr[i]=temp[i];
//     // printArr(temp);
//     // // arr=temp;
// }
public static void main(String[] args) {
    int[] arr= {1,2,3,4,5,6,7,8,9};
    // reversearr(arr);
    printArr(arr);
    reverseusingswap(arr, 2,6);
    printArr(arr);
    System.out.println();
    System.out.println();
}
}


//SEARCHING 



