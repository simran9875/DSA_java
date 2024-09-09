package practice;
import java.util.Scanner;
public class fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        StringBuilder change = new StringBuilder();
       for (int i =0;i<size;i++){
        if (change.charAt(i)=='e'){
            // System.out.println(change.replace( 'i'));
        }
        // change.s
       }
        // String email = sc.next();
        // String userName ="";
        // for (int i=0;i<email.length();i++){
        //     if (email.charAt(i)=='@'){
        //         break;
        //     }userName+=email.charAt(i);
        // }System.out.println(userName);
        
        // String result = "";
        // for (int i = 0;i<name.length();i++){
        //     if (name.charAt(i)=='e'){
        //         result+='i';
        //     }else {
        //         result+=name.charAt(i);
        //     }
        // }System.out.println(result);
        // int tolength =0;
        // for (int i =0;i<size ;i++){
        //     name[i]= sc.next();
        //     tolength += name[i].length();
        // }System.out.println(tolength);
        sc.close();
    }
}
