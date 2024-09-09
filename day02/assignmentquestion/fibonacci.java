package day02.assignmentquestion;
import java.util.Scanner;
public class fibonacci {
    static int fibonacci(int n){
        int a =0;
        int b=1;
        for (int i=1;i<n;i++){
            int c=a+b;
            a=b;
            b=c;
        }return b;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int n =  sc.nextInt();
        System.out.println(fibonacci(n));
        sc.close();
    }
}
