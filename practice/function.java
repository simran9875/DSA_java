package practice;
import java.util.Scanner;
public class function {
    // static int sumValue(int a ,int b){
    //     return a+b;
        // return sum;
        // static void Factor
        // static String prime(int n){
        //         for (int i =2;i<n/2;i++){
        //             if (n%i==0){
        //                 return ("not prime");
        //             }
        //         }return "prime";
        //     }
        // static String evenOrOdd(int n){
        //     if (n%2==0){
        //         return "even";
        //     }else
        //     return "odd";
        // }
        static void table(int n){
            // int multiply=1;
            for (int i =1;i<11;i++){
                int multiply= i*n;
                System.out.println(multiply);
            }
        }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value= ");
        int n = sc.nextInt();
        table(n);
        // System.out.println(evenOrOdd(a));
        // prime(a);
        // Factorial(a);
        // System.out.print("enter the second value=");
        // int n = sc.nextInt();
        // System.out.println(sumValue(a, n));
        sc.close();
    }
}
