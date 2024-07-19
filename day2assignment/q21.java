public class q21 {
    public static void main(String[] args) {
        int N=5;
        for (int i=1;i<=N;i++) {
            for (int j=1;j<=i;j++) {
                System.out.print("* ");
            
        }
        System.out.println();
    }  
        for (int i=1;i<=N;i++) {
            for (int k=6;k<=(2*N-i);k++) {
                System.out.print("  ");
            for (int j=6;j<=2*i;j++) {
                System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}

