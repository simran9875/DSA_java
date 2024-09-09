package practice2;

public class transpose {
    static void display(int [][]arr){
        for (int i = 0;i<arr.length;i++){
            for (int j =0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+"  ");
            }System.out.println();
        }
    }
    static void trans(int [][] arr){
        for (int i =0;i<arr.length;i++){
            for(int j=i;j<arr[0].length;j++){
                int temp = arr[i][j];
                arr[i][j]= arr[j][i];
                arr[j][i]= temp;
            }
        }
    }
    // 14 by the youtuble first sort then ans (n logn)
    String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        // Arrays.sort(strs);
        char []first = strs[0].toCharArray();
        char [] last = strs[strs.length-1].toCharArray();
        for (int i =0;i<first.length;i++){
            if (first[i]!=last[i]){
                break;
            }result.append(first[i]);
        } return result.toString();
    }
    static void completeS(int[][] arr){
        for (int i =0;i<arr.length;i++){
            for (int j =0;j<arr[0].length;j++){
                for (int k=0;k<arr.length;k++){
                    for (int l=0;l<arr[0].length;l++){
                        if (arr[i][j]<arr[k][l]){
                            int temp = arr[i][j];
                            arr[i][j] = arr[k][l];
                            arr[k][l] = temp;
                        }
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int [][] num = {{1,2,3,4},{5,6,7,8},{9,8,7,6},{5,4,3,2}};
        display(num);
        completeS(num);
        display(num);
        // display(num); it will display the original 2d array
        // trans(num);
        // display(num); it will display the change array after transpose
    }
}
