package day05;
public class insertionsort {
    static void display (int [] arr){
        for (int i:arr)
        System.out.print(i+ " ");
    }
    static void insertionSort(int arr[]){
        for (int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                --j;
            }arr[j+1]=key;
        }
    }
    public static void main(String[] args) {
        int[] arr={1,4,2,6,3,8,9};
        insertionSort(arr);
        // Arrays.sort(arr);
        // System.out.println(Arrays.binarySearch(arr, 9));
    display(arr);
    }

}
