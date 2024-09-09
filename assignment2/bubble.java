package assignment2;
import java.util.Scanner;
public class bubble {
    static void display (int [] arr){
        for (int i:arr)
        System.out.print(i+ " ");
    }
    static void bubbleSort(int[] arr){
        for (int turn=1; turn<arr.length;turn++){
            for(int i=0;i<arr.length-turn;i++){
                if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for (int j = 0; j<n;j++){
            arr[j]=sc.nextInt();
        }sc.close();
        bubbleSort(arr);
        display(arr);
    }
}
