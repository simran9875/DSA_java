package day02.assignmentquestion;
import java.util.Scanner;
public class LCM {
    static int LCM(int a, int b){
        int gcd =1;
        int lcm=1;
        for (int i=1;i<=a&& i<=b;i++){
            if (a%i==0&& b%i==0){
                gcd=i;
            }lcm = (a*b)/gcd;
        }return lcm;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(LCM(a, b));
        sc.close();
    }
}
