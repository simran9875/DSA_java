package day02.assignmentquestion;
import java.util.Scanner;
public class sum_odd_even{
    static void sum_odd_even(int n){
        int odd =0, even =0;
        int i;
        int count =1;
        while(n!=0){
            i=n%10;
            n/=10;
            if (count %2==0){
                even =even + i;
            }else {
                odd = odd + i;
            }count ++;
        }System.out.println(odd);
        System.out.println(even);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sum_odd_even(n);
        sc.close();
    }
}
