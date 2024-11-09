package day19;

public class Implement {

	public static void main(String[] args) {
		int[] arr= {10,20,30,1,5,7,3,2};
		Heap h = new Heap(arr);
		h.display();
		h.Add(-1);
		h.display();
		h.remove();
		h.display();

	}

}
