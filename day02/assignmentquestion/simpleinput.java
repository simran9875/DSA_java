package day02.assignmentquestion;
// import java.util.Scanner;
// public class simpleinput {
//     static int  simpleInput(int n){
//         while (n>0)
//             System.out.println(n);
//         if (n<0){
//             System.out.println("negitive value");
            
//         }
//         return n;
//     }
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         int n = sc.nextInt ();
//         for(int i=1;i<=n;i++){
//             int m = sc.nextInt();
//             simpleInput(m);
//         }
//         sc.close();
//     }            
// }
// import java.util.Scanner;

// public class simpleinput {
//     static int display(int n){
//         for (int i = 1;i<=n;i++){
//             System.out.println(i);
//         }return n;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int i = 0;
//         System.out.println();
//         while (true) {
//             int num = sc.nextInt();
//             i += num;
//             if (i < 0) {
//                 System.out.println();
//                 break;
//             }
//         }display(i);
//         sc.close();
//     }
    import java.util.Scanner;

public class simpleinput {
    static void display(int n){
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true) {
            int num = sc.nextInt();
            sum += num;
            if (sum < 0) {
                break;
            }
            System.out.println(num);
        }
        
        sc.close();
    }
}

