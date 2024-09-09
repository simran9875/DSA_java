package practice;

public class pattern {
    public static void main(String[] args) {
        // int n =10;
//           0 
//         9 0 9 
//       8 9 0 9 8 
//     7 8 9 0 9 8 7 
//   6 7 8 9 0 9 8 7 6 
// 5 6 7 8 9 0 9 8 7 6 5 
// 4 5 6 7 8 9 0 9 8 7 6 5 4 
// 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 
// 2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2 
// 1 2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2 1 
        // for (int i =0;i<=n;i++){
        //     for (int k =1;k<(n-i+1);k++){
        // //         System.out.print("  ");
        //     }for (int j =1;j<=i;j++){
        //         if (i==j){
        //             System.out.print(0+" ");
        //         }else {
        //         System.out.print(n-i+j+" ");
        //         }
        //     }for (int j =2;j<=i;j++){
        //         System.out.print(n-j+1+" ");
        //     }System.out.println();
        // }
// 1 
// 2 * 2
// 3 * 3 * 3
// 4 * 4 * 4 * 4
// 5 * 5 * 5 * 5 * 5
// 4 * 4 * 4 * 4
// 3 * 3 * 3
// 2 * 2 
// 1
//         for (int i = 1;i<=n;i++){
//             for (int j = 1;j<=i;j++){
//                 System.out.print(i+" ");
//                 if (j<i){
//                     System.out.print("* ");
//                 }
//             }
//             System.out.println();
//         }for (int i =n-1;i>=1;i--){
//             for (int j = 1;j<=i;j++){
//                 System.out.print(i+" ");
//                 if (j<i){
//                     System.out.print("* ");
//                 }
//             }System.out.println();
//         }
//           1 
//         2 0 2
//       3 0 0 0 3 
//     4 0 0 0 0 0 4 
//   5 0 0 0 0 0 0 0 5
//         for (int i = 1;i<=n;i++){
//             for (int k = 0;k<=(n-i);k++){
//                 System.out.print("  ");
//             } for (int j = 1; j <= (2 * i - 1); j++) {
//                 if (j == 1 || j == (2 * i - 1)) {
//                     System.out.print(i + " ");
//                 } else {
//                     System.out.print("0 ");
//                 }
//             }System.out.println();
        // }
//            1  
//         2  3  2  
//      3  4  5  4  3  
//   4  5  6  7  6  5  4  
// 5  6  7  8  9  8  7  6  5
//         for (int i = 1;i<=n;i++){
//             for (int k = i;k<n;k++){
//                 System.out.print("   ");
//             }for (int j = i;j<i+i;j++){
//                 System.out.print(j+"  ");
//             }for (int j = i + i - 2; j >= i; j--){
//                 System.out.print(j+"  ");
//             }System.out.println();
//         }
//           1 
//         1 2 1
//       1 2 3 2 1
//     1 2 3 4 3 2 1
//   1 2 3 4 5 4 3 2 1
//         for (int i = 0;i<=n;i++){
//             for (int k = 0;k<=(n-i);k++){
//                 System.out.print("  ");
//             }for (int j = 1;j<=i;j++){
//                 System.out.print(j+" ");
//             }for (int j = i-1;j>=1;j--){
//                 System.out.print(j+" ");
//             }System.out.println();
//         }
//            1  
//         1  2  3
//      1  2  3  4  5
//   1  2  3  4  5  6  7
// 1  2  3  4  5  6  7  8  9
//         for (int i = 0;i<=n;i++){
//             for (int k = 0;k<=(n-i);k++){
//                 System.out.print("   ");
//             }for (int j = 1; j <= 2 * i - 1; j++) {
//                 System.out.print(j + "  ");
//             }System.out.println();
//         }
//           1  
//         2  3  4
//      5  6  7  8  9  
//   10  11  12  13  14  15  16  
// 17  18  19  20  21  22  23  24  25  
        // int num = 1;
        // for (int i = 0;i<=n;i++){
        //     for (int k = 0;k<=(n-i);k++){
        //         System.out.print("   ");
        //     }for (int j = 1;j<=i;j++){
        //         System.out.print(num+++"  ");
        //     }for (int j = 2;j<=i;j++){
        //         System.out.print(num+++"  ");
        //     }System.out.println();
        // }
//           1 
//         2 2 2
//       3 3 3 3 3 
//     4 4 4 4 4 4 4
//   5 5 5 5 5 5 5 5 5
        // for (int i = 0;i<=n;i++){
        //     for (int k = 0;k<=(n-i);k++){
        //         System.out.print("  ");
        //     }for (int j = 1;j<=i;j++){
        //         System.out.print(i+" ");
        //     }for (int j = 2;j<=i;j++){
        //         System.out.print(i+" ");
        //     }System.out.println();
        // }
        // 5 4 3 2 * 
        // 5 4 3 * 1
        // 5 4 * 2 1 
        // 5 * 3 2 1
        // * 4 3 2 1 
        // for (int i = n; i >=1; i--) {
        //     for (int j = n; j >= 1; j--) {
        //         if ((i+j)==6){
        //             System.out.print("* ");
        //         } else {
        //             System.out.print(j + " ");
        //         }
        //     }
        //     System.out.println();
        // }
// * 4 3 2 1 
// 5 * 3 2 1
// 5 4 * 2 1
// 5 4 3 * 1 
// 5 4 3 2 * 
        // for(int i=1;i<=n;i++){
        //     for (int j =n;j>=1;j--){
        //         // System.out.print(j+" ");
        //         if ((i+j)==6){
        //             System.out.print("* ");
        //         }else {
        //             System.out.print(j+" ");
        //         }
        //     }System.out.println();
        // }
// 5 4 3 2 1 
// 5 4 3 2 1
// 5 4 3 2 1 
// 5 4 3 2 1 
// 5 4 3 2 1 
//         for(int i=n;i>=1;i--){
//             for (int j =n;j>=1;j--){
//                 System.out.print(j+" ");
//             }System.out.println();
//         }
        // int n =5;
//           1
//         2 2 2
//       3 3 3 3 3
//     4 4 4 4 4 4 4
//   5 5 5 5 5 5 5 5 5

//         int n =5;
//         for (int i=1;i<=n;i++){
//             for (int k = 1;k<=(n-i);k++){
//                     System.out.print("  ");
//                 }for (int j=1;j<=i;j++){
//                     System.out.print(i+ " " );
//                 }for (int j=2;j<=i;j++){
//                     System.out.print(i+" ");
//                 }
//                     System.out.println();
//                 }
//           1
//         1 1 1
//       1 1 1 1 1
//     1 1 1 1 1 1 1
//   1 1 1 1 1 1 1 1 1
  
//         for (int i=1;i<=n;i++){
//             for (int k = 1;k<=(n-i);k++){
//                 System.out.print("  ");
//             }for (int j=1;j<=i;j++){
//                 System.out.print("1 ");
//             }for (int j=2;j<=i;j++){
//                 System.out.print("1 ");
//             }
//             System.out.println();
//         }
// * * * * * * * * * * 
// * * * *     * * * * 
// * * *         * * *
// * *             * * 
// *                 * 
//         for (int i = n;i>=1;i--){
//             for (int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }for (int k = 1;k<=2*(n-i);k++){
//                 System.out.print("  ");
//             }for (int j = i;j>=1;j--){
//                 System.out.print("* ");
//             }System.out.println();
//         }
// *                 * 
// * *             * * 
// * * *         * * * 
// * * * *     * * * * 
// * * * * * * * * * *

        // for (int i = 1;i<=n;i++){
        //     for (int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }for (int k = 1;k<=2*(n-i);k++){
        //         System.out.print("  ");
        //     }for (int j = i;j>=1;j--){
        //         System.out.print("* ");
        //     }System.out.println();
        // }
    //       * 
    //     *   * 
    //   *       * 
    // *           *
    //   *       * 
    //     *   * 
    //       *
    //     int n = 4;
    //     for (int i = 1; i <= n; i++) {
    //         for (int j = 1; j <= n - i; j++) {
    //             System.out.print("  ");
    //         }
    //         System.out.print("* ");
    //         if (i > 1) {
    //             for (int j = 1; j <= 2 * i - 3; j++) {
    //                 System.out.print("  ");
    //             }
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    //     for (int i = n - 1; i >= 1; i--) {
    //         for (int j = 1; j <= n - i; j++) {
    //             System.out.print("  ");
    //         }
    //         System.out.print("* ");
    //         if (i > 1) {
    //             for (int j = 1; j <= 2 * i - 3; j++) {
    //                 System.out.print("  ");
    //             }
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
        
    //       * 
    //     * * * 
    //   * * * * * 
    // * * * * * * *
    // * * * * * * * 
    //   * * * * * 
    //     * * * 
    //       * 
    
    //     int n =4;
    //     for (int i = 1;i<=n;i++){
    //         for (int k = 1;k<=(n-i);k++){
    //             System.out.print("  ");
    //         }for (int j = 1;j<=i;j++){
    //             System.out.print("* ");
    //         }for (int j = 2;j<=i;j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    //     for (int i = n;i>=1;i--){
    //         for (int k = 1;k<=(n-i);k++){
    //             System.out.print("  ");
    //         }for (int j = 1;j<=i;j++){
    //             System.out.print("* ");
    //         }for (int j = 2;j<=i;j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
// * * * * * * 
// * *     * * 
// *         * 
// * *     * * 
// * * * * * * 
//         int n = 3;
//         for (int i = n;i>=1;i-- ){
//             for (int j = 1;j<=i;j++){
//                 System.out.print("* ");
//             }for (int k=1;k<=(n-i)*2;k++){
//                 System.out.print("  ");
//             }for (int j = 1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         for (int i = 2;i<=n;i++ ){
//             for (int j = 1;j<=i;j++){
//                 System.out.print("* ");
//             }for (int k=1;k<=(n-i)*2;k++){
//                 System.out.print("  ");
//             }for (int j = 1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
// * * * * * * 
// * *     * *
// *         * 

// *         * 
// * *     * * 
// * * * * * * 
        // int n = 3;
        // for (int i = n;i>=1;i-- ){
        //     for (int j = 1;j<=i;j++){
        //         System.out.print("* ");
        //     }for (int k=1;k<=(n-i)*2;k++){
        //         System.out.print("  ");
        //     }for (int j = 1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // for (int i = 0;i<=n;i++ ){
        //     for (int j = 1;j<=i;j++){
        //         System.out.print("* ");
        //     }for (int k=1;k<=(n-i)*2;k++){
        //         System.out.print("  ");
        //     }for (int j = 1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
//           * * * * *
//         * * * *
//       * * *
//     * *
//   *
//     * *
//       * * *
//         * * * *
//           * * * * *

    //     for (int i = n;i>=1;i--){
    //             for (int k = i;k>=1;k--){
    //                 System.out.print("  ");
    //             }
    //         for (int j = 1;j<=i;j++){
    //             System.out.print("* ");
    //         }System.out.println();
    //     }
    //     for (int i = 2;i<=n;i++){
    //         for (int k = i;k>=1;k--){
    //             System.out.print("  ");
    //         }
    //     for (int j = 1;j<=i;j++){
    //         System.out.print("* ");
    //     }System.out.println();
    // }


// * * * * * 
//     * * * * 
//         * * * 
//             * * 
//                 * 
//             * * 
//         * * * 
//     * * * * 
// * * * * * 
        // for (int i = n; i >= 1; i--) {
        //     for (int j = 0; j < n - i; j++) {
        //         System.out.print("    ");
        //     }
        //         for (int k = 1;k<=i;k++){
        //         System.out.print("* ");
        //     }System.out.println();
        // }
        // for (int i = 2;i<=n;i++){
        //     for (int j = n-i;j>=1;j--){
        //         System.out.print("    ");
        //     }for (int k = 1;k<=i;k++){
        //         System.out.print("* ");
        //     }System.out.println();
        // }
    }
    }
