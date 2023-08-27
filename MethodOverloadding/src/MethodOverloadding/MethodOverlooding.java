package MethodOverloadding;
import java.util.Scanner;
public class MethodOverlooding {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int num1=scan.nextInt();
		System.out.println("Enter your first number :"+num1);
		int num2=scan.nextInt();
		System.out.println("Enter your Second number :"+num2);
		//System.out.println("+........ADDITION");		
		//System.out.println("-........SUBRATRACTION");
		//System.out.println("*........MUTIPLICATION");
		//System.out.println("/........DIVISION");
		char choice =scan.next().charAt(0);
		System.out.println("Enter your Option(+,-,*,/,%): "+choice);
		MethodOverlooding m1=new MethodOverlooding();
		m1.Calculator( num1, num2);
		m1.Calculator(num2, num1);
		m1.Calculator(num1, num2);
		m1.Calculator(num1, num2);
		m1.Calculator(num1, num2);
		
		switch(choice)
		{
		case '+':
			System.out.println(num1+num2);
		break;
		
		case '-':
		    System.out.println(num2-num1);
		    break;
		case  '*':
			System.out.println(num1*num2);
			break;
		case '/':
			System.out.println(num1/num2);
			break;
		case '%':
			System.out.println(num1%num2);
			break;	
		}
	 
	}
	 public int Calculator(int num1,int num2)
		{
			return num1+num2;
		}
	 public double Calculator(double num2,double num1)
		{
			return num2-num1;
		}
	 public double Calculator(double num1,int num2)
	 {
		 return num1*num2;
	 }
	 public double Calculator(int num1,double num2)
	 {
		 return num1/num2;
	 }
	 public float Calculator(float num1,float num2)
	 {
		 return num1%num2;
	 }
}
