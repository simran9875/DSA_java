package day02.assignmentquestion;
import java.util.Scanner;
public class questionprime {
    static String primeNumber(int n){
        for (int i=2;i<n/2;i++){
        if (n%i==0){
            return ("not prime");
        }
        }return "prime";
    
        }
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println(primeNumber(n));
            sc.close();
}
}
