package CheckMutilpleofnumber;

import java.util.Scanner;

public class checkMutilpleofTen {
	
		public static void checkMutlipleofnumber(int n)
		{
			if(n%10==0)
			{
				System.out.println("The number is mutilple of 10");
			}
		}
		public static void main(String[]args)
		{
			Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();
			checkMutlipleofnumber(n);
		}
		
	
}
