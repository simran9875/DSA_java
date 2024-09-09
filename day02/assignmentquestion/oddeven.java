package day02.assignmentquestion;
import java.util.Scanner;
public class oddeven {
    static void odd_even(int n){
        int even =0;
        int odd =0;
        while (n!=0){
            int last = n%10;
            if (last%2==0){
                even = even + last;
            }else {
                odd = odd +last;
            }n/=10;
        }if (even %4==0 || odd%3==0){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            int num = sc.nextInt();
            odd_even(num);
            
        }sc.close();
        
    }
}
