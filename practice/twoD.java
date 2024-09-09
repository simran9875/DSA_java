package practice;
import java.util.Scanner;
public class twoD {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int [][] nums = new int [row][col];
        for (int i =0;i<row;i++){
            for (int j = 0;j<col;j++){
                nums [i][j]= sc.nextInt();
            }
        }
        int x =  sc.nextInt();

        
            for (int i = 0;i<row;i++){
                for (int j =0;j<col;j++){
                    if (nums[i][j]==x){
                        System.out.println(i+ "  "+j);
                    }
                }
            }
        
    

        sc.close();
    }
}
