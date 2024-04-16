package PatternSolving;

public class DummyPattern {

	public static void main(String[] args) {
		pattern18(10);
	}

	public static void pattern18(int n) {  

		for(int i = 1; i<=n; i++)
		{
			for(int j=1;j<=n; j++)
			{
				System.out.print("*");
			} 
			System.out.println();
		}
		}
}
