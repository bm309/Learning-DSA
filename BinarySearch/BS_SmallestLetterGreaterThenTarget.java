package DSA.BinarySearch;

public class BS_SmallestLetterGreaterThenTarget {

	public static void main(String[] args) {

		//   0,1,2,3, 4, 5, 6
int[] arr = {3,4,7,9,10,15,20};
int target=21;
int ans = nextGreatestLetter(arr, target);
System.out.println(ans);
}
static int nextGreatestLetter(int[] letter, int target) {
// return the smallest letter greater then  the target letter
int start =0;
int end=letter.length-1;

while(start<=end) 
{
int mid = start+(end-start)/2;
if(target<letter[mid]) 
{
end=mid-1;
}
else if(target>letter[mid])
{
start=mid+1;
}
else {
return mid;
}

}
//Wrap Around eg: if target=='z' and letters == ['c','h'] then the ans is 'c' i.e., return 0th index.
return letter[start%letter.length]; // this will return the indexed position of the char itself not the index number.
	}

}
