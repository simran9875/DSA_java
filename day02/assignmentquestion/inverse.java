package day02.assignmentquestion;
import java.util.Scanner;
public class inverse {
    @SuppressWarnings("unused")
    static int inverse(int num){
        int a =0,b=0,temp=0;

        for (int i = 0; i<num;i++){
            while (i!=0)
            if  (i%2==0){
                System.out.println(i);
            }else {
                temp = i;
                a = b;
                b = temp;
            }
        }return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        inverse(n);
        sc.close();
    }
}

