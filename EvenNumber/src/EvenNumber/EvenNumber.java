package EvenNumber;
import java.util.Scanner;
public class EvenNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n =scan.nextInt();
		PrintEvennumber(n);

		
	}
	public static void PrintEvennumber(int n)
	{
		
			for(int i=1; i<=n; i++)
			{
				if(i%2==0)
				System.out.println(i);
			}
					

	}

}
