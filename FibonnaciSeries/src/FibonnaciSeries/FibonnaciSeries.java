package FibonnaciSeries;
import java.util.Scanner;
public class FibonnaciSeries {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		PrintFibonnaciSeries(n);
	}
	public static void PrintFibonnaciSeries(int n)
	{ 
		int num1=0;
		int num2=1;
		if(n==0)
		{
		System.out.println(num1);	
		}
		else if(n==1)
		{
			System.out.println(num1+" "+num2);
		}
		else
		{
			System.out.println(num1);
			System.out.println(num2);
			for (int i=3;i<n;i++)
			{
			 int temp=num1+num2;
			 System.out.println(temp);
			 num1=num2;
			 num2=temp;
			}
		}
	}

}
