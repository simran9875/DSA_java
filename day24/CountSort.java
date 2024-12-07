package day24;

import java.util.Arrays;

public class CountSort {
	public static int[] sort (int[] arr) {
		int max=Arrays.stream(arr).max().getAsInt();
		int[] freq = new int[max+1];
		for(int i=0;i<arr.length;i++) {
			freq[arr[i]]++;
		}for(int i=1;i<freq.length;i++) {
			freq[i]=freq[i-1]+freq[i];
		}int [] ans = new int[arr.length];
		for(int i=arr.length-1;i>=0;i--) {
			int index = arr[i];
			int val =freq[index];
			ans[val-1]=index;
			freq[index]--;
		}return ans;
	}
	public static void main(String[] args) {
		int[] arr = {1,3,5,4,2,2,5,7,0,2,4,5};
		System.out.println(Arrays.toString(sort(arr)));
	}

}
