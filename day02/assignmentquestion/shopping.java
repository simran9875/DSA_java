package day02.assignmentquestion;
import java.util.Scanner;
public class shopping {
    static void shopping(int n, int m){
        int a = 1;
        int b = 2;
        int sum1= a;
        int sum2 = b;
        for (int i=1;i<=Math.pow(10, 6);i++ ){
            a +=2;
            sum1+=a;
            b+=2;
            sum2+=b;
            if(sum1>n){
                System.out.println("Harshit");
                break;
            }else if (sum2>m){
                System.out.println("Aayush");
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        for (int i=1;i<=n1;i++){
        int n = sc.nextInt();
        int m = sc.nextInt();
        shopping(n, m);
        }
        sc.close();
    }
}
