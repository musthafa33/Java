package SumOfNaturalNumber;
import java.util.Scanner;
public class SumofNaturalNumber {
 public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	printsumofnaturalnumber(n);
}
 public static void printsumofnaturalnumber(int n)
 {
	 int sum=0;
	 for(int i=1; i<=n; i++)
	 {
		 sum+=i;
		
	 }
	 System.out.println(sum);
 }
}
