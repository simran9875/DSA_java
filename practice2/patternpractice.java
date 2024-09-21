package practice2;

// import java.util.Scanner;
public class patternpractice{
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // System.out.print("enter the value= ");
        // int m = sc.nextInt();
        // int n = sc.nextInt();



        // 0 1 TRIANGLE
        int n=5;
        for (int i=1;i<=n;i++){
            for (int j=1; j<=i; j++){
                // int sum=i+j;
                if ((i+j)%2==0){
                System.out.print("1");
            }else {
                System.out.print("0");
            }
        }System.out.println();
    }


        // FLOYTS TRIANGLE
        // int n=5;
        // int number=1;
        // for (int i=1;i<=n;i++){
        //     for (int j=1;j<=i;j++){
        //         System.out.print(number+ "  ");
        //         number = number +1;
        //     }System.out.println();
        // }


        //  INVERT HALF PYRAMID WITH NUMBER
        // int n=5;
        // for (int i=1; i<=n; i++){
        //     for (int j=1; j<=n-i+1; j++){
        //         System.out.print(j);
        //     }System.out.println();
        

        //INVERT HALF PYRAMID 180 DEGREE
        // int n=4;
        // for (int i=1;i<=n;i++){
        //     for (int j=1; j<=n-i; j++){
        //     System.out.print("  ");
        //     }
        //     for (int j=1;j<=i;j++){
        //         System.out.print("* ");

        //     }System.out.println();
        // }
        



        //INVERTED HALF PYRAMID
        // int n=4;
        // for (int i=4;i>=1; i--){
        //     for (int j=1; j<=i; j++){
        //         System.out.print("* ");
        //     }System.out.println("  ");
        // }
        // NUMBER PATTERN PRINTING
        // int n=4;
        // for (int i=1; i<=n; i++){
        //     for (int j=1; j<=i;j++){
        //         System.out.print(j);
        //     }System.out.println();
        // }
    

        // 1*1 MATRIX FOR PATTERN PRINTING
        // int a=4;
        
        // for (int i=1;i<=a;i++){
        //     for(int j=1;j<=i;j++){
        //     System.out.print("* ");
            
        //     }System.out.println("  "); 
        //     }
        
        // 4*5 ONLY ON OUTER AREA
        // int y =4;
        // int n =5;
        // for (int i =1; i<=n; i++){
        //     for (int j=1; j<=y; j++){
        //         if (i==1 || j==1 || i==n || j==y ){
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }System.out.println();
        // }




        // 4*5 MATRIX PATTERN PRINTING
        // for (int i=1; i<=4; i++){
        //     for (int j=1; j<=4;j++){
        //         System.out.print("* ");
        //     } System.out.println("* ");
        // }
        
    }
}

