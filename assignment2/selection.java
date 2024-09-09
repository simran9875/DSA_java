package assignment2;
import java.util.Scanner;
public class selection {
    static void display(int[] arr){
        for (int i:arr)
            System.out.print(i+"  ");
    }static void selectionSort(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            int idx=minimumValue(arr,i);
            int temp=arr[i];
            arr[i]=arr[idx];
            arr[idx]=temp;
        }
    }
    static int minimumValue(int[]arr, int a){
        int mini=a;
        for(int i=a+1; i<arr.length;i++)
        if (arr[mini]>arr[i])
        mini=i;
        return mini;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for (int j = 0; j<n;j++){
            arr[j]=sc.nextInt();
        }sc.close();
        selectionSort(arr);
        display(arr);
    }
}
