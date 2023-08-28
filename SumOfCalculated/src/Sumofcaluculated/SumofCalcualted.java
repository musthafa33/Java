package Sumofcaluculated;
import java.util.Scanner;
public class SumofCalcualted {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n= scan.nextInt();
		Findsumofdigits(n);
		
	}
	public static void Findsumofdigits(int n)
	{
		int sum=0;
		while(n>0)
		{
			int a=n%10;
			sum+=a;
			n=n/10;
			
		}
		System.out.println(sum);
	}

}

