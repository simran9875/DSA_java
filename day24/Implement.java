package day24;

public class Implement {

	public static void main(String[] args) {
		Tries t = new Tries();
		t.add("Cat");
		t.add("Knight");
		t.add("Night");
		t.add("Nick");
		System.out.println(t.search("Cat"));
		System.out.println(t.search("Cats"));
		System.out.println(t.search("Knife"));
		
	}

}
