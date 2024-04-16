package Sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {2,1,3,0};
		bubble(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void bubble(int[] arr) 
	{
		boolean flag = false;
		for(int i=0; i<arr.length;i++) 
		{
			flag = false;
			for(int j=0; j<arr.length-i-1; j++) 
			{
				if(arr[j]>arr[j+1]) 
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag = true;
				}
			}
			if(flag==false) 
			{
				break;
			}
		}
	}
}
