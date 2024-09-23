package week6;
public class day12 {

//     static String reverse(String s1){
//         String s2 = "";
//         for(int i = s1.length()-1; i >= 0; i--){
//             s2 += s1.charAt(i);
//     }
//     return s2;
// }

//     static booelan checkPal(String s){
//         int i = 0;
//         int j = s.length()-1;
//         while(i <= j){
//             if(s.charAt(i) != s.charAt(j)){
//                 return false;
//                 i++ ;
//                 j--;
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         // String s1 = "This \s\s\sis \sa \sclass";
//         // String s2 = "This \tis \ta     tab";
//         // String s3 = "This is line 1.\nThis is line 2.";
//         // String s4 = "This is line 1 \f";
//         // String s5 = "This is line 1\rThis is line 2.";
//         // String s6 = "\'Hello\"";
//         // String s7 = "Hello This is \\ divide symbol";
        

//         // String s2 = "lo";
//         // String s3 = "";

//         // s1 = s1.replace(m,n);
//         // System.out.println(s4);
//         // System.out.println(s7);

//         // System.out.println(s1.contains(s2));  

//         // String s1 = "Hi, this is an example string";
//         // String[] arr = s1.split("\\s",4);
//         // for (String i:arr) 
//         // System.out.println(i);

//         // String s1 = "Hello";
//         // String s2 = new String("Hello").intern();
//         // System.out.println(s1.equals(s2));  

//         // int n= 5132;
//         // // String s ="" +n;  //or
//         // // String s1 = "Hi";
//         // String s1 = String.valueOf(n);
//         // s1 += "abc";
//         // System.out.println(s1); 


//         //FUNCTION TO REVERSE THE STRING

//         // String s = "Potato";
//         // System.out.println(s.charAt(5)+ "" + s.charAt(4)+ "" + s.charAt(3)+ ""+ s.charAt(2)+ ""+ s.charAt(1)+ ""+ s.charAt(0));

//         String s1 = "detartrated";
//         String rev = reverse(s1);
//         System.out.println(rev);
//         System.out.println(s1.equals(rev));

//     }
// }

// FIND THE MAXIMUM OCCURRING NUMBER IN THE SORTED STRING   //IMPORTANT QUESTION
// aaabbbbcdd ==> b
        // static char name(String s1){
        //     int countMaxOccur = 0;
        //     int countCurrElement = 0;
        //     char cuurElement = ' ';
        //     char maxOccur = ' ';
        //     for (int i = 1; i < s1.length(); i++) {
        //         if (s1.charAt(i) != cuurElement) {
        //             if (countCurrElement > countMaxOccur) {
        //                 countMaxOccur = countCurrElement;
        //                 maxOccur = cuurElement;
        //             }
        //             cuurElement = s1.charAt(i);
        //             countCurrElement = 1;
        //             }
        //             else {
        //                 countCurrElement++;
        //         }
        //         }
        //         if (countCurrElement > countMaxOccur) {
        //             countMaxOccur = countCurrElement;
        //             maxOccur = cuurElement;
        //             }
        //     return maxOccur;
        // }

        //SAME QUESTION IN A UNSORTED ARRAY
//         static char name(String s1){
//             int[] arr = new int[26];
//             for (int i = 0; i < s1.length(); i++) {
//                 arr[s1.charAt(i)-'a']++;
//             }
//                 int index= 0;
//                 for (int i = 0; i < arr.length; i++) {
//                     if (arr[i] > arr[index]) {
//                         index = i;
//                         }
//                     }
//                 return (char)(index+'a');
//         }
//         public static void main(String[] args) {
//             String s1 = "abbbaaabbcdccdadaddaadd";
//             System.out.println(name(s1));
//         }
// }


static void reverseWord(String s1){
    String[] arr = s1.split("\\s");
    for (int i = arr.length-1; i>=0; i--){
        System.out.print(arr[i]+ " ");
    }
}
public static void main(String[] args) {
    String s1 = "I am Batman";
    // System.out.print(reverseWord(s1));
}
}