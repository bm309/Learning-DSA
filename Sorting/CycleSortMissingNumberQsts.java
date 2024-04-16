package Sorting;

import java.util.Arrays;

public class CycleSortMissingNumberQsts {

	public static void main(String[] args) {
		int[] arrs = {4,2,1,0};
		//System.out.println(cycleSortMissingLogic(arrs));
		cycleSortMissingLogic(arrs);
		System.out.println(Arrays.toString(arrs));
	}

	public static int cycleSortMissingLogic(int[] arr) {
		//Important Note: If the qst is like the given array in the range of 1 to n with the distinct value means go with cyclic sort.
		// Suppose the given array starts from 0 then the index also starts from 0
		int i = 0;

		while(arr[i]<arr.length) 
		{
			int correctIndex = arr[i];
			if(arr[i]<arr.length && arr[i] != arr[correctIndex]) 
			{
				swap(arr, i, correctIndex );
			}
			else 
			{
				i++;
			}
		}
		
		for(int k=0; k<arr.length; k++) 
		{
			if(arr[k] != k) 
			{
			return k;	
			}
		}
		return arr.length;
	}

	public static void swap(int[] arr1, int a, int b) 
	{
		int temp = arr1[a];
		arr1[a] = arr1[b];
		arr1[b] = temp;
	}
}
