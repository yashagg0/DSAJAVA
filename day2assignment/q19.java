import java.util.*;
public class q19{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 

       System.out.println("Enter the value of n: ");
       int n = sc.nextInt();
       int N=(n+1)/2;

       for (int i=N; i>= 1; i--){
        for (int j=1; j<=i; j++){
            System.out.print("* ");
        }    
        for(int k=1; k<= N-i ; k++){
            System.out.print("  ");
        }    
        for(int k=2; k<= N-i ; k++){
            System.out.print("  ");
        }
        for (int j=1 ; j<=i && j<N; j++){
            System.out.print("* ");
       }
    
       System.out.println();
}
    for (int i=2; i<=N; i++){
        for (int j=1; j<=i ; j++){
            System.out.print("* ");
        }    
        for(int k=N; k>=i+1 ; k--){
            System.out.print("  ");
        }    
        for(int k=N-1; k>=i+1 ; k--){
            System.out.print("  ");
        }    
        for (int j=1 ; j<= i && j<= N-1; j++){
            System.out.print("* ");
       }
       System.out.println(); 
}
    }
}
