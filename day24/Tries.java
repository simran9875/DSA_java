package day24;
import java.util.HashMap;
public class Tries {
	public class node{// using HashMap
		char val;
		boolean isTerminal;
		HashMap<Character,node> child = new HashMap<>();
	}
	private node root;
	public Tries() {
		node nn = new node();
		nn.val='*';
		root = nn;
	}
	public void add(String word) {
		node temp = root;
		for(int i=0;i<word.length();i++) {
			char ch = word.charAt(i);
			if(temp.child.containsKey(ch)) {
				temp=temp.child.get(ch);
			}else {
				node nn = new node();
				nn.val = ch;
				temp.child.put(ch, nn);
				temp=nn;
			}
		}temp.isTerminal = true;
	}
	public boolean search(String word) {
		node curr = root;
		for(int i=0;i<word.length();i++) {
			char ch = word.charAt(i);
			if(curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
			}else {
				return false;
			}
		}return curr.isTerminal;
	}
	

}
