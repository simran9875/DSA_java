import java.util.Scanner;
public class lecture3 {
    @SuppressWarnings("resource")
    public static void main(String [] args){
        // System.out.println("hello world");
        // int a=20;
        // int b=10;
        // int sum=a+b;
        // int multiple=a*b;
        // int subtract=a-b;
        // System.out.println(sum);
        // System.out.println(multiple);
        // System.out.println(subtract);
        // int modulas=a%b;
        // System.out.println(modulas);
        Scanner sc = new Scanner(System.in);
        int age  =sc.nextInt();
        
        if (age>=18){
            System.out.println("you can vote");
        }else{
        System.out.println("you can not vote");
        }
        }

    
    }

