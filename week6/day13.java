package week6;

import java.util.Arrays;

public class day13 {  //2D ARRAYS

    // public static void populate(int[][] nums){
    //     int n =1;
    //     for(int i=0; i <=nums.length-1; i++){
    //         for(int j=0; j<=nums[i].length-1; j++){
    //             nums[i][j] = n;
    //             n++;
    //         }
    //     }
    // }

    // public static void display(int[][] nums){
    //     for(int i=0; i <=nums.length-1; i++){
    //         for(int j=0; j<=nums[0].length-1; j++){
    //             System.out.print(nums[i][j] + "\t");
    //         }
    //         System.out.println();
    //    }
    // }

    //sum of 2d array

    // public static void sumof2darray(int[][] nums){
    //     int n =1;
    //     for(int i=0; i <=nums.length-1; i++){
    //         for(int j=0; j<=nums[i].length-1; j++){
    //             nums[i][j] = n;
    //             n++;
    //         }
    //     }
    // }

    // public static void display(int[][] nums){
    //     int sum = 0;
    //     for(int i=0; i <=nums.length-1; i++){
    //         for(int j=0; j<=nums[0].length-1; j++){
    //             sum += nums[i][j];
    //         }
    //    }
    //    System.out.println(sum);
    // }
    

    //LINEAR SEARCH ON 2D ARRAY

    // public static int[] SEARCH(int[][] nums, int n){
    //     int[] ans = new int [2];
    //     for(int i=0; i <=nums.length-1; i++){
    //         for(int j=0; j<=nums[i].length-1; j++){
    //             if(nums[i][j] == n){
    //                 ans[0] = i;
    //                 ans[1] = j; 
    //                 return ans;
    //             }
    //         }
    //     }
    //     return ans;
    // }
    
    // public static void main(String[] args) {
    //     int[][] nums = new int[3][4];
    //     // int[][] nums = new int[3][4];
    //     // int[] arr = new int[5];
    //     // System.out.println(arr);
    //     // System.out.println(nums);
    //     // System.out.println(nums[0]);
    //     // System.out.println(nums[1]);
    //     // System.out.println(nums[1][2]);

    //     // int[] arr1 = {1,2,3,4};
    //     // int[][] nums2 = {{1,2,3},{4,5,6},{7,8,9}};
    //     // System.out.println(arr1[1]);
    //     // System.out.println(nums2[1][2]);

    //     // int[][][] grid = new int[4][2][1];
    //     // System.out.println(grid[0][0][0]);

    //     // int[][][][][] new1 = new int[4][2][1][2][3];
    //     // System.out.println(new1);

    //     // int[][] nums = new int[3][4];
    //     int[] indices = SEARCH(nums,5);
    //     System.out.println(indices);
    //     // display(nums);
    
    // }

    // TRANSPOSE OF A MATRIX

    // public static void populate(int[][] nums){
    //     int n = 1;
    //     for(int i=0; i <=nums.length-1; i++){
    //         for(int j=0; j<=nums[i].length-1; j++){
    //             nums[i][j] = n;
    //             n++;
    //         }
    //     }
    // }

    // public static void TRANSPOSE(int[][] nums){
    //     for(int i=0; i<= nums.length-1; i++){
    //         for (int j=0 ; j<= i; j++){
    //             int k = nums[i][j];
    //             nums[i][j] = nums[j][i];
    //             nums[j][i] = k;
    //         }
    //     }
    // }

    // public static void display(int[][] nums){
    //         for(int i=0; i <=nums.length-1; i++){
    //             for(int j=0; j<=nums[i].length-1; j++){
    //                 System.out.print(nums[i][j]+ "\t");
                    
    //             }
    //             System.out.println();
    //        }
    //        System.out.println();
    //     }

    // public static void main(String[] args){
    //     int[][] nums = new int[4][4];
    //     populate(nums);
    //     display(nums);
    //     TRANSPOSE(nums);
    //     display(nums);
    // }

// }

static void sortbyRows(int[][] nums){
    for(int i=0; i<= nums.length-1; i++){
        Arrays.sort(nums[i]);
    } 
}

public static void main(String[] args) {
    int[][] nums = new int[][]{{1, 4, 3}, {8,6,7}, {2,5,9}};
    sortbyRows(nums);
}
}
