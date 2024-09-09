package day03;

public class inversevalue {
    static void Swap(int [] arr, int i, int j) {
        int temp=0;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;


    }
    // static void reverseUsingSwap(int[] arr){
    //     for(int i=0, j=arr.length-1;i<j;j--,i++)
    //     Swap(arr , i,j);
    //     printArr(arr);

    // }
    static void printArr(int[] arr){
        for (int i:arr){
            System.out.print(i+ "  ");
        }System.out.println();
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        Swap(arr, 2, 5);
        printArr(arr);
        // reverseUsingSwap(arr);
        
    }
}
