package TemperatureConversion;
import java.util.Scanner;
public class TempertureConversion {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Welcome to the Temperature conversion Tool!");
		System.out.println();
		System.out.println("Select an option:");
		System.out.println();
		System.out.println("1.Convert Celsius to Fahrenheit\n2.Convert Fahrenheit to Celsius");
		int num=scan.nextInt();


		switch(num) 
		{
		case 1:
			System.out.println("Enter the temperature in Celsius: ");
			double celsius=scan.nextDouble();
			System.out.println(celsius+" C  is equivalent to "+celsiusToFahrenheit(celsius)+" F");
			break;
		case 2:
			System.out.println("Enter the temperature in Fahrenheit:"); 
			double fahrenheit=scan.nextDouble();
			System.out.println(fahrenheit+" F is equivalent to "+fahrenheitToCelsius(fahrenheit)+" C");
			break;
		default: System.out.println("Please Enter 1 or 2 only");      
		}
	}
	public static double celsiusToFahrenheit(double celsius)
	{  

		return(celsius*9/5)+32;
	} 

	public static double fahrenheitToCelsius(double fahrenheit)
	{ 

		return(fahrenheit- 32)*5/9;

	}
}
