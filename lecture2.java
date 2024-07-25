import java.util.Scanner;
public class lecture2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
    if (x>y){
        System.out.println("x is greater ");
    }else if(x==y){
        System.out.println("equal");
    }else{
        System.out.println("y is greater");
    }
}
}
