package day04;

public class binarysearch {
    // static int binarySearch(int [] arr,int num){
    //     int i=0,j=arr.length-1;
    //     int mid=0;
    //     while(i<=j ){
    //         mid=(i +j)/2;
    //         if (arr[mid]==num)
    //         return mid;
    //         else if (arr[mid]<num){
    //             i=mid+1;
    //         }else {
    //             j=mid-1;
    //         }
    //     }return -1;
    // }
    static boolean linearSearch(int [] arr, int num){
        for (int i=0; i<arr.length;i++)
        if (arr[i]==num){
            return true;
        }
        return false;
        }
    
    public static void main(String[] args){
        int[] nums ={1,2,3,3,3,6,6,7};
        // binarySearch(nums, 3);
        System.out.println(linearSearch(nums, 5));
    }
}
