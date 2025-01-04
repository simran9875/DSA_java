package day25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MCM_ROD {
	static int f(int i, int j, ArrayList<Integer> cuts, int[][] dp) {
        // Base case
        if (i > j) {
            return 0;
        }   
        if(dp[i][j]!=-1)
            return dp[i][j];
        int mini = Integer.MAX_VALUE;

        for (int ind = i; ind <= j; ind++) {
            int ans = cuts.get(j + 1) - cuts.get(i - 1) +
                      f(i, ind - 1, cuts, dp) +
                      f(ind + 1, j, cuts, dp);

            mini = Math.min(mini, ans);
        }

        return dp[i][j]=mini;
    }


    static int costBU(int n, int c, ArrayList<Integer> cuts) {
        // Modify the cuts array
        cuts.add(n);
        cuts.add(0);
        Collections.sort(cuts);

        int[][] dp = new int[c + 2][c + 2];

        for (int[] row : dp) {
            Arrays.fill(row, 0);
        }

        for (int i = c; i >= 1; i--) {
            for (int j = 1; j <= c; j++) {
                if (i > j) continue;

                int mini = Integer.MAX_VALUE;

                for (int ind = i; ind <= j; ind++) {
                    int ans = cuts.get(j + 1) - cuts.get(i - 1) + dp[i][ind - 1] + dp[ind + 1][j];
                    mini = Math.min(mini, ans);
                }

                dp[i][j] = mini;
            }
        }

        return dp[1][c];
    }
    // Function to calculate the minimum cost
    static int cost(int n, int c, ArrayList<Integer> cuts) {
        // Modify the cuts array
        cuts.add(n);
        cuts.add(0);
        Collections.sort(cuts);

        int[][] dp= new int[c+1][c+1];
        for(int[] i:dp)
            Arrays.fill(i,-1);

        return f(1, c, cuts, dp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> cuts = new ArrayList<>(Arrays.asList(1,2));
        int c = cuts.size();
        int n = 4;

        System.out.println("The minimum cost incurred: " + cost(n, c, cuts));
    }
}
