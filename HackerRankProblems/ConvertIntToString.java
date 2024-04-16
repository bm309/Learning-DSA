package HackerRankProblems;

import java.util.Scanner;

public class ConvertIntToString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n>=-100 && n<=100) 
		{
			String x = String.valueOf(n);
			System.out.println("Good job");
		}
		else
		{
			System.out.println("Wrong answer");
		}
		sc.close();
	}

}
