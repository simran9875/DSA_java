package day03;

public class inverseorderarr {
    static void inverseArr(int[] arr){
        for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+ "  ");
        }System.out.println();
        // for (int i=1;i<arr.length;i++){
        //     int a,b;
        //     int temp=arr[a];
        //     arr[a]=arr[b];
        //     arr[b]=temp;


        // int n=0;
        // while (n!=0){
        // temp=temp*10+n%10;
        // n/=10;
        
    }
    
    

public static void main(String[] args) {
    int [] arr = {1,2,3,4,5};
    // int a=2;
    // int b=5;
    inverseArr(arr);

}
}
