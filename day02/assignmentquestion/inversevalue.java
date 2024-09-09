package day02.assignmentquestion;
import java.util.Scanner;
public class inversevalue {
    static int inverseValue(int n) {
        int i = 0;
        while (n != 0) {
            i = i * 10 + n%10;
            n /= 10;
        }
        return i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(inverseValue(n));
        sc.close();
    }
}