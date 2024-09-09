package day04;

public class upperbound  {
    static int upperBound(int[] arr, int num ){
        int ans=-1;
        int low=0,high=arr.length-1,mid=0;
        while(low<=high){
            mid=(high+low)/2;
            if (arr[mid]==num){
                ans=mid+1;
                low=mid+1;
            }else if(arr[mid]>num){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }return ans;
    }
    public static void main(String[]args){
        // int num=8;
        int[] num ={1,2,3,4,4,8,8,8,9};
        System.out.println(upperBound(num , 4 ));
    }
}
