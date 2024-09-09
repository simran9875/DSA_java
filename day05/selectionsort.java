package day05;
public class selectionsort {
    static void display(int [] arr){
        for (int i:arr)
        System.out.print(i+ " ");
}

    static void selectionSort (int[] arr){
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
            int[] arr={1,6,9,8,7,2,3,5,4};
            selectionSort(arr);
            display(arr);
        }
}
