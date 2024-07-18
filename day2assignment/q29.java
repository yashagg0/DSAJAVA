public class q29 {
    public static void main(String[] args) {
        int N = 5;
        for (int i = 1; i <= N; i++) {
            for (int k = 1; k <= (N-i); k++) {
                System.out.print("  ");           
        }
        for (int j = 1; j <= 2*i-1; j++) {
            if (j>1 && j< (2*i-1)) {
                System.out.print("0 ");
            } else 
            {
            System.out.print(i+" ");
        }
    }
    System.out.println();
    }
    
    }
}
