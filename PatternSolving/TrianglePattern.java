package PatternSolving;

public class TrianglePattern {

	public static void main(String[] args) {
		pattern6(5);
	}
	//Pattern1 - pyramide
	public static void pattern1(int n) 
	{
		for(int i=1;i<=n;i++) 
		{
			for(int s=i;s<n;s++) 
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) 
			{
				System.out.print(" *");              
			}
			System.out.println();
		}
	}
	//Pattern2 - Right triangle
		public static void pattern2(int n) 
		{
			for(int i=1;i<=n;i++) 
			{
				for(int j=1;j<=i;j++) 
				{
					System.out.print("*");              
				}
				System.out.println();
			}
		}
		//Pattern3 - Left triangle
				public static void pattern3(int n) 
				{
					for(int i=1;i<=n;i++) 
					{
						for(int s=i;s<=n;s++) {
							System.out.print(" ");
						}
						for(int j=1;j<=i;j++) 
						{
							System.out.print("*");              
						}
						System.out.println();
					}
				}
				//Pattern4 - Right Downward triangle
				public static void pattern4(int n) 
				{
					for(int i=1;i<=n;i++) 
					{
						for(int j=i;j<=n;j++) 
						{
							System.out.print("*");              
						}
						System.out.println();
					}
				}
				//Pattern5 - Left Downward triangle
				public static void pattern5(int n) 
				{
					for(int i=0;i<n;i++) 
					{ for(int s=1;s<=i;s++) {
						System.out.print(" ");
					}
						for(int j=i;j<n;j++) 
						{
							System.out.print("*");              
						}
						System.out.println();
					}
				}
				//Pattern6 - Double Hill
				public static void pattern6(int n) 
				{
					for(int i=1;i<=n;i++) 
					{ 
//						int a=1;
//						while(a<=2) 
//						{
						for(int s=i;s<n;s++)
						{
						System.out.print(" ");
					    }
						for(int j=1;j<=i;j++) 
						{
							System.out.print("* ");              
						
						}
						for(int s=i;s<n;s++)
						{
						System.out.print("  ");
					    }
						for(int j=1;j<=i;j++) 
						{
							System.out.print("* ");              
						
						}
//						a=a+1;
//						}
						System.out.println();
					}
				}
				//Pattern7 - Reverse Pyramide
				public static void pattern7(int n) 
				{
					for(int i=0;i<n;i++) 
					{ for(int s=1;s<=i;s++) {
						System.out.print(" ");
					}
						for(int j=i;j<n;j++) 
						{
							System.out.print("* ");              
						}
						System.out.println();
					}
				}
				//Pattern8 - Butterfly pattern
				public static void pattern8(int n) 
				{
					for(int i=1;i<=2*n;i++) 
					{ int k=i>n?2*n-i:i;
						for(int j=1;j<=k;j++) 
					{
						System.out.print("*");              
					}
						for(int s=k;s<n;s++) 
					{
						System.out.print("  ");
					}
						for(int j=1;j<=k;j++) 
						{
							System.out.print("*");              
						}
						System.out.println();
					}
				}
				// pattern 9 - Diamond
				public static void pattern9(int n)
				{
					for(int i=1;i<n;i++) 
					{
					for(int s=i;s<=n;s++)
					{
						System.out.print(" ");
					}
					for(int j=1;j<i;j++)
					{
						System.out.print("*");
					}
					for(int k=1;k<=i;k++)
					{
						System.out.print("*");
					}
					System.out.println();
					}
					for(int i=1;i<=n;i++) {
					for(int s1=1;s1<=i;s1++)
					{
						System.out.print(" ");
					}
					for(int j1=i;j1<n;j1++)
					{
						System.out.print("*");
					}
					for(int k1=i; k1<=n;k1++) {
						System.out.print("*");
					}
					System.out.println();
					}
				}
				
				// pattern 10 - Sandglass
				public static void pattern10(int n)
				{
					for(int i=0;i<n;i++) 
					{
						for(int s=1;s<=i;s++) {
							System.out.print(" ");
						}
						for(int j=i;j<=n;j++)
						{
							System.out.print("* ");
						}
						System.out.println();
					}
					for(int i=1;i<=n;i++) {
						for(int s=i;s<=n;s++) {
							System.out.print(" ");
						}
						for(int j=1;j<i;j++)
						{
							System.out.print("* ");
						}
						System.out.println();
					
					}
				}
				
				//pattern 11 - Left pascal's triangle
				public static void pattern11(int n) {
					for(int i=1;i<=n;i++) 
					{
					for(int j=1;j<=i;j++)
					{
						System.out.print("* ");
					}
					System.out.println();
					}
					for(int i=1;i<=n;i++) 
					{
					for(int j=i;j<n;j++)
					{
						System.out.print("* ");
					}
					System.out.println();
					}
					
				}
				
				// Pattern 12 - Right pascal's triangle
				public static void pattern12(int n)
				{
					for(int i=1;i<=n-1;i++)
					{
					for(int s=i;s<=n;s++) 
					{
						System.out.print(" ");
					}
					for(int j=1;j<i;j++)
					{
						System.out.print("*");
					}
					System.out.println();
					}
					for(int i=1;i<=n-1;i++)
					{
						for(int s1=1;s1<=i;s1++) {
							System.out.print(" ");
						}
						for(int j1=i;j1<n;j1++)
						{
							System.out.print("*");
						}
						System.out.println();
					}
				}
				
				//own logic
				public static void pattern13(int n) {
				
					for(int i=1;i<n;i++) {
						for(int s=i;s<=n;s++)
						{
							System.out.print(" ");
						}
						int k = i==3 ? 0 :i;
						for(int j =1;j<k;j++) {
							System.out.print("* ");
						}
						System.out.println();
					}
					for(int i=1;i<=n;i++) 
					{ for(int s=1;s<=i;s++) {
						System.out.print(" ");
					}
					int k = i==2 ? 6 :i;
						for(int j=k;j<n;j++) 
						{
							System.out.print("* ");              
						}
						System.out.println();
					}
				}
				//Own logic
				public static void pattern15(int n) {
					
					for(int i='A',p='A';i<=n;i++,p++) {
						for(int j=1;j<=i;j++)
						{
							System.out.print((char)i);
						}
						System.out.println();
					}
					}

				
}
