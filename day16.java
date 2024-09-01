public class day16 {  //RECURSION 
    // public static void main(String[] args) {
    //     System.out.println(fact(6));
    // }
    // static int fact (int n){
    //     if (n==0 || n==1){
    //     return 1;
    //     }
    //     int x = n*fact(n-1);
    //     return x;
    // }

    // public static void main(String[] args) {
    //     System.out.println(pow(2,3));
    // }
    // static int pow (int a, int b){
    //     if (b==0   ){
    //     return 1;
    //     }
    //     int x = a * pow(a,b-1);
    //     return x;
    // }

    //TAIL RECURSION 
    
    // public static void main(String[] args) {
    //     System.out.println(pow(5,3,1));
    // }
    // static int pow (int a, int b, int x){
    //     if (b==0 ){
    //     return x;
    //     }
    //     return pow (a,(b-1), a*x);
    // }

    public static void main(String[] args) {
        System.out.println(fact(5,1));
    }
    static int fact (int n, int x){
        if (n==0 || n==1){
        return x;
        }
        return fact(n-1,n*x);
    }
}
