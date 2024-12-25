package day25;

import java.util.Arrays;

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
	public static int multiply(int a , int b) {
		if(a==1) {
			return b;
		}int multi = b+multiply(a-1,b);
		return multi;
	}
	public static int multiTD(int a , int b,int []dp) {
		if(a==1) {
			return b;
		}if(dp[a]!=0) {
			return dp[a];
		}return dp[a]=b+multiTD(a-1,b,dp);
	}
	public static int MultiBU(int a,int b) {
		int [][] dp = new int[a+1][b+1];
		for (int i = 1; i <= a; i++) {
	        for (int j = 1; j <= b; j++) {
	            dp[i][j] = dp[i - 1][j] + j; 
	        }
	    }return dp[a][b];
	}
	public static int pow(int a ,int b) {
		if(a==1) {
			return b;
		}int p = b*pow(a-1,b);
		return p;
	}
	public static int powTD(int a,int b, int[][] dp) {
		if(a==1) {
			return b;
		}
		if(dp[a][b]!=0) {
			return dp[a][b];
		}return dp[a][b]=b*powTD(a-1,b,dp);
	}
	public static int powBU(int a,int b) {
		int[][]dp= new int[a+1][b+1];
		for(int i=0;i<=a;i++) {
			dp[i][0]=1;
		}
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=b;j++) {
				dp[i][j]=dp[i][j-1] * i;
			}
		}return dp[a][b];
	}
	
	
	public static void main(String[] args) {
//		System.out.println(fib(6));
//		System.out.println(fibo(6,new int[7]));
//		System.out.println(fiboBU(6));
//		System.out.println(multiply(3,4));
//		System.out.println(multiTD(3,4,new int[3*4]));
//		System.out.println(MultiBU(3,4));
		System.out.println(pow(3,3));
		System.out.println(powTD(3,3,new int[4][4]));
		System.out.println(powBU(3,3));
	}

}
