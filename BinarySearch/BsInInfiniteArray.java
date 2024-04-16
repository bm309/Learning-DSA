package DSA.BinarySearch;

public class BsInInfiniteArray {

	public static void main(String[] args) {
				   //0,1,2,3,4,5, 6,7, 8, 9 ,10,11,12,13,14,15,16,17,18,19
		int[] arr = {1,2,3,5,7,8,10,15,17,20,21,22,23,24,25,26,27,28,29,30};
		int target = 17;
		int result = logicToFind(arr,target);
		System.out.println(result);
	}
static int logicToFind(int[] arr, int target) {
	int start = 0;
	int end = 1; // here we are not take the end as length of the array so, initially-
					// -the end will be 1 and it keeps doubling the size of the array
	while(target> arr[end]) {
	int newStart = end+1;
        end = end + (end-start+1)*2;
        start = newStart;
		}
	return binarySearch(arr,target,start,end);
}

static int binarySearch (int[] arr, int target, int start, int end) {
	
	while(start<=end)
	{
		int mid = start+(end-start)/2;
							  //0,1,2,3,4,5, 6,7, 8, 9
		if(target<arr[mid]) { //1,2,3,5,7,8,10,15,17,20
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
