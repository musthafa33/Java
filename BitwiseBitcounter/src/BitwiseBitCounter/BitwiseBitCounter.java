package BitwiseBitCounter;
import java.util.Scanner;
public class BitwiseBitCounter {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int a =scan.nextInt();
		BitwiseBitCounter BBC=new BitwiseBitCounter();
		System.out.println("NUMBER of Set: "+BBC.CountersetBits(a));
	}
	public int CountersetBits(int a)
	{
		int c=0; 
		String	b=Integer.toBinaryString(a);
		char[] ch=b.toCharArray();
		for(int i=0;i<=ch.length-1;i++)
		{
			if(ch[i]=='1')
			{
				c=c+1;
			}
		}

		return c;
	}

}
