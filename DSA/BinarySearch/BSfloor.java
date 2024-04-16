package DSA.BinarySearch;

public class BSfloor {

	public static void main(String[] args) {
						//   0,1,2,3, 4, 5, 6
				int[] arr = {1,4,7,9,10,15,20};
				int target=8;
				int ans = binarySearchFloor(arr,target);
				System.out.println(ans);
				
		}
			static int binarySearchFloor (int[] arr, int target) {
				
				
			int start =0;
			int end =arr.length-1;
			while(start<=end)
			{
				int mid = start+(end-start)/2;
				
				if(target<arr[mid]) {
					end=mid-1;
					
				}
				else if(target>arr[mid]) {
					start=mid+1;
				}
				else {
					return mid;
				}
			}
			return end;

	}

}
