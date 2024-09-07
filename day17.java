public class day17 {   //FIBONACCI USING RECURSION

    // static int fibo(int a, int b,int n){
    //     int c = a+b;
    //     if(n==0 || n==1){
    //     return c;
    //     }
    //     int x = fibo (b,c,n-1);
    //     return x;
    // }
    // public static void main(String[] args) {
    //     int n = 10;
    //     System.out.println(fibo(0,1,n-1));
    // }

    // static int fibo( int n){
    //     if(n==0 || n==1){
    //     return n;
    //     }
    //     int a = fibo(n-1);   // last number
    //     int b = fibo(n-2);   // second last number
    //     return a+b;
    // }
    // public static void main(String[] args) {
    //     System.out.println(fibo(10));
    // }



// SUBSEQUENCES

    // static String SUBSEQUENCES(String a, String b){
    //     if (a.length() == 0){
    //     return b;
    //     }
    //     String c = SUBSEQUENCES(a.substring(1), b + a.charAt(0));
    //     String d = SUBSEQUENCES(a.substring(1), b);
    //     return c + d;
    // }
    // public static void main(String[] args) {
        // String a = "CAR";
        // String b = " ";
        // String ques = "CAR";
        // String ans = " ";
        // System.out.println(SUBSEQUENCES(a,b));
//         genSubSequence(ques,ans);
//     }

//     static void genSubSequence(String ques, String ans){
//         if(ques.length() == 0){
//             System.out.println(ans);
//             return;
//     }
//     genSubSequence(ques.substring(1), ans + ques.charAt(0));
//     genSubSequence(ques.substring(1), ans );
// }


// COIN TOSS
    // static String coinToss(int n, String ans){
    //     if (n==0){
    //         return ans;
    //     }
    //     String a = coinToss(n-1, ans + "H");
    //     String b = coinToss(n-1, ans + "T");
    //     return a + b;
    // }

    public static void main(String[] args) {
    //     int n = 3;
        // int num = 3;
        // String ans = " ";
        // System.out.println(coinToss(n, ans));
        // cointoss(num, ans);
        // System.out.println(countCoinToss(num));
        // System.out.println(countSubSequence(" "));


    }

//     static void cointoss(int num, String ans){
//                 if(num == 0){
//                     System.out.println(ans);
//                     return;
//             }
//             cointoss(num-1, ans + "H");
//             cointoss(num-1, ans + "T" );

// }

// COUNT COIN TOSS
//     static int countCoinToss(int num){
//         if(num == 0){
//             return num;
//         }
//         if(num == 1){
//             return 2;
//         }
//     int l = countCoinToss(num-1);
//     int r = countCoinToss(num-1);
//     return l+r;
// }

// static int countSubSequence(String ques){
//             if(ques.length() == 0){
//                 return 1;
//         }
//         int l = countSubSequence(ques.substring(1));  //include first char 
//         int r = countSubSequence(ques.substring(1));  //exclude first char 
//         return l+r;
//     }


// GENERATE VALID PARENTHESIS

    // static void validParanthesis(int num1, String ans){
    //     if (num1 == 0){
    //         System.out.println(ans);
    //         return;
    //     }

    // }

}