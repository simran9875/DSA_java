package day13;
import java.util.Scanner;
public class sudokuSolver {
    static boolean check(int[][] mat, int i, int j, int n, int number){
        //for checking rows and cols
        for(int x=0;x<n;x++)
            if(mat[x][j]==number|| mat[i][x]==number)
                return false;
        //For Checking Subblock
        int rn= (int)Math.sqrt(n);
        int sx= (i/rn)*rn;
        int sy= (j/rn)*rn;
        //check inside a subblock
        for(int x=sx;x<sx+rn;x++)
            for(int y=sy;y<sy+rn;y++)
                if(mat[x][y]==number)
                    return false;
        //No issues with this number :)
        return true;
    }
    //Recursive Code
    static boolean sudokuSolver(int[][] mat, int i,int j, int n){
        if(i==n) 
            return true; //found ans
        if(j==n) 
            return sudokuSolver(mat, i+1, 0, n);//out of bound
        if(mat[i][j]!=0)
            return sudokuSolver(mat, i, j+1, n);// prefilled

        for(int num=1;num<=9;num++){
            if(check(mat, i, j, n, num)){
                mat[i][j]=num;
                if(sudokuSolver(mat, i, j+1, n))
                    return true;
            }
        }
        //backtrack
        mat[i][j]=0;
        return false;
    }
    //Main Function to create and print sudoku
    public static void main(String[] args) {
        int n=9;
        Scanner sc= new Scanner(System.in);
        
        int mat[][] = new int[n][n];
        //input
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                mat[i][j]= sc.nextInt();

        sudokuSolver(mat, 0,0, n);
        //display
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                System.out.print(mat[i][j]+" ");
            System.out.println();
        }
        sc.close();
        
    }
}

