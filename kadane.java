public class kadane {
    static int sum(int[] nums){
    // static int maxSubArray(int [] nums){
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for (int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            maxSum=Math.max(maxSum,sum);
            if (sum<0){
                sum=0;
            }

            // for (int j=1;j<nums.length;j++){
            //     int tempSum=sum(nums);
            //     maxSum=Math.max(maxSum,tempSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] nums ={-1,2,-3,4,5,6,-7};
        // var[] maxSum;
        System.out.println(sum(nums));
        // System.out.println(sum(nums));
    //     // maxSubArray(nums);
    //     System.out.println(sum(nums, 1, 4));
    //     maxSubArray(nums);
    }
        
    }
