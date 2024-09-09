package assignment2;
import java.util.Scanner;
public class binary {
    static int binarySearch(int [] arr,int num){
            int i=0,j=arr.length-1;
            int mid=0;
            while(i<=j ){
                mid=(i +j)/2;
                if (arr[mid]==num)
                return mid;
                else if (arr[mid]<num){
                    i=mid+1;
                }else {
                    j=mid-1;
                }
            }return -1;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for (int j = 0; j<n;j++){
            arr[j]=sc.nextInt();
        }
        int value=sc.nextInt();
        int result = binarySearch(arr, value);
        System.out.println(result);
        sc.close();
    }
        
}
