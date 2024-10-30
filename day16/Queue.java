package day16;

public class Queue {
	private int[] arr;
	private int front =0;
	private int size =0;
	
	public Queue() {
		size = 5;
	}
	public Queue(int n) {
		arr= new int[n];
	}
	public boolean isEmpty() {
		return (size==0);
	}
	public void enQueue(int item) {
		int ptr = front+size;
		arr[ptr]= item;
		size++;
	}
	public int deQueue() {
		int rv = arr[front];
		front++;
		size--;
		return rv;
	}
	public int get() {
		return arr[front];
	}

}
