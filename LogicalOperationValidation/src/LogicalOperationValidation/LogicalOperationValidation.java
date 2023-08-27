package LogicalOperationValidation;
import java.util.Scanner;
public class LogicalOperationValidation {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
                System.out.println("IS Input valid(true/false): "+a);
		boolean a=scan.nextBoolean();
		System.out.print("Does input meet a certain condition (true/false): "+b);
		boolean b=scan.nextBoolean();
		
		boolean b1=IsvalidInput(a, b);
	
	}
	public static boolean IsvalidInput(boolean a,boolean b)
	{
		if(a==b)
		{
		  System.out.println("Input Is valid");
		  return (a||b);
		}
		else 
		{
			System.out.println("Input Is not valid");
		}
		return (a&&b);
	}
}
