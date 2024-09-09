package day02.assignmentquestion;
import java.util.Scanner;
public class countdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        char digit = sc.next().charAt(0);
        sc.close();
        int count = countDigitOccurrences(number, digit);
        System.out.println(count);
    }

    public static int countDigitOccurrences(String number, char digit) {
        int count = 0;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit) {
                count++;
            }
        }
        return count;
    }
}
