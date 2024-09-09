package day02.assignmentquestion;
import java.util.Scanner;
public class printseries {
    static void printSeries(int N1, int N2) {
        int count = 0;
        int n = 1;
        
        while (count < N1) {
            int i = 3 * n + 2; 
            if (i % N2 != 0) {
                System.out.println(i + " "); 
                count++;
            }
            n++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        printSeries(N1, N2);
        sc.close();
    }
    
}
