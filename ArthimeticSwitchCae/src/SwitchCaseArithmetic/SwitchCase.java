package SwitchCaseArithmetic;
import java.util.Scanner;
/*public class SwitchCase {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	int num1=scan.nextInt();
	int num2=scan.nextInt();
	System.out.println("1---->Addition");
	System.out.println("2---->Subtraction");
	System.out.println("3---->Multipilcation");
	System.out.println("4----->Division");
	System.out.println("5------>Modules");
	int choice=scan.nextInt();
	
	switch (choice)
	{
	case 1:
		System.out.println(num1+num2);
			break;
	case 2:
		System.out.println(num1-num2);
			break;
	case 3:
		System.out.println(num1*num2);
	        break;
	case 4:
		System.out.println(num1/num2);
		    break;
	case 5:
		System.out.println(num1%num2);
	}
}
 }*/
public class SwitchCase
{
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println("1---->Addition");
		System.out.println("2---->Subtraction");
		System.out.println("3---->Multipilcation");
		System.out.println("4----->Division");
		System.out.println("5------>Modules");
		SwitchCase arithmetic=new SwitchCase();
		arithmetic.Arithmetic(num1,num2);
		
	}
	public void Arithmetic(int num1,int num2)
	{
		Scanner scan =new Scanner(System.in);
	    int choice=scan.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println(num1+num2+"ADDITION");
			break;
		
		case 2:
			System.out.println(num1-num2+"SUBRACTION");
			break;
		
		case 3:
			System.out.println(num1*num2+"MULTIPILCATION");
			break;
		case 4:
			System.out.println(num1/num2+"Division");
			break;
		case 5:
			System.out.println(num1%num2+"MODULES");
			break;
	    default :
	    	System.out.println("plz print upto five(5)numbers only");
	    	break;
			}
	}
}
/*public class SwitchCase
{
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println("1---->Addition");
		System.out.println("2---->Subtraction");
		System.out.println("3---->Multipilcation");
		System.out.println("4----->Division");
		System.out.println("5------>Modules");
		int choice =scan.nextInt();
		SwitchCase arithmetic=new SwitchCase();
		arithmetic.Arithmetic();
		
	}
	public void Arithmetic()
	{
		
		switch(choice)
		{
		case 1:
			System.out.println(num1+num2+"ADDITION");
			break;
		
		case 2:
			System.out.println(num1-num2+"SUBRACTION");
			break;
		
		case 3:
			System.out.println(num1*num2+"MULTIPILCATION");
			break;
		case 4:
			System.out.println(num1/num2+"Division");
			break;
		case 5:
			System.out.println(num1%num2+"MODULES");
			break;
		default	:
		    System.out.println("Plz print upto five(5)numbers only")
		    break;
			}
	}
}*/
