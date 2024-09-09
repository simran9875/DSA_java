package practice;

public class first {
    public static void main(String[] args) {
        // int n =5;

        // int n = 4;
//          1
//         1  1
//       1  2  1
//     1  3  3  1
//    1  4  6  4  1
        // for (int i = 0;i<=n;i++){
        //     for (int k = 0;k<=(n-i);k++){
        //         System.out.print("  ");
        //     } int num=1;
        //     for (int j=0;j<=i;j++){
        //         System.out.print(num+"  ");
        //         num=num*(i - j) / (j + 1);
        //         // System.out.print(num+"  ");
        //     }System.out.println();
        // }
        // 1
        // 12
        // 123
        // 1234
        // 12345
        // for (int i=1;i<=n;i++){
        //     for (int j = 1;j<=i;j++){
        //         System.out.print(j);
        //     }System.out.println();
        // }
    // 11111
    // 2222
    // 333
    // 44
    // 5
        // for (int i =1;i<=n;i++){
        //     for (int j =n;j>=i;j--){
        //         System.out.print(i);
        //     }System.out.println();
        // }
        // hollow rhombus
//           * * * * *
//         *       *
//       *       *
//     *       *
//   * * * * *
        // for (int i =1;i<=n;i++){
        //             for (int j=1;j<=n-i;j++){
        //                 System.out.print("  ");
        //             }for (int j= 1;j<=n;j++){
        //                 if (i==1||i==n||j==1||j==n){
        //                     System.out.print("* ");
        //                 } else {
        //                     System.out.print("  ");
        //             }
        //         }System.out.println();
        //     }

        //hollow butterfly
// *                 *
// * *             * *
// *   *         *   *
// *     *     *     *
// *       * *       *
// *       * *       *
// *     *     *     *
// *   *         *   *
// * *             * *
// *                 *
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         if (j == 1 || j == i) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     for (int j = 1; j <= 2 * (n - i); j++) {
        //         System.out.print("  ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         if (j == 1 || j == i) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
        // for (int i = n; i >= 1; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         if (j == 1 || j == i) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     for (int j = 1; j <= 2 * (n - i); j++) {
        //         System.out.print("  ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         if (j == 1 || j == i) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }

        //     System.out.println();
        // }
    
    
//           *
//         * * *
//       * * * * *
//     * * * * * * *
//   * * * * * * * * *
//   * * * * * * * * *
//     * * * * * * *
//       * * * * *
//         * * *
//           *

        // for (int i =1;i<=n;i++){
        //     for (int j=1;j<=(n-i);j++){
        //         System.out.print("  ");
        //     }for (int j = i;j>=1;j--){
        //         System.out.print("* ");
        //     }for (int j= 2;j<=i;j++){
        //         System.out.print("* ");
        //     }System.out.println();
        // }
        // for (int i =n;i>=1;i--){
        //     for (int j=1;j<=(n-i);j++){
        //         System.out.print("  ");
        //     }for (int j = i;j>=1;j--){
        //         System.out.print("* ");
        //     }for (int j= 2;j<=i;j++){
        //         System.out.print("* ");
        //     }System.out.println();
        // }
    //      1
    //     212
    //    32123
    //   4321234
    //  543212345
        // for (int i =1;i<=n;i++){
        //     for (int j=1;j<=(n-i);j++){
        //         System.out.print(" ");
        //     }for (int j=i;j>=1;j--){
        //     System.out.print(j);
        //     }for (int j=2;j<=i;j++){
        //         System.out.print(j);
        //     }System.out.println();
        // }
        // *                 *
        // * *             * *
        // * * *         * * *
        // * * * *     * * * *
        // * * * * * * * * * *
        // * * * * * * * * * *
        // * * * *     * * * *
        // * * *         * * *
        // * *             * *
        // *                 *
        
        // for (int i=1;i<=n;i++){
        //     for (int j = 1;j<=i;j++){
        //         System.out.print("* ");
        //     }for (int k =1;k<=2*(n-i);k++){
        //         System.out.print("  ");
        //     }for (int j= 1;j<=i;j++){
        //         System.out.print("* ");
        //     }System.out.println();
        // }
        // for (int i=n;i>=1;i--){
        //     for (int j = 1;j<=i;j++){
        //         System.out.print("* ");
        //     }for (int k =1;k<=2*(n-i);k++){
        //         System.out.print("  ");
        //     }for (int j= 1;j<=i;j++){
        //         System.out.print("* ");
        //     }System.out.println();
        // }
//         * * * * *
//        * * * * *
//       * * * * *
//     * * * * *
//   * * * * *
    //     for (int i =1;i<=n;i++){
    //         for (int j=1;j<=n-i;j++){
    //             System.out.print("  ");
    //         }for (int j= 1;j<=5;j++){
    //             System.out.print("* ");
    //     }System.out.println();
    // }
//      1
//     2  2
//   3  3  3
// 4  4  4  4
// 5  5  5  5  5
    // for (int i=1;i<=n;i++){
    //     for (int j = 1;j<=(n-i);j++){
    //         System.out.print("  ");
    //     }for (int j = 1;j<=i;j++){
    //         System.out.print(i+"  ");
    //     }System.out.println();
    // }
}
}

