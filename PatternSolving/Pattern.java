package PatternSolving;

public class Pattern {

	public static void main(String[] args) {
		pattern31(10);
	}
	// Pattern 1 -SQUARE pattern
	public static void pattern1(int n) {  

		for(int i = 0; i<n; i++)
		{
			for(int j=0; j<n;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	// Pattern 2 INCREASING triangle
	public static void pattern2(int n) {  

		for(int i = 1; i<=n; i++)
		{
			for(int j=1; j<=i;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	// Pattern 3 DECREASING triangle
	public static void pattern3(int n) {  

		for(int i = 0; i<n; i++)
		{
			for(int j=i; j<n;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	// Pattern 4 Increasing triangle but, printing columns using numbers
	public static void pattern4(int n) {  

		for(int i = 1; i<=n; i++)
		{
			for(int j=1; j<=i;j++) 
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	// Pattern 5 both Increasing and Decreasing triangle using 2*n times
	public static void pattern5(int n) {  

		for(int i = 1; i<=2*n; i++)
		{
			int k = i>n?2*n-i:i;	//Important condition to print * of 2*n times.
			for(int j=1; j<=k;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	// Pattern 6 Left Increasing triangle
	public static void pattern6(int n) {  

		for(int i = 1; i<=n; i++)
		{
			for(int s=i; s<=n;s++) {
				System.out.print("  ");//for loop to print spaces first 
			}
			for(int j=1; j<i;j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	// Pattern 7 Left Decreasing triangle
	public static void pattern7(int n) {  

		for(int i = 0; i<n; i++)
		{
			for(int s=0; s<i;s++) {
				System.out.print(" ");//for loop to print spaces first 
			}
			for(int j=i; j<n;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	// Pattern 8 Hill Pattern
	public static void pattern8(int n) {  

		for(int i = 0; i<n; i++)
		{
			for(int s=i; s<n-1;s++) // <- Important note when we give n-1 only we can get the hill pattern at the corner
			{ //Note: If we are giving spaces while printing * then here also we need to add 1 extra space
				System.out.print("  "); 
			}
			for(int j=0; j<=i;j++) 
			{
				System.out.print("* ");
			}
			for(int j=1; j<=i;j++) 
			{
				System.out.print("* ");
			}

			System.out.println();
		}
	}
	// Pattern 9 Reverse Hill pattern
	public static void pattern9(int n) {  

		for(int i = 0; i<=n; i++)
		{
			for(int s=1; s<=i;s++) 
			{ //Note: If we are giving spaces while printing * then here also we need to add 1 extra space
				System.out.print("  "); 
			}
			for(int j=i; j<n;j++) 
			{
				System.out.print("* ");
			}
			for(int j=i; j<=n;j++) 
			{
				System.out.print("* ");
			}

			System.out.println();
		}
	}
	// Pattern 10 Pyramide pattern
	public static void pattern10(int n) {  

		for(int i = 0; i<n; i++)
		{
			for(int s=i; s<n-1;s++) 
			{ //Note: If we are giving spaces while printing * then here also we need to add 1 extra space
				System.out.print(" "); 
			}
			for(int j=0; j<=i;j++) 
			{
				System.out.print(" *");
			}
			
			System.out.println();
		}
	}
	// Pattern 11 Reverse Pyramid pattern
		public static void pattern11(int n) {  

			for(int i = 1; i<=n; i++)
			{
				for(int s=1; s<=i;s++) 
				{ //Note: If we are giving spaces while printing * then here also we need to add 1 extra space
					System.out.print(" "); 
				}
				for(int j=i; j<=n;j++) 
				{
					System.out.print(" *");
				}
				
				System.out.println();
			}
		}
		// Pattern 12 SAND GLASS pattern
				public static void pattern12(int n) {  

					for(int i = 0; i<=2*n; i++)
					{
						int k = i>n?2*n-i:i;
						for(int s=1; s<=k;s++) 
						{ //Note: If we are giving spaces while printing * then here also we need to add 1 extra space
							System.out.print(" "); 
						}
						for(int j=k; j<=n;j++) 
						{
							System.out.print("* ");
						}
						
						System.out.println();
					}
				}
				// Pattern 13 Hollow Pyramide pattern
				public static void pattern13(int n) {  

					for(int i = 0; i<=n; i++)
					{
						for(int s=i; s<n;s++) 
						{ //Note: If we are giving spaces while printing * then here also we need to add 1 extra space
							System.out.print(" "); 
						}
						for(int j=0; j<=i;j++) 
						{
							if(i==n||j==0||j==i)
							{
							System.out.print(" *");
							}
							else 
							{
								System.out.print("  ");
							}
						}
						
						System.out.println();
					}
				}
				// Pattern 14 Hollow reverse Pyramide pattern
				public static void pattern14(int n) {  

					for(int i = 0; i<=n; i++)
					{
						for(int s=1; s<=i;s++) 
						{ //Note: If we are giving spaces while printing * then here also we need to add 1 extra space
							System.out.print(" "); 
						}
						for(int j=i; j<=n;j++) 
						{
							if(i==0||j==i||j==n)
							{
							System.out.print(" *");
							}
							else 
							{
								System.out.print("  ");
							}
						}
						
						System.out.println();
					}
				}
				// Pattern 15 Hollow Diamond pattern
				public static void pattern15(int n) {  

					for(int i = 1; i<=2*n; i++)
					{
						int k= i>n ? 2*n-i : i;
						for(int s=k; s<=n;s++) 
						{ //Note: If we are giving spaces while printing * then here also we need to add 1 extra space
							System.out.print(" "); 
						}
						for(int j=1; j<=k;j++) 
						{
							if(j==1||j==k) 
							{
							System.out.print(" *");
							}
							else
							{
								System.out.print("  ");
							}
						}
						System.out.println();
					
				}
			}
				// Pattern 17 i to 1 and 2 to i concept in a Diamond pattern and printing j
				public static void pattern17(int n) {  

					for(int i = 1; i<=2*n; i++)
					{
						int k = i>n ? 2*n-i : i;
						for(int s=1; s<=n-k;s++)
						{
							System.out.print(" ");
						}
						for(int j=k;j>=1; j--)
						{
							System.out.print(j);
						}
						for(int j=2;j<=k; j++)
						{
							System.out.print(j);
						}  
						System.out.println();
					}
					}
				//pattern18
				public static void pattern18(int n) {  

					for(int i = 0; i<=2*n+1; i++)
					{
						int x=i>n ? 2*n-i+1 : i;
						for(int j=x;j<=n;j++) {
							System.out.print("*");
						}
						for(int k=1;k<=x;k++) {
							System.out.print("  ");
						}
						for(int m=x;m<=n;m++) {
							System.out.print("*");
						}System.out.println();
					}
					}
				// Pattern 19
				public static void pattern19(int n) {  

					for(int i = 1; i<=2*n; i++)
					{
						int k = i>n ? 2*n-i : i;
						for(int j=1; j<=k;j++)
						{
							System.out.print("*");
						}
						for(int x=k;x<n;x++) { 
							System.out.print("  ");
						}
						for(int j=1; j<=k;j++)
						{
							System.out.print("*");
						}
						System.out.println();
						
					}
				}
				// Pattern 20
				public static void pattern20(int n) {  

					for(int i=1; i<=n; i++)
					{
						for(int j=1;j<=n;j++) {
							if(j==1||j==n||i==1||i==n)
							{
							System.out.print("*");
							}
							else 
							{
								System.out.print(" ");
							}
						}
						System.out.println();
					}
					}
				// Pattern 21
				public static void pattern21(int n) {  
					int p=1;
					for(int i=1; i<=n; i++)
					{
						for(int j=1;j<=i;j++) {
							if(p<=9)
							{
							System.out.print(p++ +"  ");
							}
							else {
								System.out.print(p++ +" ");
							}
						}
						System.out.println();
						
					}
				}
				//pattern 22
				public static void pattern22(int n) {  
					int p=1;
					for(int i=1; i<=n; i++)
					{
						for(int j=1;j<=i;j++) 
						{
							if(p%2==0)
							{
							System.out.print("0"+"  ");
							}
							else 
							{
								System.out.print("1"+" ");
							}
						}
						System.out.println();
						
					}
				}
				//pattern 23 Hollow M pattern
				public static void pattern23(int n) 
				{ 
					for(int i=0;i<=n;i++)
					{
						for(int s=i;s<n;s++) 
						{
							System.out.print(" ");
						}
						for( int j=0;j<=i;j++) 
						{
							if(j==0||j==i)
							{
							System.out.print("* ");
						}else {
							System.out.print("  ");
						}
						}
						for(int s1=i;s1<n;s1++) {
							System.out.print("  ");
						}
						for( int j1=0;j1<=i;j1++) 
						{ if(j1==0||j1==i)
						{
							System.out.print("* ");
						}else {
							System.out.print("  ");
						}
						}
						System.out.println();
					}
				}
				// Pattern 24
				public static void pattern24(int n) {  

					for(int i=1; i<=2*n; i++)
					{
						int k = i>n ? 2*n-i+1 : i;
						for(int j=1; j<=k;j++)
						{
							if(j==1||j==k) {
							System.out.print("*");
							}else {
								System.out.print(" ");
							}
						}
						for(int x=k;x<n;x++) { 
							System.out.print("  ");
						}
						for(int j=1; j<=k;j++)
						{
							if(j==k||j==1) {
							System.out.print("*");
							}
							else {
								System.out.print(" ");
							}
						}
						System.out.println();
						
					}
				}
				
				// Pattern 25 Hollow side rectangle pattern
				public static void pattern25(int n) {  

					for(int i=1; i<=n; i++)
					{
						for(int s=i;s<=n;s++) {
							System.out.print(" ");
						}
						for(int j=1;j<=n;j++)
						{
							if(i==1||i==n||j==1||j==n)
						{
							System.out.print("*");
						}
						else
							{
							System.out.print(" ");
							}
							
							}System.out.println();
					}
				}
				//pattern 26 - right decrementing triangle and printing i
				public static void pattern26(int n) {  

					for(int i=1; i<=n; i++)
					{
						for(int j=i;j<=n;j++)
						{
							System.out.print(i);
						}
						System.out.println();
					}
				}
				// Pattern 27 
				public static void pattern27(int n) {
					for(int i=0,p=1;i<n;i++) {
						for(int j=i;j<n;j++,p++)
						{
						System.out.print(p+" ");	
						}
						System.out.println();
//						for(int i1=0,p1=20;i1<n;i1++) {
//						for(int j=i;j<n;j++,p1--)
//						{
//						System.out.print(p1+" ");	
//						}
//						}
//						System.out.println();
					}
				}
				//Pattern 31 
				public static void pattern31(int n) {
					for(int i=0;i<=n;i++)
					{
						
						for(int j=0;j<n;j++)
						{
							int w = n-Math.min(Math.min(i, j), Math.min(n-i, n-j));
						System.out.print(w+" ");	
						}
						System.out.println();
}
				}
}


