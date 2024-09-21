package practice2;
import java.util.Scanner;
public class Bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int operation = sc.nextInt();
        int n = 5;//0101
        int pos = 1;
        int bitMask = 1<<pos;
        if (operation==1){
            int newValue = bitMask | n;
        System.out.println(newValue);
        }else {
            int notBit = ~ (bitMask);
            int newnums = (notBit&n);
            System.out.println(newnums);
        }sc.close();
        // operation =0 : clear , operation = 1 : set
        // int operation = 1; // update bit for 1 else update bit for 0
        
        // clear bit
        // int notbitMask=~(bitMask);
        // int newNumber = (notbitMask& n);
        // System.out.println(newNumber); 

        // set bit
        // int newNum = bitMask | n;
        // System.out.println(newNum);

        // get bit
        // if ((bitMask & n)==0){
        //     System.out.println("bit is zero");
        // }else {
        //     System.out.println("bit is one");
        // }
    }
}
