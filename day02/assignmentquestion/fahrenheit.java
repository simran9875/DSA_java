package day02.assignmentquestion;
import java.util.Scanner;
public class fahrenheit {
    static void fahrenheit(int min, int max, int step) {
        for (int f = min; f <= max; f += step) {
            int c = (f - 32) * 5 / 9;
            System.out.println(f + " " + c);
        }
    // static void fahrenheit(int i, int j){
        // for (int k=i;k<=j;k++){
        //     if (k==0||k==20||k==40||k==60||k==80||k==100){
        //         int f = 1;
        //         int c= (f-32)*5/9;
        //         System.err.print(f+"  "+ c +" \n");
        //     }
        // }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int i = sc.nextInt();
        int j= sc.nextInt();
        int n = sc.nextInt();
        fahrenheit(i, j, n);
        sc.close();
    }
}
