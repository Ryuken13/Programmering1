import java.util.Scanner;

public class UppgiftONSDAG {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Vad heter du?");
		String name = input.nextLine();

		System.out.println("age?");
		String age = input.nextLine();
		
		System.out.println("Adress?");
		String adress = input.nextLine();
	
		System.out.println("Postnummer?");
		String Postnummer = input.nextLine();

		System.out.println("Ort?");
		String ort = input.nextLine();

		System.out.println("Telefonnummer?");
		String telefonnummer = input.nextLine();
		
		System.out.println("Namn:"+" "+name);
		System.out.println("�lder:"+" "+age);
		System.out.println("Adress:"+" "+adress);
		System.out.println("\t"+Postnummer+" "+ort);
		System.out.println("Telefonnummer:"+" "+telefonnummer);
		

	}

}
