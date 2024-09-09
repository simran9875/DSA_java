package day02;
import java.util.Scanner;
public class primenumber{
static boolean primeNumber (int n){
    // System.out.println(n);
    for (int i=2;i<n/2;i++){
    if (n%i==0){
        return false;
    }
    }return true;
    

    // int i=1;
    // i=i+1;
// int temp = a;
//  a= b;
//  b=temp;
// System.out.println(a+" "+b);
}
public static void main(String[] args) {
    Scanner sc= new  Scanner (System.in);
    int n = sc.nextInt();
    // int a=20; int b=15;
    System.out.println(primeNumber(n));

    sc.close();
    // int a=20; int b=15;
    // System.out.println();
    // sayHi("HELLO WORLD");
    // sayHi("hello world");
    // swap(a, b);
    }
}