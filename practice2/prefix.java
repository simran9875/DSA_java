package practice2;

public class prefix {
    static void display(int [] arr){
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
    static void pre(int[] arr){
        for (int i =0;i<arr.length-1;i++){
            arr[i+1]= arr[i]+arr[i+1];
        }
    }
    static void suf(int [] arr){
        for (int i=arr.length-2;i>0;i--){
            arr[i+1]= arr[i]+arr[i+1];
        }
    }
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6};
        // for the display before any task
        // display(nums);

        // for the prefix
        // pre(nums);
        // display(nums);

        // for the suffix
        suf(nums);
        display(nums);
    }
}
