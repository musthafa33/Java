package VendingMachine;
import java.util.Scanner;
public class VendingMachine {
	public static void getProduce(String code)
	{
		switch(code)
		{
		case "p01":System.out.println("coco coal");
			break;
		case "p02":
			System.out.println("pesi");
			break;
		case "p03":
			System.out.println("fanta");
			break;

		case "p04":
			System.out.println("jajeera");
			break;

		case "p05":
			System.out.println("Mountai Dew");
			break;

		case "p06":
			System.out.println("BoatGuava");
			break;
		default:
			System.out.println("panaka");
			}
	}
	 public static void main(String[]args)
   {
	   Scanner scan=new Scanner(System.in);
	   String code=scan.next();
	   getProduce(code);
   }
}
