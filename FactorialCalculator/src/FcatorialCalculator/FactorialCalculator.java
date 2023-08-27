package FcatorialCalculator;
import java.util.Scanner;
public class FactorialCalculator {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		FactorialCal(n);
	}
	public static void FactorialCal(int n)
	{
		int factorial=1;
		for(int i=1; i<=n; i++)
		{
			factorial=factorial*i;
		}
		System.out.println(factorial);
	}
}
