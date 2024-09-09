package day08;
import java.util.ArrayList;
public class arrayList {
    // private static ArrayList<Integer> Collections;

    public static void main(String[] args) {
        ArrayList<Integer> nums= new ArrayList<>();
        int[] arr= {30,30,30,10,20,10,1,40,40};
        nums= findSubArray(arr, 2);
        System.out.println(nums);
    }
        //add
        // arr.add(100);
        // arr.add(200);
        // arr.add(300);
        // System.out.println(arr);
        // remove
        // arr.remove(1);
        // System.out.println(arr);
        // update
        // arr.set(1, 20);
        // System.out.println(arr);
        //size
        // System.out.println(arr.size());
        // sort
        // Collections.sort(arr);
        // System.out.println(arr);
        // insert
        // arr.add(1,100);
        // System.out.println(arr);
        // arr.clear();
        // System.out.println(arr);
        // create a function to find the maximum sum subarray of size k
        // [30,30,30,10,20,10,1,40,40]: k = 2;
        // output [40,40]
        static ArrayList<Integer> findSubArray(int[] arr, int k){
            int start=0;
            int end= k-1;
            int maxSum=0;
            for(int i=0;i<=end;i++)
                maxSum+=arr[i];
            int currSum=maxSum;
            int index= 0;
            while(end<arr.length-1){
                currSum-= arr[start];
                start++;
                end++;
                currSum+= arr[end];
                if(maxSum<currSum){
                    index= start;
                    maxSum= currSum;
                }
            }
    
            ArrayList<Integer> nums= new ArrayList<>();
    
            for(int i=index; i<index+k;i++){
                nums.add(arr[i]);
            }
    
            return nums;
        }
    }
            // int sum =0;
            // int maxSum =0;
            // for (int i =0;i<num.length;i++){
            //     for(int j = 0;j<=i+k;j++){
            //         if ([i+k]>sum){
            //             sum  = [i+k];
            //             maxSum = sum;
            //             i++;
            //         }if (maxSum<sum){
            //             maxSum = sum;
            //         }
            //     }
    
            // }
    //     }
    // }

