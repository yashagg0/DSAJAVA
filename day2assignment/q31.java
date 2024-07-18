public class q31 {
    public static void main(String[] args) {   
        int N=5;
        for(int i=1 ; i<=N ; i++){
            for(int j=1;j<=N;j++){
                if (i+j == N+1) {
                    System.out.print("* ");
                }
                else {
                System.out.print((N-j+1)+" ");
            }
    }
    System.out.println();
    }
}
}
