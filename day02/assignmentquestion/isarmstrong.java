package day02.assignmentquestion;
import java.util.Scanner;
public class isarmstrong {
    static int countNum(int n){
        int count=0;
        while (n!=0){
            n/=10;
            count =count+1;
        }return count;
    }
    static boolean armStrong(int n){
        int d=countNum(n);
            int sum =0;
            int temp=n;
            while (temp!=0){
                sum+=Math.pow(temp%10, d);
                temp/=10;
        }
            return sum == n;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        if (armStrong(n)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
        sc.close();

    }
}
