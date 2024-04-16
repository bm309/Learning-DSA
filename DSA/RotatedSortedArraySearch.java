package DSA;

public class RotatedSortedArraySearch {

	public static void main(String[] args) 
	{          //    0,1,2,3,4,5,6,7,8,9
		int[] arr = {6,7,8,9,2,2,2,2,4,5};
		int ans = RotatedIndexSearch(arr,4);
		System.out.println(ans);
	}

	// 1,4,8,13,17,19
	public static int RotatedIndexSearch (int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		while(start<=end) {
			int mid = start+(end-start)/2;

			if(target==arr[mid])
			{
				return mid;
			}
			else if(start<=arr[mid]) 
			{
				if(target>=arr[start] && target<arr[mid])
				{
					end = mid-1;
				}
				else 
				{
					start = mid+1;
				}
			}
			else 
			{
				if(target>=arr[mid] && target<arr[end])
				{
					start = mid+1;
				}
				else 
				{
					end = mid-1;
				}
			}
		}
		return -1;
	}
}