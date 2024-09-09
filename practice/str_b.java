package practice;

public class str_b {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        // for checking the char stored in the index
        // System.out.println(sb.charAt(2));
        //// for set char at index (to change the char at that index)
        // sb.setCharAt(0,'M');
        // System.out.println(sb);
        // for inserting the char at any index
        // sb.insert(2, 'n');
        // System.out.println(sb);
        // sb.delete(1, 3); // till the char.length-1
        // System.out.println(sb);
        // for adding the variable to string
        sb.append(" Stark"); // in string sb +" Stark";
        System.out.println(sb);
        // System.out.println(sb.uppercase);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
    }
}
