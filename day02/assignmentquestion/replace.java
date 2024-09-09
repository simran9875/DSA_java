package day02.assignmentquestion;
import java.util.Scanner;
public class replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        replaceAll(n);
        sc.close();
    }
    static void replaceAll(long n){
        long i=n;
        long multiply =1;
        if (i==0){
            System.out.println(5);
        }else {
            while (n!=0){
                long digit =n%10;
                if (digit == 0){
                    i = i +multiply *5;
                }multiply=multiply*10;
                n/=10;
            }
        }System.out.println(i);
            
        }
    }

