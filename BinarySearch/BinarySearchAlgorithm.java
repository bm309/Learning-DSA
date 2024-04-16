package DSA.BinarySearch;

public class BinarySearchAlgorithm {

	public static void main(String[] args) {
					//   0,1,2,3, 4, 5, 6
			int[] arr = {1,4,7,9,10,15,20};
			//int target=7;
			//int ans = binarySearch(arr,target);
			int ans = binarySearch(arr,7);// instead the above two line we can also pass the input parameter inside method.
			System.out.println(ans);
			
	}
		static int binarySearch (int[] arr, int target) {
			
			
		int start =0;
		int end =arr.length-1;
		while(start<=end)
		{
			int mid = start+(end-start)/2;
								//   0,1,2,3, 4,  5, 6
			if(target<arr[mid]) { // 1,4,7,9, 10, 15,20
				end=mid-1;
				
			}
			else if(target>arr[mid]) {
				start=mid+1;
			}
			else {
				return mid;
			}
		}
		return -1;

}
}
