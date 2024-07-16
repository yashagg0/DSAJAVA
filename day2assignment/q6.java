public class q6 {
    public static void main(String[] args) {
        int N=5;
        for (int i = N; i >=1; i--) 
        {
            for (int k = 1; k <= (N-i); k++){
                System.out.print("    ");
            }
            for (int j=1; j<=i; j++) 
            {
                System.out.print("* ");
                
            }
            System.out.println();
        }
    
}
}
