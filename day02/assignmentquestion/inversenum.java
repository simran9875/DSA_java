package day02.assignmentquestion;
import java.util.Scanner;
public class inversenum {
    static int inverseNum(int n){
        int a = 0; 
        int b = 0;
        while (n!=0){
            b++;
            int c = n%10-1;
            a = a + b*(int)Math.pow(10,c);
            n/=10;
        }return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        System.out.println(inverseNum(n));
        sc.close();
    }
}
