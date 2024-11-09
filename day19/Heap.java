package day19;
import java.util.ArrayList;
public class Heap {
	private ArrayList<Integer> ll =new ArrayList<Integer>();
	public  Heap() {};
	public Heap(int[] arr) {
		for(int i:arr) {
			Add(i);
		}
	}
	public void Add(int i) {
		ll.add(i);
		upHeapify(ll.size()-1);
	}
	public void upHeapify(int ci) {
		int pi = (ci-1)/2;
		if(ll.get(pi)>ll.get(ci)) {
			swap(pi,ci);
			upHeapify(pi);
		}
	}
	private void swap(int pi ,int ci) {
		int val1 = ll.get(pi);
		int val2=ll.get(ci);
		ll.set(pi, val2);
		ll.set(ci, val1);
	}
	public void display() {
		System.out.println(ll);
	}
	public int getTop() {
		return ll.get(0);
	}
	public int size() {
		return ll.size();
	}
	public int remove() {
		swap(0,ll.size()-1);
		int rev  = ll.remove(size()-1);
		downHeapify(0);
		return rev;
	}
	public void downHeapify(int pi) {
		int LCi = 2*pi+1;
		int RCi=2*pi+2;
		
		int mini = pi;
		if(LCi <ll.size() && ll.get(LCi)<ll.get(mini)) {
			mini = LCi;
		}if(RCi <ll.size() && ll.get(RCi)<ll.get(mini)) {
			mini = RCi;
		}
		if(mini!=pi) {
		swap(mini,pi);
		downHeapify(mini);
		}
	}
	

}
