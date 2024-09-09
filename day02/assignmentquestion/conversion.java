package day02.assignmentquestion;
import java.util.Scanner;
public class conversion {
    // static int AnyToAny(int n1 , int n2){
    //     int i=0;
    //     int n =1;
    //     while (i<n1){
    //         int a =
    //     }

    
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int b=sc.nextInt();
        int a=sc.nextInt();
        int n=sc.nextInt();
        sc.close();
        long num =A2D(n,b);
        num = D2A(num,a);
        System.out.print(num);
    }
    static long A2D(long n, int b){
        long D=0;
        for (long digit=0,i=0;n>0;n/=10,i++){
            digit=n%10;
            D+=(Math.pow(b,i))*digit;
        }
        return D;

    }
    static long D2A(long n, int a){
        long A=0;
        long m=0;
        int i=1;
        while(true){
            if(a>n) break;
            m=n%a;
            A+=m*i;
            i*=10;
            n/=a;
        }
        A+=n*i;
        return A;

    }
}
    

