package practice2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class spiral {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return result;
        }
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
    }return result;
}
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int row = sc.nextInt();
    int col = sc.nextInt();
    int [][] matrix = new int [row][col];
    for (int i = 0 ;i<row;i++){
        for (int j = 0;j<col ;j++){
            matrix[i][j]= sc.nextInt();
        }sc.close();
        // System.out.println(spiralorder(matrix));
    }
}
}
