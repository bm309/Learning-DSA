package JavaBasicPrograms;

import java.util.Arrays;

public class BubbleSortInArray {

	public static void main(String[] args) {
		int[] a = {8,4,6,8,20,90,75,35};
		int n = a.length;
		System.out.println("Before sorting using Bubble sort method: "+Arrays.toString(a));
		for(int i=0;i<n-1;i++) {
			for(int k=0;k<n-1;k++) {
				if(a[k]>a[k+1]) {
					int temp = a[k];
					a[k]=a[k+1];
					a[k+1]=temp;
				}
			}
		}
		System.out.println("After sorting using Bubble sort method: "+Arrays.toString(a));
	}

}
