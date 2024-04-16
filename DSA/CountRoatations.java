package DSA;

public class CountRoatations {

	public static void main(String[] args) {

		         //  0,1,2,3,4,5,6,7,8,9
		int[] arr = {2,3,4,6,7,8,9,4,2,1};
        System.out.println(FindCount(arr));
	}

	public static int FindCount(int[] arr) {

		int ans = FindMax(arr);
		return ans+1;
	}
	public static int FindMax (int[] arr) {
		int start = 0;
		int end = arr.length-1;

		while(start<end) {
			int mid = start + (end-start)/2;
			if(arr[mid]>arr[mid+1])
			{
				/* we are in the descending part of array so include MID as END because this may be 
			  your possible answer */
				end = mid;
			} 
			else
			{
				/* If mid is less than mid+1 so we are in the ascending part of array so mid+1 will 
			  be greater so exclude mid */
				start = mid+1;
			}
		}
		/* here both start and end will be in same point so finally this will 
		be your exact maximum value in array */
		return start; 

	}
}
