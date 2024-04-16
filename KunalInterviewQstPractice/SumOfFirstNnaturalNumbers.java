package KunalInterviewQstPractice;
// How to find SUM of n natural numbers.

public class SumOfFirstNnaturalNumbers {

	public static void main(String[] args) {
		int n = 5;
		System.out.println(sumOfNaturalNumbers1(n));
	}
	// 1.using logic
	static int sumOfNaturalNumbers(int n) {
		int sum = 0;
		for(int i = 0; i<=n; i++) {
			sum = sum+i;
		}
		return sum;
	}
	// 2. using formula
	static int sumOfNaturalNumbers1(int n) {
		int sum = 0;
		for(int i = 0; i<=n; i++) {
			sum = (n*(n+1))/2;
		}
		return sum;
	}
	
	
}