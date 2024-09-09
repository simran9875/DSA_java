package day06;

public class TC {
    public static void main(String[] args) {
        int n= 10;
        // for (int i=1;i<=n;i++){
        //     for (int j=1;j<=n;j+=i)
        //     System.out.println("hi");
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                for (int k=1;k<=n/2;k++){
                    System.out.print("hi"+"  ");
                }
            }
        }
        }
    }

