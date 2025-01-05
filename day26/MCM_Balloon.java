package day26;

import java.util.ArrayList;
import java.util.Arrays;

public class MCM_Balloon {
	
	static int maxCoins(int i, int j, ArrayList<Integer> a) {
        if (i > j) return 0;
        int maxi = Integer.MIN_VALUE;
        for (int ind = i; ind <= j; ind++) {
            int cost = a.get(i - 1) * a.get(ind) * a.get(j + 1)
                       + maxCoins(i, ind - 1, a) + maxCoins(ind + 1, j, a);
            maxi = Math.max(maxi, cost);
        }
        return maxi;
    }
    
    static int maxCoins(ArrayList<Integer> a) {
        int n = a.size();
        a.add(1);
        a.add(0, 1);
        return maxCoins(1, n, a); 
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(3, 1, 5, 8));
        int ans = maxCoins(a);
        System.out.println(ans);
    }

}
