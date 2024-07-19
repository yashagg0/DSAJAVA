public class q28 {
    public static void main(String[] args) {
    int N=5;
    for(int i=1; i<=N;i++){
        for(int k=1; k<=N-i;k++){
            System.out.print("  ");
    }
    for(int j=1; j<=i; j++ ){
            System.out.print((i+j-1)+" ");
    }
    for(int j=2; j<=i; j++ ){
            System.out.print((2*i-j)+" ");
    }
            System.out.println();
}
}
}

