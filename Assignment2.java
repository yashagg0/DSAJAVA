public class Assignment2 {


    //QUESTION 1

    // Sum of odd placed and even placed digits
    // Take N as input. Print the sum of its odd placed digits and sum of its even placed digits.
    // 2635  SAMPLE INPUT
    // 11 5  SAMPLE OUTPUT
    // 5 is present at 1st position, 3 is present at 2nd position, 6 is present at 3rd position and 2 is present at 4th position.
    // Sum of odd placed digits on first line. 5 and 6 are placed at odd position. Hence odd place sum is 5+6=11
    // Sum of even placed digits on second line. 3 and 2 are placed at even position. Hence even place sum is 3+2=5

//     import java.util.*;
// public class Main {

//     static void sumof (int n){
//         int oddsum = 0;
//         int evensum = 0;
//         int count = 1;

//         while (n!=0){
//         int temp = n % 10; //last digit
//         if(count % 2 == 0){
//             evensum += temp;
//         }
//         else {
//             oddsum += temp;
//         }
//         n = n/10;
//         count++;
//         }
//         System.out.println(oddsum);
//         System.out.println(evensum);
//     }
    
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         sumof(n);
        
//     }
// }


    // QUESTION 2
       

// celcius to faranhite
public static void main(String args[]) {
    // Your Code Here
//     Scanner sc = new Scanner(System.in);
    
//     double c;

//     int minF = 0;
//     int maxF = 100;
//     int step = 20;

//     for (int f = minF; f <= maxF; f += step){
//         c= (5.0/9.0) * (f - 32) ;
//         System.out.println(f+ "\t" +c);
//     } 

// }
//}


// reverse a number 

// int number = 123456789, reverse = 0;
//         while (number != 0){
//             int remainder = number % 10;
//             reverse = reverse*10 + remainder;   
//             number = number / 10;
//         }
//         System.out.println(reverse);
//     }
// }    


// gcd of two numbers

// int x = 12, y = 8, gcd = 1;    
// for(int i = 1; i <= x && i <= y; i++)  
// {  
// if(x%i==0 && y%i==0)  
// gcd = i;  
// }  
// System.out.printf("GCD of 12 and 8 is: %d", x, y, gcd);  
// }  
// }  

//lcm of two numbers

int x = 4, y = 6, gcd = 1;    
for(int i = 1; i <= x && i <= y; i++)  
{  
if(x%i==0 && y%i==0)  
gcd = i;  
}  
int lcm = (x*y)/gcd;

System.out.println(lcm);
}  
}  


// fibonacci series upto 10

    // Your Code Here
//     int n1=0, n2=1,n3,i, count=10;
//     System.out.print(n1+ " " +n2);
//     for (i=2; i<count; i++){
//         n3= n1+n2;
//         System.out.print(" " +n3);
//         n1=n2;
//         n2=n3;
//     }
// }
// }

