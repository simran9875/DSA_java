package day07;
import java.util.Arrays;
public class array2 {
    static void display(int [][]arr){
        for (int i = 0;i<arr.length;i++){
            for (int j =0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+"  ");
            }System.out.println();
        }
    }
    static void populate(int[][] arr){
        int n =1;
        for (int i = 0;i<arr.length;i++){
            for (int j =0;j<arr[0].length;j++){
                arr[i][j]=n;
                n++;
            }
        }
    }
    static int sum(int[][] arr){
        int count =0;
        for (int i= 0;i<arr.length;i++){
            for (int j =0;j<arr[0].length;j++){
                count+=arr[i][j];
            }
        }return count;
    }
    static int[] search (int[][]arr,int n){
        int[]ans = new int [2];
        for (int i= 0;i<arr.length;i++){
            for (int j =0;j<arr[0].length;j++){
                if (arr[i][j]==n){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
            }
        return ans;
    }
    static void transpose(int[][] arr){
        for (int i =0;i<arr.length;i++){
            for (int j =i;j<arr[0].length;j++){
                int temp = arr[i][j];
                arr[i][j]= arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    static void sortByRows(int[][] arr){
        for (int i = 0;i<arr.length;i++){
            Arrays.sort(arr[i]);
        }
    }
    static void sortByColumns(int[][]arr){
        Arrays.sort(arr,(a,b)->Integer.compare(a[0], b[0]));
    }
    static void sortComplete(int[][] nums){
        int[] arr= flaten(nums);
        Arrays.sort(arr);
        fillArray(nums, arr);
    }
    static void fillArray(int[][] nums, int[] arr){
        // int rows= nums.length;
        int cols= nums[0].length;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                nums[i][j]=arr[cols*i + j];
            }
        }
    }
    static int[] flaten(int[][] nums){
        int rows= nums.length;
        int cols= nums[0].length;
        int[] arr= new int[rows * cols];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                arr[cols*i + j]= nums[i][j];
            }
        }
        return arr;
    }
    static public boolean searchMatrix(int[][] matrix, int target) {
        int[]ans = new int [2];
        for (int i = 0;i<matrix.length;i++){
            for (int j =0;j<matrix[0].length;j++){
                if (matrix[i][j]==target){
                    ans[0]=i;
                    ans[1]=j;
                return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // int[][]nums = new int[3][4];
        // int [] arr = {1,2,3,4};
        // int [][] num = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int [][] nums = {{1,2,3},{4,5,6},{7,8,9}};
        // int [][] arr = {{1,8,2},{4,6,5},{3,7,9}};
        // sortComplete(arr);
        // display(arr);
        // System.out.println(searchMatrix(num, 17));
        // sortByColumns(arr);
        // sortByRows(arr);
        // display(arr);
        // int[] indices = search(num,10);
        // System.out.println(indices[0]+" "+ indices[1]);
        // int [][][] array= new int [4][2][1];
        // int [][][] arrays = {};
        // populate(num);
        // display(num);
        // display(nums);
        transpose(nums);
        display(nums);
        // System.out.println(sum(num));
        // System.out.println(arr[3]);
        // int [] arr= new int [5];
        // System.out.println(nums[0]);
        // System.out.println(num[1][3]);
        // System.out.println(nums[2]);
    }
}
