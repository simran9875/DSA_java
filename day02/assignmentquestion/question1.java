package day02.assignmentquestion;
import java.util.Scanner;
public class question1 {
    static void GCD(int n1, int n2){
        int gcd =0;
        for (int i=1;i<=n1;i++){
            if (n1%i==0 && n2%i==0){
                gcd =i;
            }
        }System.out.println(gcd);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first value= ");
        int n1 = sc.nextInt();
        System.out.print("enter the second value=");
        int n2 = sc.nextInt();
        GCD( n1, n2);
        sc.close();

    }
}
