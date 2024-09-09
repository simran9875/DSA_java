package assignment2;
import java.util.Scanner;
public class intersection {
    // static void intersectionArr(int[] arr1 ,int[] arr2){
    //     // int temp =0;
    //     // int temp=0;
        
    //     for (int first =0 ;first <arr1.length;first++){
    //         for (int second =0;second<arr2.length;second++){
    //             if(first ==second){
    //                 System.out.println();
    //             }
    //         }
    //     }
    //     // return temp;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner (System.in);
    //     int n = sc.nextInt();
    //     int m = sc.nextInt();
    //     int[] arr = new int[n];
    //     int [] array = new int[m];
    //     for (int i=0;i<n;i++){
    //     for (int j =0;j<m;j++){
    //         array[j]= sc.nextInt();
    //     }arr[i]= sc.nextInt();
    //     intersectionArr(arr, array);
    //         // System.out.println();
    //         // sc.close();
    //     }sc.close();
    // }
    // private static void intersection(int[] arr, int n, int m) {
    //     // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'intersection'");
    // }
    // private static void intersection(int[] arr, int n, int m) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'intersection'");
    // }
    public static int  interSectionArr(int[] arr1,int[] arr2){
        int count =0;
		for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                // while (arr[j]!=arr[i]){
                //     break;
                // }
			    if(arr2[i]==arr1[j]){
					count++;
				}
            }
		}return count;
	}
    public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] arr=new int[N];
        for(int i=0;i<N;i++){
			arr[i]=sc.nextInt();
        }
		int N2=sc.nextInt();
        
		int[] arr2=new int[N2];

		
		
		for(int i=0;i<N2;i++){
			arr2[i]=sc.nextInt();
        }

		System.out.println(interSectionArr(arr, arr2));
        sc.close();

    }
    
}
