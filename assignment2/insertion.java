package assignment2;
import java.util.Scanner;
public class insertion {
    static void display (int [] arr){
        for (int i:arr)
        System.out.print(i+ " ");
    }
    static void insertionSort(int [] arr){
        for (int i =0;i<arr.length;i++){
                int key=arr[i];
                int j=i-1;
                while(j>=0&&arr[j]>key){
                    arr[j+1]=arr[j];
                    --j;
                }arr[j+1]=key;
            }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for (int j = 0; j<n;j++){
            arr[j]=sc.nextInt();
        }sc.close();
        insertionSort(arr);
        display(arr);
    }
}
