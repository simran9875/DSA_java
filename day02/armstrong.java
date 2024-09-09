package day02;
import java.util.Scanner;
public class armstrong {
    // static int countNumber(int n){
    //     int count =0;
    //     while (n!=0){
    //         n/=10;
    //         count =count+1;
    //         }return count;
    //     }
    //     static boolean armstrong(int n){
    //         int d=countNumber(n);
    //         int sum =0;
    //         // int temp=n;
    //         while (n!=0){
    //             sum+=Math.pow(n%10, d);
    //             n/=10;
    //         }return sum==n;
    //     }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner (System.in);
    //     int n = sc.nextInt();
    //     System.out.println(armstrong(n));
    //     sc.close();
    // }
    static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }
    static boolean isArmstrong(int n) {
        int numDigits = countDigits(n);
        int sum = 0;
        int temp = n;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numDigits);
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (isArmstrong(N)) {
            System.out.println("true");
        }else {
            System.out.println("False");
        }
        sc.close();
    }
}
