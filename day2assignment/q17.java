import java.util.*;
public class q17{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 

       System.out.println("Enter the value of n: ");
       int n = sc.nextInt();
       int N=(n-1)/2;

       for (int i=0; i< N; i++){
        for (int j=0; j<N-i; j++){
            System.out.print("  *");
        }    
        for(int k=1; k< N+i*3 ; k++){
            System.out.print("  ");
        }    
        for (int j=0 ; j<N-i; j++){
            System.out.print("*  ");
       }
       System.out.println();
    }
    for (int i=0; i<= N; i++){
        for (int j=0; j< i; j++){
            System.out.print("  *");
        }    
        for(int k=0; k<=(3-i)*N ; k++){
            System.out.print("  ");
        }    
        for (int j=0 ; j< i; j++){
            System.out.print("  *");
       }
       System.out.println(); 
}
    }
}
