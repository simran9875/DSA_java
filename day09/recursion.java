package day09;
import java.util.Scanner;
public class recursion {
    // head recursion 
    static int multiply(int a , int b){
        if(a==1){
            return b;
        }int x = b+multiply(a-1,b);
        return x;
    }
    // head recursion 
    static int factorial(int n){
        if (n==1||n==0){
            return 1;
        }
        int x = n*factorial(n-1);
        return x;
    }
    // tail recursion
    static int fac(int n , int x){
        if (n==1||n==0){
            return x;
        } return fac((n-1),n*x);
    }
    // head recursion (time complexity = 2n)
    static int power(int a , int b){
        if (b==0){
            return 1;
        } int x = a*power(a,b-1);
        return x;
    }
    // tail recursion (time complexity = n)
    static int pow(int a, int b,int x){
        if (b==0){
            return x;
        }return pow(a, b-1, a*x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(fac(b, x));
        // System.out.println(pow(a, b, x));
        // System.out.println(power(a, b));
        // System.out.println(multiply(a, b));
        // System.out.println(factorial(a));
        sc.close();
    }
}

