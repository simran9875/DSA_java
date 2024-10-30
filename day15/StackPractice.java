package day15;
import java.util.*;
public class StackPractice {
	static void insertAtFirst(Stack<Integer> stk , int item) {
		if (stk.empty()) {
			stk.push(item);
			return ;
		}int x = stk.pop();
		insertAtFirst(stk,x);
		stk.add(x);
	}
	static void reverse(Stack<Integer> stk) {
		if (stk.empty()) {
			return;
		}int x = stk.pop();
		reverse(stk);
		insertAtFirst(stk,x);
	}
	public static void main(String[]args) {
		Stack<Integer> stk = new Stack<Integer>();
		stk.add(10);
		stk.add(20);
		stk.add(30);
		stk.add(40);
		insertAtFirst(stk,50);
		reverse(stk);
	}
}
