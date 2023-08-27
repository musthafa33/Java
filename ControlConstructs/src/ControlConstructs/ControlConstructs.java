package ControlConstructs;
import java.util.Scanner;
public class ControlConstructs {
public static void checkDiscount(double PurchaseAmount)
	{
		if(PurchaseAmount>=100)
		{
		System.out.println("DiscountApplicable");
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double PurchaseAmount=scan.nextDouble();
		checkDiscount(PurchaseAmount);
	
	}
}
