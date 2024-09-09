package practice;
import java.util.Scanner;
public class hw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int values = sc.nextInt();
        // int [] nums = new int[values];
        // CHECK IF THE ARRAY IS SORTED OR NOT:-
        // for (int i =0;i<nums.length;i++){
        //     nums[i]= sc.nextInt();
        // }
    //     boolean isSorted = true;
    //     for (int i = 0; i < nums.length - 1; i++) {
    //         if (nums[i] > nums[i + 1]) {
    //             isSorted = false;
    //             break;
    //         }
    //     }
    
    //     if (isSorted) {
    //         System.out.println("sorted");
    //     } else {
    //         System.out.println("not sorted");
    //     }
    
    //     sc.close();
    // }
        // boolean isAscending= true ;
        // for (int i =0;i<nums.length-1;i++){
        //     if (nums[i]>nums[i+1]){
        //         isAscending= false;
        //         break;
        //     }
        //     }
        //     if(isAscending) {
        //         System.out.println(" sorted ");
        //     }else {
        //         System.out.println("not sorted");
                
        //     }sc.close();
        // }
        // MAXIMUM AND MIN NO. IN ARRAY:-
        // for (int i=0;i<nums.length;i++){
        //     nums [i] = sc.nextInt();
        // }int max = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;
        // for (int i =0;i<nums.length;i++){
        // if (nums[i]<min){
        //     min=nums[i];
        //     i++;
        // }if (nums[i]>max){
        //     max=nums[i];
        //     i++;
        // }
        // System.out.println("max value "+ max);
        // System.out.println("min value" +min);
        // sc.close();
        // }


        // INPUT TO RETURN OUTPUT:-
        String names[] = new String[values];
        for (int i =0;i<values;i++){
            names[i]= sc.next();
        }
        for (int i =0;i<values;i++){
            System.out.println(names[i]);
        }sc.close();
    }
}