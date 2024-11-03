package day18;

public class BinarySearchTree {
	class node {
		int val;
		node left;
		node right;
	}
	private node root;
	public BinarySearchTree(int[] arr) {
		root = createTree(arr,0,arr.length-1);
	}
	public node createTree(int[] arr, int low , int high) {
		if(low>high) return null;
		int mid = (low+high)/2;
		node nn = new node();
		nn.val=arr[mid];
		nn.left = createTree(arr,low, mid-1);
		nn.right = createTree(arr , mid+1,high);
		return nn;
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
	public static void main(String[]args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		BinarySearchTree bst = new BinarySearchTree(arr);
		bst.display(bst.root);
		
	}
}
