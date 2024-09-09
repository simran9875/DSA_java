package day02.assignmentquestion;

import java.util.Scanner;

public class bostan {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if (isBostonNumber(n)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
    public static boolean isBostonNumber(int number) {
        int sumOfDigits = sumDigits(number);
        int sumOfPrimeFactorDigits = sumPrimeFactorDigits(number);
        
        return sumOfDigits == sumOfPrimeFactorDigits;
    }
    public static int sumDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    public static int sumPrimeFactorDigits(int num) {
        int sum = 0;
        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                sum += sumDigits(i);
                num /= i;
            }
        }
        return sum;
        }
    }
