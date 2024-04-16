package HackerRankProblems;

public class TwoPowerFormula {
	public static void main(String[] args) {
		int a=5, b=3, n=5;
		double powTotal= 0;
		int total =0;
		for(int i=0;i<n;i++)
		{
			powTotal =0;
			for(int j=0;j<=i;j++)
			{
				powTotal=  powTotal+(Math.pow(2, j)*b);	
			}
			total = (int) (a+powTotal);
			
			System.out.print(total+" ");
		}
	}

}
