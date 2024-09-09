package assignment2;
import java.util.Scanner;
public class subarr {
    // static int subArray(int [] arr){
    //     for (int i = 0;i<arr.length;i++){
            
    //     }
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int [] arr = new int[n];
    //     for (int i=0;i<n;i++){
    //         arr [i]= sc.nextInt();
    //         subArray(arr);
    //         sc.close();
    //     }
    // }
//     static void subarray(int[] arr, int n, int k){
//         int count=0;
//         for(int i=0;i<n;i++){
//             int sum=0;
//             for(int j=i;j<n;j++){
//                 sum+=arr[j];
//                 if(sum == k){
//                     count++;
//                 }
//             }
//         }
//         System.out.print(count);
//     }
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     int[] arr= new int[n];
//     for(int i=0;i<n;i++){
//         arr[i]=sc.nextInt();
//     }
// 	int k=sc.nextInt();
//     subarray(arr, n, k);
//     sc.close();
// }

public static boolean isAllZero(int[] arr){
    for(int i=0;i<arr.length;i++){
        if(arr[i]!=0){
            return false;
        }
    }
    return true;
}
public static long countSubarraysWithSumK(int[] arr, int k) {
    boolean isAll0=isAllZero(arr);
    if(isAll0){
        long n=arr.length;
        return n*(n+1)/2;
    }
    long count = 0;
    int n = arr.length;
    for (int start = 0; start < n; start++) {
        int sum = 0;
        for (int end = start; end < n; end++) {
            sum += arr[end];
            if (sum == k) {
                count++;
            }
            else if(sum>k){
                break;
            }
        }
    }
    return count;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int k = sc.nextInt();
    int[] arr = new int[N];
    for (int i = 0; i < N; i++) {
        arr[i] = sc.nextInt();
    }
    System.out.println(countSubarraysWithSumK(arr, k));
    sc.close();
}
}
