package HackerRankProblems;

import java.util.Scanner;

public class AreaOfParallelogram {
	static int B;
	static int H;
	static boolean flag;
	static 
		{
		Scanner sc = new Scanner(System.in);
		B = sc.nextInt();
		H = sc.nextInt();
		if(B<=0||H<=0) 
		{
			System.out.println("java.lang.Exception: Breadth and height must be positive");
			flag = false;
		}
		else 
		{
			
			flag = true;
		}
		sc.close();
	}

	public static void main(String[] args) 
	{
		if(flag==true) 
		{
			int x = B*H;
			System.out.println(x);
		}
					}
}