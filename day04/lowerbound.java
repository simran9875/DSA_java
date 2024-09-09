package day04;

public class lowerbound {
    static int lowerBound(int [] arr, int num){
        int firstOccurence=-1;
        int low=0,high =arr.length-1, mid=0;
        while (low<=high){
            mid=(low+high)/2;
            if(arr[mid]==num){
                firstOccurence=mid;
                high=mid-1;
            }else if (arr[mid]>num){
                high=mid-1;
            }else {
                low =mid+1;
            }
            
        }return firstOccurence;
    }
    public static void main(String[] args) {
        int[] nums ={1,2,2,2,2,6,7,8,9};
        System.out.println(lowerBound(nums, 2));
    }
}
