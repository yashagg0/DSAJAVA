package week3;
public class day7{

    
        // selection sort and insertion sort

        // THIS CODE IF FOR SELECTION SORT

        // static void display(int[] arr){
        //     for(int i:arr) System.out.print(i+" ");
        //     System.out.println();
        // }
        // static void selectionsort(int[] arr){
        //     for(int i=0;i<arr.length-1;i++){
        //         int idx= minimumvalue(arr, i);
        //         int temp = arr[i];
        //         arr[i] = arr[idx];
        //         arr[idx] = temp;
        //     }
        // }

        // //find the index of the minimum element from an array: arr
        // static int minimumvalue(int[] arr, int a){
        //     int mini= a;
        //     for(int i=a+1;i<arr.length;i++)
        //         if(arr[i]<arr[mini])
        //             mini=i;
        //     return mini;
        // } 
        // public static void main(String[] args){
        //     int[] arr = {5,5,7,3,9,2,8,1,1};
        //     selectionsort(arr);
        //     display(arr);
        // }


        //THIS CODE IS FOR INSERTION SORT

        static void display(int[] arr){
                for(int i:arr) System.out.print(i+" ");
                System.out.println();
        }
        static void insertionsort(int arr[]){
            //int n=arr.length
            for(int i=1;i<arr.length;i++){
                int key= arr[i];
                int j=i-1;
                while (j>=0 && arr[j]>key){
                    arr[j+1] = arr[j];
                    --j;
                }
                arr[j+1]=key;
            }
        }
        public static void main(String[] args) {
            int arr[] = {1,3,4,5,9,8,4,2};
            insertionsort(arr);
            // Arrays.sort(arr); 
            // System.out.println(Arrays.binarySearch(args, 3)); 
            display(arr);
        }

    }
