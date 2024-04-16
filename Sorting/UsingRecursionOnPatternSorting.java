package Sorting;

public class UsingRecursionOnPatternSorting {

	public static void main(String[] args) {
		//function1(4,0);
		function2(4,0);

	}
	
	public static void function1(int r, int c)
	{
		if (r==0)
			return;
		if(c<r) 
		{
		System.out.print("* ");
		function1(r,c+1);
		}
		else
		{
		System.out.println();
		function1(r-1,0);
		}
	}

	public static void function2(int r, int c)
	{
		if (r==0)
			return;
		if(c<r) 
		{
		function2(r,c+1);
		System.out.print("* ");
		}
		else
		{
		function2(r-1,0);
		System.out.println();
		}
	}

}
