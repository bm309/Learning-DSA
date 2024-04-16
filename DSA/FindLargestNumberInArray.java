package DSA;

public class FindLargestNumberInArray {

	public static void main(String[] args) {
int[] arr = {1,40,30};

//Finding the largest number in the given unsorted Array.

int largest = arr[0];
for(int i=1;i<=arr.length-1;i++) 
	{
	if (arr[i]>largest) 
		largest = arr[i];
	}
System.out.println(largest);
	}

}
