package day27;

public class Bit_Manipulation {
	public static boolean checkodd(int n){
        n &= 1;
        return n == 1;
    }
    public static boolean checkdigit(int n , int k){
        n>>=k;
        n &= 1;
        return n == 1;
    }
    public static int countone(int n){
        int count = 0;
        // while(n>0){
        //     if ((n&1) == 1){
        //         count++;
        //     }
        //     n >>= 1;
        // }
        while(n>0){
            n &= n-1;
            count++;
        }
        return count;
    }
    static void subseq(String s){
        int n = s.length();
        for (int i=0 ; i<(1<<n) ; i++){
            printsuseq(s , i);
        }
    }
    static void printsuseq(String s , int i){
        int pos = 0;
        while(i>0){
            if((i&1) != 0){
                System.out.print(s.charAt(pos));
            }
            pos++;
            i >>= 1;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n=7;
        // System.out.println(checkodd(n));
        // System.out.println(checkdigit(n, 2));
        // System.out.println(countone(n));
        subseq("abc");
    }
}
