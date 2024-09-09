package day06;

public class NGE {
    static int[] nser(int[] arr){
        int[] NSER= new int[arr.length];
        int minEle= Integer.MAX_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(minEle==Integer.MAX_VALUE)
                NSER[i]=0;
            else
            NSER[i]= minEle;
            minEle= Math.min(minEle, arr[i]);
        }
        return NSER;
    }
    static int[] nsel(int[] arr){
        int[] NSER= new int[arr.length];
        int minEle= Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(minEle==Integer.MAX_VALUE)
                NSER[i]=0;
            else
            NSER[i]= minEle;
            minEle= Math.min(minEle, arr[i]);
        }
        return NSER;
    }
    public static void main(String[] args) {
        int[] arr={9,6,4,1,7,3,5,2,8};
        int[] NSER= nser(arr);
        for(int i:NSER)
            System.out.print(i+" ");
    }
}
    // static int[] nsel (int[] arr){
    //     int [] NSER = new int [arr.length];
    //     int minElement= Integer.MIN_VALUE;
    //     // int [] NSER = new int [arr.length];
    //     for (int i=arr.length-1;i>=0;i--){
    //         if (minElement==Integer.MIN_VALUE){
    //             NSER[i]=0;
    //         }else {
    //             NSER[i]= minElement;
    //             minElement=Math.min(minElement,arr[i]);
    //         }
    //     }
    //        return NSER;
    //     }
    //     public static void main(String[] args) {
    //         int [] arr ={9,6,4,1,3,9,1};
    //         int [] NSER = nser(arr);
    //         for (int i:NSER)
    //         System.out.print(i+ "  ");

    //     }
    // }

