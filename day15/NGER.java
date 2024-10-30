package day15;
import java.util.Stack;
public class NGER {
	static void display(int [] arr) {
		for (int i:arr) {
			System.out.print(i+" ");
		}System.out.println();
	}
	
	public static void main(String[] args) {
//		Stack<Integer> stk = new Stack<>();
		int [] arr = {2,3,1,2,4,2,5};
		nge(arr);
		
		}
	public static void nge(int []arr) {
		Stack<Integer> stk = new Stack<>();
		int [] ans = new int[arr.length];
		for (int i =0;i<arr.length;i++) {
			while(!stk.empty() && arr[i] > arr[stk.peek()])
				ans[stk.pop()] = arr[i];
			stk.push(i);
			}
		while(!stk.empty())
			ans[stk.pop()] = -1;
		
		display(ans);

	}

}
