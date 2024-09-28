package day13;

public class Util {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(40);
        ll.addFirst(20);
        ll.addFirst(10);
        ll.display();
        ll.addLast(50);
        ll.display();
        ll.addAtIndex(30, 2);
        ll.display();
        System.out.println(ll.removeIndex(1));
        ll.display();
        // System.out.println(ll.getFirst()+" "+ll.getLast()+" "+ll.getIndex(2));
    }
}
