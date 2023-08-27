package TaxCalculator;
import java.util.Scanner;
public class TaxCalculator {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int Purchaseamount=scan.nextInt();
	System.out.println("Enter the purchase amount: "+Purchaseamount);
	double taxrate=scan.nextDouble();
	System.out.println("Enter the tax Rate: "+taxrate);
	TaxCalculator t1=new TaxCalculator();
	System.out.println("Total Cost Including Tax: "+t1.CalculatorTotalwithTax(Purchaseamount ,taxrate));
	}
	public double CalculatorTotalwithTax(double Purchaseamount,double taxrate)
	{
		return Purchaseamount*taxrate+(Purchaseamount);
	}
}