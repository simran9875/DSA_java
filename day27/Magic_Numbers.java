package day27;

public class Magic_Numbers {
	static int magicseq(int n , int a){
        int mul=a;
        int ans = 0;
        while(n>0){
            int rem = n%2;
            ans += rem * a;
            a *= mul;
            n >>= 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(magicseq(4, 5));
    }
}
