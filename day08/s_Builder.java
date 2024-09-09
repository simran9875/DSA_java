package day08;

public class s_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        // sb.append("hey");
        // sb.append("bye");
        // sb.insert(2,6.0);
        // sb.delete(2, 4);
        // sb.reverse();
        // sb.replace(2,4,"hey");
        sb.ensureCapacity(18);
        System.out.println(sb.capacity());
        // System.out.println(sb.length());
        // System.out.println(sb);
        // System.out.println(sb.substring(5));
    }
}
