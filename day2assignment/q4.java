public class q4 {
    public static void main(String[] args) {
        int N=5;
        for(int i=1; i<=N;i++)
        {
            for (int k = 1; k <=(N-i); k++){
                System.out.print("  ");
            }
            for(int j=1; j<=i ; j++){
                System.out.print("* "); 
            }
            System.out.println(); 
        
}
    }
}


