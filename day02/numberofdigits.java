package day02;

public class numberofdigits {
    static int numberOfDigits(int n){
        int count =0;
        while (n!=0){
            n/=10;
            count =count+1;
        }return count;
        // int temp=0;
        // while (n!=0){
        //     temp=temp*10+n%10;
        //     n/=10;
        // }return temp;
    }
    public static void main(String[] args) {
        int n=1234685855;
        System.out.println(numberOfDigits(n));
        // System.out.println(inverseNumber(n));
    }
}

