package day03;

public class inversearr {
    static void inverseValue(int[] arr){
        int[] temp=new int[arr.length];
        for (int i=0;i<temp.length;i++){
            temp[i]=arr[arr.length-1 -i];
        }for (int i=0;i<temp.length;i++){
            System.out.print(temp[i]+ "  ");
        }

    }
    public static void main(String[] args) {
        int[] nums= {1,2,3,4,5,6};
        inverseValue(nums);
    }
}
