package day16;

public class Implement {

	public static void main(String[] args) {
		Queue q = new Queue();
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(4);
		while (!q.isEmpty()) {
			System.out.print(q.deQueue()+"  ");
		}

	}

}
