package practice;
import java.util.Scanner;
public class TC_SC {
    // static void time(int n){
    //     for(int i=1;i<=n;i++){
    //         for (int j=1;j<=n;j++){
    //     System.out.print("hello"+ "  ");
    //         }System.out.println();
    //     }
    // }
    public static void main(String[] args) {
        // int [] marks = new int [3];
        Scanner sc= new Scanner (System.in);
        int value = sc.nextInt();
        int[] numbers= new int[value];
        // int[] value = {1,4,7,3,7};
        for (int i =0;i<numbers.length;i++){
            numbers[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        for (int i=0;i<numbers.length;i++){
            if (numbers[i]==x)
            System.out.println(i);
        }
        // System.out.println(value[3]);
        // System.out.println(value[2]);
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // time(n);
        sc.close();
    }
}
