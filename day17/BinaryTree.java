package day17;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class BinaryTree {
	public class node {
		int val;
		node left ;
		node right;
	}
	node root;
	Scanner sc = new Scanner(System.in);
	public BinaryTree() {
		root = createTree();
	}
	public node createTree() {
		System.out.println("value:  ");
		int item = sc.nextInt();
		node nn = new node();
		nn.val = item;
		System.out.println("has left: ");
		boolean hasLeft = sc.nextBoolean();
		if (hasLeft) {
			nn.left = createTree();
		}
		System.out.println("has right: ");
		boolean hasRight = sc.nextBoolean();
		if (hasRight) {
			nn.right = createTree();
		}
		return nn;
	}
	public void Display() {
		display(root);
	}
	private void display(node nn) {
		if(nn == null) return;
		String output = "";
		output = "<--"+ nn.val +"-->";
		if (nn.left==null) {
			output = "null"+output;
		}else {
			output = nn.left.val+output;
		}
		if (nn.right == null) {
			output +="null"; 
		}else {
			output+=nn.right.val;
		}
		 System.out.println(output);
	        display(nn.left);
	        display(nn.right);
	}
	public int findMax(node root ) {
		if ( root== null) return -1;
		return Math.max(root.val, Math.max(findMax(root.left), findMax(root.right)));
	}
	public boolean findVal(node root, int item) {
		if(root == null)return false;
		if(root.val==item) return true;
		boolean inLeft = findVal(root.left,item);
		boolean inRight = findVal(root.right,item);
		return (inLeft || inRight);
	}
	 public int height(node root){
	        if(root==null) return 0;

	        int leftH= height(root.left);
	        int rightH= height(root.right);

	        return Math.max(leftH, rightH)+1;
	    }
	public void infix(node root) {
		if(root == null) return;
		infix(root.left);
		System.out.print(root.val+" ");
		infix(root.right);
	}
	public void prefix(node root) {
		if (root == null) return;
		System.out.print(root.val+" ");
		prefix(root.left);
		prefix(root.right);
	}
	public void post(node root) {
		if (root == null) return ;
		post(root.left);
		post(root.right);
		System.out.print(root.val+" ");
	}
	public void levelOrderTraversal() {
		Queue<node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			node rv = q.remove();
			System.out.print(rv.val+" ");
			if(rv.left!=null) {
				q.add(rv.left);
			}if(rv.right!=null) {
				q.add(rv.right);
			}
		}System.out.println();
		
	}
}
