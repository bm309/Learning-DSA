package Sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {3,4,5,2,1};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void sort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int endIndex = arr.length-i-1;
			int maxIndex = getMaxIndex(arr, 0, endIndex);
			swap(arr,maxIndex,endIndex);
		}
	}
	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a]=arr[b];
		arr[b]= temp;
	}
	public static int getMaxIndex(int[] arr, int startIndex, int endIndex) {
		int maxIndex = startIndex;   // {3,4,5,2,1}; 3 4 1  2 5; 3 2 1 4 5
								//  0,1,2,3,4
		for(int i=0; i<=endIndex;i++) 
		{
			if(arr[maxIndex]<arr[i]) 
			{
				maxIndex = i;
			}
		}
		return maxIndex;

	}

}
