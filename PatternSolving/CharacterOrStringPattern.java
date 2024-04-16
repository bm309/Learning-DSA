package PatternSolving;

public class CharacterOrStringPattern {

	public static void main(String[] args) {
		pattern15(5);
	}
	//Pattern1 - Right Triangle
	public static void pattern1(int n)
	{
		for(int i=0,p='A';i<n;i++,p++) //Note: int p holds the Ascii value not char so we need to type cast while printing it.
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)p+" ");
			}
			System.out.println();
		}
	}
	//Pattern2 - Left Triangle
	public static void pattern2(int n)
	{
		for(int i=0,p='A';i<n;i++,p++)
		{
			for(int s=1;s<=i;s++) {
				System.out.print("  ");
			}
			for(int j=i;j<n;j++)
			{
				System.out.print((char)p+" ");
			}
			System.out.println();
		}
	}
	//Pattern3 - Hill Pattern
	public static void pattern3(int n)
	{
		for(int i=0,p='A';i<n;i++,p++)
		{
			for(int s=i;s<=n;s++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)p+" ");
			}
			System.out.println();
		}
	}
	//Pattern4 - Reverse Hill Pattern
	public static void pattern4(int n)
	{
		for(int i=0,p='A';i<n;i++,p++)
		{
			for(int s=1;s<=i;s++) {
				System.out.print(" ");
			}
			for(int j=i;j<n;j++)
			{
				System.out.print((char)p+" ");
			}
			System.out.println();
		}
	}
	//Pattern5 - Decrement character Pattern
	public static void pattern5(int n)
	{
		for(int i=1,p='e';i<=n;i++,p--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)p+" ");
			}
			System.out.println();
		}
	}
	//Pattern6 - Increment by 2 character Pattern
	public static void pattern6(int n)
	{
		for(int i=1,p='A';i<=n;i++,p+=2)//Hint: If we want to print the row then we have to initialize p in row level.
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)p+" ");
			}
			System.out.println();
		}
	}
	//Pattern7 - Even and Odd row concept in Alternative character printing column pattern
	public static void pattern7(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j%2!=0)
				{
					System.out.print("A");
				}else {
					System.out.print("#");
				}
			}
			System.out.println();
		}
	}
	//Pattern8 - Even and Odd row concept in Alternative character printing row pattern
	public static void pattern8(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2!=0)
				{
					System.out.print("A");
				}else {
					System.out.print("#");
				}
			}
			System.out.println();
		}
	}
	//Pattern9 - Diamond pattern Incrementing rows
	public static void pattern9(int n)
	{
		int p = 'A';// If we want to print the incrementing character then declare it globaly 
		for(int i=1;i<n;i++,p++)
		{
			for(int s=i;s<=n;s++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<i;j++)
			{
				System.out.print((char)p+ " ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)p+" ");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++,p++)
		{
			for(int s=1;s<=i;s++)
			{
				System.out.print("  ");
			}
			for(int j=i;j<n;j++)
			{
				System.out.print((char)p+ " ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print((char)p+" ");
			}
			System.out.println();
		}
	}
	//Pattern10 - Diamond pattern Incrementing rows and Decrementing rows
	public static void pattern10(int n)
	{
		for(int i=1,p='A';i<n;i++,p++)
		{
			for(int s=i;s<=n;s++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<i;j++)
			{
				System.out.print((char)p+ " ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)p+" ");
			}
			System.out.println();
		}
		for(int i=1,p='E';i<=n;i++,p--)
		{
			for(int s=1;s<=i;s++)
			{
				System.out.print("  ");
			}
			for(int j=i;j<n;j++)
			{
				System.out.print((char)p+ " ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print((char)p+" ");
			}
			System.out.println();
		}
	}

	//Pattern11 - Right Triangle to print Incrementing columns
	public static void pattern11(int n)
	{
		for(int i=0;i<n;i++) //Note: int p holds the Ascii value not char so we need to type cast while printing it.
		{ int p='A';
		for(int j=0;j<=i;j++)
		{
			System.out.print((char)p++ +" ");
		}
		System.out.println();
		}
	}
	//Pattern12 - Increasing triangle- given input word pattern.
	public static void pattern12(int n)
	{
		String x="bhavani";
		int k = x.length();
		for(int i=0;i<k;i++) 
		{ 
			for(int j=0;j<=i;j++)
			{
				System.out.print(x.charAt(i) +" ");
			}
			System.out.println();
		}
	}
	//Pattern13 - Increasing triangle- using given input word to print it in a reverse order pattern.
	public static void pattern13(int n)
	{
		String x="bhavani";
		int k = x.length();
		for(int i=0,p=k-1;i<k;i++,p--) 
		{ 
			for(int j=0;j<=i;j++)
			{
				System.out.print(x.charAt(p) +" ");
			}
			System.out.println();
		}
	}
	//Pattern14 - Incrementing character in column Pattern
	public static void pattern14(int n)
	{
		for(int i=1;i<=n;i++)//Hint: If we want to print the row then we have to initialize p in row level.
		{  int p='A';
		for(int j=1;j<=i;j++)
		{
			System.out.print((char)p++ +" ");
		}
		System.out.println();
		}
	}
	//Pattern15 - Incrementing character in column Pattern
	public static void pattern15(int n)
	{	String x="bhavani";
	int k = x.length();
	for(int i=1;i<=k;i++)//Hint: If we want to print the row then we have to initialize p in row level.
	{  int p=k-1;
	for(int j=1;j<=i;j++,p--)
	{
		System.out.print(x.charAt(p)+" ");
	}
	System.out.println();
	}
	}
}
