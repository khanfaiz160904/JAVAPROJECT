package programs;

import java.util.Arrays;

public class Pr25 {
	public static void main(String[] args) {
		int a[]= {5,6,3,65,67,34,9};
		Arrays.sort(a);
		
		System.out.print("Sorted Array in ascending order : ");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
	}

}
