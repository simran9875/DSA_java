package day06;
// import java.util.Scanner;
// public class rainwater {
    public class Solution {
        public static int trap(int[] height) {
            int left = 0, right = height.length - 1;
            int ans = 0;
            int left_max = 0, right_max = 0;
            while (left < right) {
                if (height[left] < height[right]) {
                    left_max = Math.max(left_max, height[left]);
                    ans += left_max - height[left];
                    ++left;
                } else {
                    right_max = Math.max(right_max, height[right]);
                    ans += right_max - height[right];
                    --right;
                }
            }
            return ans;
        }
        // public static void main(String[] args) {
        //     Scanner sc = new Scanner(System.in);
        //     int n = sc.nextInt();
        //     int[] arr = new int[n];
        //     for (int i=0;i<n;i++){
        //         trap(arr);
        //     }sc.close();
        // }
    }

