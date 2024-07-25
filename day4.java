
    // static int numlen(int n){
    //     int count=0;
    // static int armstrong(int n){
    //     int count=0;
    //     int temp=0;
    //     while (n!=0){
    //     temp=n;
    //     n/=10;
    //     count++;
    //     }
    //     return temp;

    // }
    
// static boolean countd(int n){
//     int count=0;
//     int temp=0;
//     while(n!=0){
//     count++;
//     n/=10;
//     }
//     return count;
//     }
    
//     static boolean checkarm(int n){
//     int d= countd(n);
//     int sum=0;
//     int temp=n;
//     while(n!=0){
//     sum+= Math.pow((n%10),d);
//     n/=10;
//     }
//     return(sum==temp);
//     }
    
//     //     for (int i=1; i<n; i++)
//     //         if (n % i==0) return false;
//     //      return true;
//     // }
//         // int i;
//         // for(i=1;i<=n;i++){

//         //     System.out.println(" n");
//         // }

//         // int temp = a;
//         // a = b;
//         // b = temp;
//        // System.out.println(a+" "+b);
//     public static void main(String[] args) {
//         int n=371;
//         System.out.println(checkarm(n));
//         // // natural(n:10);
//     //    int a=10; int b=15;
//     //    swap(a, b);
//     //    System.out.println(a+" "+b);
//         }
    
// }
//     static void printarr(int[] arr){
//             for(int i=0;i<arr.length;i++)
//             System.out.print(arr[i]+" ");
//             System.out.println();
//     }
//     public static void main(String[] args) {
//         int [] arr= new int[10];
//         // arr[0]=1;
//         for(int i=0; i<arr.length;i++)
//         arr[i]= i+1; 
//         printarr(arr);
//     }
// }

// public static void main(String[] args) {
//     int[] arr = {1,2,3,4,5};
//     printarr(arr);
//     }
// static void printarr(int[] arr){
//     for(int i:arr)
//     System.out.print(i+" ");
// }    
// }



//prime number code using functions/methods
import java.util.Scanner;
public class day4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        boolean ans = isprime(n);
        System.out.println(ans);
    }
        static boolean isprime(int n){
            if (n<=1) {
                return false;
            }
            int c=2;
            while (c*c <= n){
                 if (n%c ==0){
                    return false;
                 }
                 c++;
            }
            return true;
        }
}