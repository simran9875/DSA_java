package practice;
import java.util.Scanner;
public class second{
    //average of the 3 values
    // static int average (int n1,int n2, int n3){
    //     int count =0;
    //     count +=(n1+n2+n3)/3;
    //     return count ;
    // }

    // sum od odd numbers
    // static void sumOdOdd(int n ){
    //     int sum=0;
    //     for (int i =1;i<=n;i++){
    //         if (i%2!=0){
    //             sum=sum+i;
    //         }
    //     }System.out.println(sum);
    // }

    // greatest number n1 or n2
    static int Greater(int n1 , int n2){
        if (n1<n2){
            return n2;
        }else {
            return n1;
        }
    }
    static int fib(int n) {
        int a =0;
        int b=1;
        for (int i=1;i<n;i++){
            int c=a+b;
            a=b;
            b=c;
        }return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        // System.out.println(Greater(n1, n2));
        System.out.println(fib(n2));
        // sumOdOdd(n1);
        // int n2 = sc.nextInt();
        // int n3 = sc.nextInt();
        // System.out.println(average(n1, n2, n3));
        sc.close();
    }
}
