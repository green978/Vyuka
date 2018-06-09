import java.util.Scanner;

public class Papoušek 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in, "Windows-1250");
		System.out.println("Zadej øetìzec: ");
		String vstup;
		vstup = sc.nextLine();
		String vystup;
		vystup = vstup + ", " + vstup;
		System.out.println(vystup);	
		
	}
	

}
