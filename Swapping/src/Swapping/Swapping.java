package Swapping;
import java.util.Scanner;
/*public class Swapping {
	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.print("Enter your First Integer: ");
 int a=scan.nextInt();
 System.out.print("Enter your Second Intege: ");
 int b=scan.nextInt();
 int c=a;
 a=b;
 b=c;
 System.out.print("After Swapping: First="+a+" " +","+"Second="+b);
	}
}*/
class Swapping{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the First name1:");
		String name1=scan.nextLine();
		System.out.print("Enter the Second name2:");
		String name2=scan.nextLine();
		System.out.print("Enter the Thrid name3");
		String name3=scan.nextLine();
		String name4=name1;
		name2=name2;
		name1=name3;
		name3=name4;
		System.out.println(name1+" "+name2+" "+name3);
		
	
	}
}
