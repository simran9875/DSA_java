package day26;

import java.util.Arrays;

public class MCM1 {
	
	static int f(int[] arr, int i, int j,int[][] dp){
        if(i == j)
            return dp[i][j]=0;
        
        if(dp[i][j]!=-1)
            return dp[i][j];

        int mini = Integer.MAX_VALUE;
        for(int k = i; k<= j-1; k++){
            int ans = f(arr,i,k,dp) + f(arr, k+1,j,dp) + arr[i-1]*arr[k]*arr[j];
            mini = Math.min(mini,ans);
        }
        
        return dp[i][j]=mini;
    }
    
    
    static int matrixMultiplication(int[] arr, int N){
        int[][] dp = new int[N][N];
        for(int i[] : dp)
            Arrays.fill(i,-1);

        int i =1;
        int j = N-1;
        return f(arr,i,j, dp);        
    }
    
    public static void main(String args[]) {
        int arr[] = {10,15, 20, 25};
        int n = arr.length;
        System.out.println("The minimum number of operations are "+
            matrixMultiplication(arr,n));
    }

}
