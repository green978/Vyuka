import java.util.Scanner;

public class Papou�ek 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in, "Windows-1250");
		System.out.println("Zadej �et�zec: ");
		String vstup;
		vstup = sc.nextLine();
		String vystup;
		vystup = vstup + ", " + vstup;
		System.out.println(vystup);	
		
	}
	

}
