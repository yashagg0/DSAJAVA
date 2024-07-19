public class q33 {
    public static void main(String[] args) {
        int N=10;
        for(int i=1; i<=N;i++){
            for(int k=1; k<=N-i;k++){
                System.out.print("  ");
        }
        for(int j=1; j<=i; j++ ){
            if (i==j){
                System.out.print("0 ");
            } else {
                System.out.print((N-i+j)+" ");
        }
    }
        for(int j=2; j<=i; j++ ){
                System.out.print((N-j+1)+" ");
        }
                System.out.println();
        }
    }
}
    