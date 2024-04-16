package DSA.BinarySearch;

public class BSFindFirstLastIndex {

	public static void main(String[] args) {
		int result[] = new int[2];
		int[] nums = {1,2,3,3,3,3,3,4,5,6};
		int target = 3;
		result[0] = SearchStartIndex(nums,target);
		result[1] = SearchEndIndex(nums,target);
		System.out.println(result[0]+","+result[1]);
		//return result;
	}
		public static int SearchStartIndex (int[] nums, int target) {
			
			int start =0;
			int end =nums.length-1;
			int res = -1;
			
			while(start<=end)
			{
				int mid = start+(end-start)/2;
				
				if(target == nums[mid]) {
							   //0,1,2,3,4,5,6,7,8
					res = mid; //1,2,3,3,3,3,4,5,6
					end=mid-1;
					
				}
 				else if(target>nums[mid]) {
					start=mid+1;
				}
				else {
					 end=mid-1;;
				}
			}
			return res;
		}
			public static int SearchEndIndex (int[] nums, int target) {
			int start =0;
			int end =nums.length-1;
			int res = -1;
			
			while(start<=end)
			{
				 int mid = start+(end-start)/2;
				
				if(target == nums[mid]) {
					res=mid;
					start=mid+1;
					
				}
				else if(target>nums[mid]) {
					start=mid+1;
				}
				else {
					 end=mid-1;;
				}
			}
			return res;
		}
			
	
}

