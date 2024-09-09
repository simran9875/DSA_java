package assignment2;
import java.util.Scanner;
public class productofK {
    static long subArr(int [] arr){
        int count = 0;
        int max = 0;
        int left =0;
        for (int right =0; right<arr.length;right++){
            if (arr[right]==0){
            count++;
            }
        while (count >1){
            if (arr[left]==0){
                count--;
            }left++;
        }max= Math.max(max,right-left);
    }return max;
}
        
//         long count = 0;
//     int n = arr.length;
//     for (int start = 0; start < n; start++) {
//         int product = 1;
//         for (int end = start; end < n; end++) {
//             product = product*arr[start];
//             if (product >10) {
//                 count++;
//             }
//             else if(product <=10){
//                 break;
//             }
//         }
//     }
//     return count;
// }
    //     if (k <= 1) return 0;
    //     int product = 1;
    //     int count = 0;
    //     int left = 0;
    //     for (int right = 0; right < arr.length; right++) {
    //         product *= arr[right];
    //         while (product >= k && left <= right) {
    //             product /= arr[left];
    //             left++;
    //         }
    //         count += (right - left + 1);
    //     }
    //     return count;
    // }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
        arr[i] = sc.nextInt();
        }
        System.out.print(subArr(arr));
    sc.close();
        
    }
}
// public static int longestSubarray(int[] nums) {
//     int maxLen = 0;
//     int left = 0;
//     int zeroCount = 0;

//     for (int right = 0; right < nums.length; right++) {
//         if (nums[right] == 0) {
//             zeroCount++;
//         }

//         // If we have more than 1 zero, move the left pointer to reduce zero count
//         while (zeroCount > 1) {
//             if (nums[left] == 0) {
//                 zeroCount--;
//             }
//             left++;
//         }

//         // Calculate the maximum length subarray with at most one zero
//         maxLen = Math.max(maxLen, right - left);
//     }

//     // Since we must delete one element, the result is maxLen
//     return maxLen;
// }

// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     int n = sc.nextInt();  // Size of the array
//     int[] nums = new int[n];

//     for (int i = 0; i < n; i++) {
//         nums[i] = sc.nextInt();
//     }

//     sc.close();

//     int result = longestSubarray(nums);
//     System.out.println(result);
// }
// }
