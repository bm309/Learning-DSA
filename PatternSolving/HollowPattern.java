package PatternSolving;

public class HollowPattern {

	public static void main(String[] args) {
pattern5(5);
	}
	//IMPORTANT NOTE: SQUARE Pattern
	//i==1||i==n -It will print only the first and last row 
	//j==1||j==n -It will print only the first and last column
	//i==j - which means index value of i and j are equal so it will print the right major diagonal
	//i+j == n+1 -It will print the left side diagonal //j == n so the diagonal will be the ending column index of every row 
	//i == n/2+1 || j == n/2+1 - It gives you middle row or middle column.
	
	//pattern1 - parallel square bar
	public static void pattern1(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1 || j == n)
				{
				System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	// patetern2 - hallow square
	public static void pattern2(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||j==1||i==n||j==n)
				{
				System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	// patetern3 - hallow incrementing right side triangle
		public static void pattern3(int n)
		{
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=n;j++)
				{
					if(j==1||i==n||i==j)
					{
					System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		}
		// patetern4 - hallow decrementing left side triangle
				public static void pattern4(int n)
				{
					for(int i=1;i<=n;i++)
					{
						for(int j=1;j<=n;j++)
						{
							if(i==1||j==i||j==n)
							{
							System.out.print("* ");
							}
							else
							{
								System.out.print("  ");
							}
						}
						System.out.println();
					}
				}
				// patetern5 - hallow Hill pattern
				public static void pattern5(int n)
				{
					for(int i=0;i<=n;i++)
					{ for(int s=i;s<=n;s++)
					{
						System.out.print("  ");
					}
						for(int j=0;j<=i;j++)
						{
							if(i==n||j==0)
							{
							System.out.print("* ");
							}
							else
							{
								System.out.print("  ");
							}
						}
						for(int j=1;j<=i;j++)
						{
							if(i==n||i==j)
							{
							System.out.print("* ");
							}
							else
							{
								System.out.print("  ");
							}
						}
						System.out.println();
					}
				}
				// patetern6 - hallow decreasing triangle pattern
				public static void pattern6(int n)
				{
					for(int i=1;i<=n;i++)
					{
					 for(int j=i;j<=n;j++)
						{
							if(i==1||j==i||j==n)
							{
							System.out.print("* ");
							}
							else {
								System.out.print("  ");
							}
						}
					 System.out.println();
					 }
					}

}
