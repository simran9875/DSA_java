package assignment2;
// import java.util.HashSet;
import java.util.Scanner;
public class numofintersection {
    public static int  maxLen(int[] arr1,int[] arr2){
    //     int count =0;
	// 	for(int i=0;i<arr2.length;i++){
    //         for(int j=0;j<arr1.length;j++){
	// 		    if(arr2[i]==arr1[j]){
	// 				count++;
	// 			}if (arr1[j]!=arr2[i]){
    //                 break;
    //             }
    //         }
	// 	}return count;
	// }
    // HashSet<Integer> set = new HashSet<>();
        // for (int i : arr1) {
            
        // }
        
        // int count = 0;
        // Counting elements of arr2 that exist in the set
    //     int count = 0;
    //     for (int i : arr1){
    //     for (int j : arr2) {
    //         if (arr1[i]==arr2[j]) {
    //             count++;
    //         }
    //     }
    //     }
    //     return count;
    // }
    // public static void main (String args[]) {
	// 	Scanner sc=new Scanner(System.in);
	// 	int N=sc.nextInt();
	// 	int[] arr=new int[N];
    //     for(int i=0;i<N;i++){
	// 		arr[i]=sc.nextInt();
    //     }
	// 	int N2=sc.nextInt();
        
	// 	int[] arr2=new int[N2];

		
		
	// 	for(int i=0;i<N2;i++){
	// 		arr2[i]=sc.nextInt();
    //     }

	// 	System.out.println(maxLen(arr, arr2));
    //     sc.close();

    // }
        int n = arr1.length;
        int m = arr2.length;
        int[][] value  = new int[n + 1][m + 1];
        int maxLength = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (arr1[i - 1] == arr2[j - 1]) {
                    value[i][j] = value[i - 1][j - 1] + 1;
                    maxLength = Math.max(maxLength, value[i][j]);
                }
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println(maxLen(arr1, arr2));
        sc.close();
    }
    
}


