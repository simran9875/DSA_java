package practice3;

public class sorting {
    static void display (int [] arr){
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void bubble(int[] arr){
        for(int i =0;i<arr.length-1;i++){
            for (int j =0;j<arr.length-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
            }
        }
    }
    static void selection(int [] arr){
        for (int i =0;i<arr.length-1;i++){
            int smallest=i;
            for (int j =i+1;j<arr.length;j++){
                if (arr[smallest]>arr[j]){
                    smallest =j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i]= temp;
        }
    }
    static void insertion(int [] arr){
        for (int i =1;i<arr.length;i++){
            int currentElement = arr[i];
            int j = i-1;
            while (j>=0 && currentElement < arr[j]){
                arr[j+1]= arr[j];
                j--;
            }
            arr[j+1]= currentElement;
        }
    }
    public static void main(String[] args) {
        int[] arr = {7,8,3,1,2};
        insertion(arr);
        // selection(arr);
        // bubble(arr);
        display(arr);
    }
}
