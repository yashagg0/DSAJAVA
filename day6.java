public class day6 {                                             //binary search
//     static int binarysearch(int arr[], int num){
//         int low =0, high = arr.length-1;
//         int mid;
//         while(low<=high){
//             mid = (low+high)/2;
//             if(arr[mid]==num)
//             return mid;
//             else if(arr[mid]<num){
//                 low = mid+1;
//             } else 
//                 high= mid-1;
//     }
//     return -1;
// }
//     public static void main(String[] args){
//         // int num=6;
//         int arr[] = {1,2,3,4,5,6,7};
//         System.out.println(binarysearch(arr, 5));
//     }
// }


// lower bound (THIS IS CODE FOR LOWER BOUND)
// upper bound 

// static int lowerbound(int arr[], int num){
//     int low =0, high = arr.length-1;
//     int mid, firstoccurence= -1;
//     while(low<=high){
//         mid = (low+high)/2;
//         if(arr[mid]==num){          //first condition
//         firstoccurence= mid;
//         high=mid-1;
//         } else if(arr[mid]>num){    //second condition
//             high = mid-1;
//         } else                      //third condition
//             low= mid+1;
// }
// return firstoccurence;
// }
// public static void main(String[] args){
//     // int num=6;
//     int arr[] = {1,1,2,2,2,2,3,3,4,5,5,5};
//     System.out.println(lowerbound(arr, 5));
// }
// }

// THIS CODE FOR UPPER BOUND

// static int upperbound(int arr[], int num){
//     int low =0, high = arr.length-1;
//     int mid, ans= -1;
//     while(low<=high){
//         mid = (low+high)/2;
//         if(arr[mid]==num){          //first condition
//         ans = mid+1;
//         low = mid+1;
//         } else if(arr[mid]>num){    //second condition
//             high = mid-1;
//         } else                      //third condition
//             low= mid+1;
// }
// return ans;
// }
// public static void main(String[] args){
//     // int num=6;
//     int arr[] = {1,1,2,2,2,2,3,3,4,5,5,5};
//     System.out.println(upperbound(arr, 2));
// }
// }


// COUNT THE NUMBER OF OCCURENCE IN AN ARRAY

// static int lowerbound(int arr[], int num){
//     int low = 0, high = arr.length-1;
//     int mid, firstoccurence=-1;

//     while(low<=high){
//         mid = (low+high)/2;
//         if(arr[mid]==num){          //first condition
//             firstoccurence= mid;
//             high=mid-1;
//             } else if(arr[mid]>num){    //second condition
//                 high = mid-1;
//             } else                      //third condition
//                 low= mid+1;
//         }
//         return firstoccurence;
// }
//     static int upperbound(int arr[], int num){
//     int low = 0, high = arr.length-1;
//     int mid, ans = -1;

//     while(low<=high){
//         mid = (low+high)/2;
//         if(arr[mid]==num){          
//             ans = mid+1;
//             low = mid+1;
//         }
//         else if(arr[mid]>num){   
//             high = mid-1;
//             }
//             else
//             low= mid+1;
//         }
//     return ans;
// }
//     static int countoccurence(int[] arr, int num){
//         int lb = lowerbound(arr, num);
//         if(lb==1) return 0;
//         int ub = upperbound(arr, num);
//         return ub-lb;
//     }
//     public static void main(String[] args) {
//         // int num=6;
//         int arr[] = {1,2,3,4,5,5,6,6,6,6,6,7,8,9,9,9,9};
//         System.out.println(countoccurence(arr, 0));
//     }
//     }

    // BUBBLE SORT PROGRAM 

public static void bubblesort(int[] arr) {
    for (int turn = 1; turn<arr.length; turn++){
        for (int i = 0; i < arr.length - turn; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
             }
        }
    }
}
static void display(int[] arr){
    for(int i:arr) System.out.print(i+" ");
    System.out.println();
}

public static void main(String[] args) {
    int arr[] = {2,4,5,7,3,1,9,6};
    bubblesort(arr);
    display(arr);
}
}