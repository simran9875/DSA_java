package practice3;

public class recursion {
    static void num(int n){
        if (n==0){
            return;
        }System.out.println(n);
        num(n-1);
    }
    static void base(int n){
        if (n==6){
            return ;
        } System.out.println(n);
        base(n+1);
    }
    static void sum(int i,int n, int sum ){
        if (i==n){
            sum+=i;
            System.out.println(sum);
            return ;
        } sum+=i;
        sum(i+1, n, sum);
    }
    public static void main(String[] args) {
        int i =1;
        int n = 5;
        sum(i, n, 0);
        
        // int n =5;
        // num(n);
        // int n =1;
        // base(n);

    }
}
