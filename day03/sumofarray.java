package day03;

public class sumofarray{
static int addition(int[] arr, int a,int b){
    if(a>b || b<0||a<0||b>=arr.length)
    return 0;
    int sum=0;
for (int i=a;i<=b;i++){
        sum=arr[i]+sum;
    }
    return sum;
    }
    public static void main(String[] args) {
        int[] nums= {1,2,3,4,5,6};
        System.out.print((addition(nums, 2, 4)));
    }

}

