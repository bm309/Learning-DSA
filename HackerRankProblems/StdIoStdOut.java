package HackerRankProblems;

import java.util.Scanner;

public class StdIoStdOut {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter here");
		for(int i=0;i<3;i++) {
			
		
		String s1 = sc.next();
		int x = sc.nextInt();
		//System.out.println(s1);
		if(s1.length()<15) {
			int a = 15-s1.length();
			System.out.print(s1);
			for(int j =0;j<a;j++) {
				System.out.print(" ");
			}
			if(x<10) {
				System.out.println("00"+x);
			}
			else if(x<100) 
			{
				System.out.println("0"+x);
			}
			else {
				System.out.println(x);
			}
				
		}
		
	}
}
}