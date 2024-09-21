package practice1;
import java.util.Scanner;
public class third {
    // static void transpose(int n, int m){
    //     int [][] matrix = new int[n][m];
    //     for (int i = 0;i<n;i++){
    //         for (int j =0;j<m;i++){
    //             System.out.println(matrix[i][j]);
    //         }
    //     }
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] matrix = new int[n][m];
        for (int i = 0;i<n;i++){
            for (int j =0;j<m;i++){
                matrix[i][j]= sc.nextInt();
            }
        }
        for (int i = 0;i<n;i++){
            for (int j =0;j<m;i++){
                System.out.println(matrix[i][j]);
            }
        }
        sc.close();
    }
}
