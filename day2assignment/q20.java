import java.util.Scanner;
public class q20 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for diamond pattern: ");
        // n is the number of rows here n=7
        int n = sc.nextInt();
        int N = (n+1)/2;
        for (int i = 1; i <= N; i++) {
            for (int k = 1; k <= (N-i); k++) {
                System.out.print("  ");           
        }
        for (int j = 1; j <= 2*i-1; j++) {
            if (j>1 && j< (2*i-1)) {
                System.out.print("  ");
            } else 
            {
            System.out.print("* ");
        }
    }
    System.out.println();
    }
        for (int i = N-1; i >= 1; i--) {
            for (int k = 1; k <= (N-i); k++) {
                System.out.print("  ");           
        }
        for (int j = 1; j <= 2*i-1; j++) {
            if (j>1 && j< (2*i-1)) {
                System.out.print("  ");
            } else 
            {
            System.out.print("* ");
        }
    }
    System.out.println();
    }
    }
    }
