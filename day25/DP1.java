package day25;

public class DP1 { 
	static int fib (int n) { // recursive code O(2^n)
		if(n==0 ||n==1) {
			return n;
		}int f1 = fib(n-1);
		int f2 =fib(n-2);
		return f1+f2;
	}
	
	public static int fibo(int n,int[] dp) { // DP function O(n) 
		if(n==0 || n==1) {
			return n;
		}if(dp[n]!=0) {
			return dp[n];
		}int f1 = fibo(n-1,dp);
		int f2 = fibo(n-2 ,dp);
		return dp[n]=f1+f2;
	}
	
	public static int fiboBU(int n) { // bottom up approach
		int [] dp = new int[n+1];
		dp[0]=0;
		dp[1]=1;
		for(int i=2;i<=n;i++) {
			dp[i]=dp[i-1]+dp[i-2];
		}return dp[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(6));
		System.out.println(fibo(6,new int[7]));
		System.out.println(fiboBU(6));
	}

}
