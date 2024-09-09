package day02.assignmentquestion;
import java.util.Scanner;
public class chewbaccanum {
    public static void main(String[] args) {
        chewbaccanum();
    }
    public static void chewbaccanum(){
        Scanner sc = new Scanner (System.in);
        String n = sc.nextLine();
        int t =0;
        int sub=0;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n.length(); i++) {
            t = n.charAt(i)- '0';
            sub = 9-t;
            if (i==0 && sub ==00){
                result.append(t);
            }else {
                // result.append(Math.min(t,sub));
            }
        }
        System.out.println(result.toString());
            sc.close();
        }
    }
    
    

