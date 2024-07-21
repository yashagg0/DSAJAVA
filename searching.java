
import java.util.Arrays;

//create a function to search for an element in an array
public class searching {
    static void printArr(int[] arr){
    for(int i:arr)
    System.out.print(i+ " ");
   // System.out.println();
 }

//  static boolean linearsearch(int[] arr,int n)
// {
//     for(int i=0;i<=arr.length-1;i++){
//     if(arr[i]==n) 
//     return true;
//     }
//     return false;
// }
    static boolean binarysearch(int[] arr,int n,int a, int b){
        int i=a, j=b;
        while (i<=j){
            int mid = (i+j)/2;
            if(arr[mid]==n) return true;
            else if (arr[mid]<n) i=mid+1;
            else j=mid-1;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr= {1,2,13,4,45,6,17,8};
        Arrays.sort(arr);
        printArr(arr);
        System.out.println(binarysearch(arr, 13,2,5)); 
    }
}
