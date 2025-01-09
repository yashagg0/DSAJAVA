
public class BITMASKING {

    //check if a no is odd
    static boolean checkOdd (int n){
        n &= 1;
        return n == 1;
    }

    //check if a bit is set or not
    static boolean bitSet(int n, int k){
        n>>=k;
        n&=1;
        return n==1;    
    }

    //count set bits
    static int countBits(int n){
        int count = 0;
        while (n>0){
            if ((n&1)==1){
                count ++;
            }
            n>>=1;
        }
        return count;
    }

    //remove right : n&n-1   remove left : n& ~(n-1)
    static int countBits2(int n){
        int count = 0;
        while (n>0){
            n&=n-1;
            count ++;
        }
        return count;
    }

    //LC136 XOR the array
    static void func(int[] arr){
        int ans = 0;
        for (int i:arr){
            ans^= i;
            System.out.println(ans);
        }
    }

    //print subseq
    static void subSeq(String s){
        int n = s.length();
        for (int i = 0; i<(1<<n); i++){
            printSub(s,i);
        }
    }
    static void printSub(String s, int i){
        int pos = 0;
        while (i>0){
            if ((i&1)!=0){
                System.out.print(s.charAt(pos));
            }
            pos++;
            i>>=1;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,4,3,1,2,3};
        func(arr);
        System.out.println(checkOdd(3));
        System.out.println(bitSet(3, 5));
        System.out.println(countBits(6));
        System.out.println(countBits2(5));
        subSeq("abc");    
    }
}
