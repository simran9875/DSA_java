package assignment2;
import java.util.Scanner;
public class subArray {
    static int longestSubArr(int [] nums  ){
        int maxLen = 0;
        int currentLen = 1; // At least one element in the subarray

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                currentLen++;
            } else {
                maxLen = Math.max(maxLen, currentLen);
                currentLen = 1; // Reset for the new subarray
            }
        }

        // Check for the last subarray
        maxLen = Math.max(maxLen, currentLen);

        return maxLen;
    }
    //     int count =0;
    //     if (count==0) return 0;
    //     for (int i = 0;i<nums.length;i++){
    //         while (i>0){
    //             count++;
    //         }if (i==0){
    //             break;
    //         }
                
            
    //     }return count;
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(longestSubArr(nums));
        sc.close();
    }
}