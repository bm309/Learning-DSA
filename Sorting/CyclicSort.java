package Sorting;

import java.util.Arrays;

public class CyclicSort {

	public static void main(String[] args) {
 int[] arr2 = {2,3,5,4,1};
 cycleSortLogic(arr2);
 System.out.println(Arrays.toString(arr2));
	}
	
	public static void cycleSortLogic(int[] arr) {
		int i =0;
		while(i < arr.length) 
		{
			int correctPositionIndex = arr[i] - 1;
		if(arr[i] !=arr[correctPositionIndex])
		{
			swap(arr, i, correctPositionIndex);
		}
		else
		{
			i++;
		}
		}
	}
	
	public static void swap(int[] arr1, int a, int b) {
		int temp = arr1[a];
		arr1[a] = arr1[b];
		arr1[b] = temp;
	}

}
