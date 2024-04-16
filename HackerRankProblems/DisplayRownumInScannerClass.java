package HackerRankProblems;

import java.util.Scanner;

public class DisplayRownumInScannerClass {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int i=1;
while(sc.hasNextLine())
{
	System.out.println(i+" " +sc.nextLine());
	i+=1; //i++;
}
sc.close();
	}

}
