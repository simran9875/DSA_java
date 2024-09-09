public class patternprinting {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if(i==1||j==n||i==n||j==1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    //     int n = 5 ;
    // for (int i=1;i<=n ; i++){
    //   int s=i;
    //   for (int k=1;k<=n-i; k++){
    //     System.out.println("\t");
    //   } 
    //   for (int j=0 ; j<=i-1 ; j++){
    //     System.out.println(j+1 + "\t");
    //   }
    //   for (int j=2 ; j<=i; j++){
    //     System.out.println(i+s-2 + "\t");
    //     s--;
    //   }
    //   System.out.println();
    // }  
    }

}
