package programs;

import java.util.Arrays;

public class SortInDescending {
	public static void main(String[] args) {
		int a[]= {5,6,3,65,67,34,9};
		Arrays.sort(a);
		
		System.out.print("Sorted Array in descending order : ");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
	}

}
