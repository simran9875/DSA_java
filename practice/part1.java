package practice;
import java.util.Scanner;
public class part1 {


    static void oddNum(int n){
        int sum = 0;
        for (int i =1;i<=n;i++){
            if (i%2!=0){
                sum=sum+i;
            }
        }System.out.println(sum);
        }
        static void greatest(int a,int b){
            if (a>b){
                System.out.println("a is greater");
            }else {
                System.out.println("b is greater");
            }
        }
        static double circle (int r){
            return 2 * 3.14 * r;
        }
        static void check(int age){
            if (age >=18){
                System.out.println("you are eligible");
            }else {
                System.out.println("you are not eligible");
            }
        }
        // static double power (int x, int n){
        //     return Math.pow(x,n);
        // }
        static void common(int a , int b){
            while (a!=b){
                if (a>b){
                    a = a -b;
                }else {
                    b = b - a;
                }
            }System.out.println(b);
        }
        
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.print(a+" ");
        if(n > 1) {
            for(int i=2; i<=n; i++) {
                System.out.print(b+" ");
                int temp = b;
                b = a + b;
                a = temp;
            } 
            System.out.println();
        }
    //     int x = sc.nextInt();
    //     int n = sc.nextInt();
    //     // common(x, n);
        // System.out.println(power(x, n));

        // int positive = 0, negative = 0, zeros = 0;
        // System.out.println("Press 1 to continue & 0 to stop");
        // Scanner sc = new Scanner(System.in);
        // int input = sc.nextInt();

        // while(input == 1) {
        //     System.out.println("Enter your number : ");
        //     int number = sc.nextInt();
        //     if(number > 0) {
        //         positive++;
        //     } else if(number < 0) {
        //         negative++;
        //     } else {
        //         zeros++;
        //     }
        //     System.out.println("Press 1 to continue & 0 to stop");
        //     input = sc.nextInt();
        // }
        // System.out.println("Positives : "+ positive);
        // System.out.println("Negatives : "+ negative);
        // System.out.println("Zeros : "+ zeros);
        // check(age);
        // do {

        // }while (true);
        // int m = sc.nextInt();
        // System.out.println(circle(n));
        // greatest(n, m);
        // oddNum(n);
        sc.close();
    }
}
