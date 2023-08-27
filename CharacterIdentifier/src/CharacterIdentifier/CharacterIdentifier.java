package CharacterIdentifier;
import java.util.Scanner;
public class CharacterIdentifier {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		char ch=scan.next().charAt(0);
		identiflyCharacter(ch);

	}

	public static void identiflyCharacter(char ch)
	{
		if((Character.isLowerCase(ch))&&(ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u'))
		{
			System.out.println("Lower-Case Vowels");
		}	
		else if  (Character.isLowerCase(ch))
		{
			System.out.println("Lower-Case Consonants");
		}
		else if((Character.isUpperCase(ch))&&(ch=='A' || ch=='E'||ch=='I'||ch=='O'||ch=='U'))
		{
			System.out.println("Upper-Case vowel");
		}
		else if(Character.isUpperCase(ch))
		{
			System.out.println("Upper-Case consonant");
		}
		else if(Character.isDigit(ch))
		{
			System.out.println("Digits number");
		}
		else 
		{
			System.out.println("Special Character");

		}
	}
}

