package day07;
public class searchspace {
    static boolean check(int speed,int distance,int time){
        int dist=speed*time;
        return (dist>=distance);
    }
    static int sc_searchSpace(int distance,int time){
    int low =0;
    int high = 200;
    int ans= -1;
    while (low <= high ){
        int mid = high-(high-low)/2;
        if (check(mid,distance,time)){
        ans = mid;
        high =mid-1;
        }else {
            low = mid+1;
        }
    }return ans;
    }
    public static void main(String[] args) {
        int distance = 50;
        int time =2;
        System.out.println(sc_searchSpace(distance, time));
    }
}
