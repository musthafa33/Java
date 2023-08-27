package polygon;
import java.util.Scanner;
public class polygon {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int side=scan.nextInt();
		identifypolygon(side);
	}
	public static void identifypolygon(int side)
	{
		switch(side)
		{
		case 3:
			System.out.println("triangle");
			break;

		case 4:
			System.out.println("Quadrilateral");
			break;
		case 5:
			System.out.println("Pentagon");
			break;
		case 6:
			System.out.println("Hexagon");
			break;
		default:
			System.out.println("Polyogon");

		}
	}

}
