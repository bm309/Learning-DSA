package DSA.BinarySearch;

public class OrderAgnosticBS {
	/* If we don't know the given target element wes present in Asce or Desc part of array, then
	use Order Agnostics binary search approach */
	public static void main(String[] args) {
				  //   0,1,2,3, 4, 5, 6
		//int[] arr = {1,4,7,9,10,15,20};

				//   0, 1, 2, 3, 4,5,6,7,8.9
		int[] arr = {20,14,12,11,8,7,5,4,2,1};
		int target=4;
		int ans = binarySearch(arr,target);
		System.out.println(ans);

	}
	static int binarySearch (int[] arr, int target) {


		int start =0;
		int end =arr.length-1;
		boolean isAsc = arr[start]<arr[end];
		while(start<=end)
		{
			int mid = start+(end-start)/2;
			if(target==arr[mid]) {
				return mid;
			}
			if(isAsc) {
				if(target<arr[mid]) {
					end=mid-1;

				}
				else if(target>arr[mid]) {
					start=mid+1;
				}
			}
			else {
				if(target>arr[mid]) {
					end=mid-1;

				}
				else if(target<arr[mid]) {
					start=mid+1;
				}

			}
		}
		return -1;

	}

}
