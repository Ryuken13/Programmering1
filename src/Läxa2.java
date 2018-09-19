import java.util.Scanner;

public class Läxa2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Skriv in 10 siffor");

		// scan in tal1
		int tal1 = input.nextInt();
		int min = tal1;
		int max = tal1;

		// scan in tal2
		int tal2 = input.nextInt();
		if (tal2 > max) {
			max = tal2;
		}
		// scan in tal3
		int tal3 = input.nextInt();
		if (tal3 > max) {
			max = tal3;
		}
		// scan in tal4
		int tal4 = input.nextInt();
		if (tal4 > max) {
			max = tal4;
		}
		// scan in tal5
		int tal5 = input.nextInt();
		if (tal5 > max) {
			max = tal5;
		}
		// scan in tal6
		int tal6 = input.nextInt();
		if (tal6 > max) {
			max = tal6;
		}
		// scan in tal7
		int tal7 = input.nextInt();
		if (tal7 > max) {
			max = tal7;
		}
		// scan in tal8
		int tal8 = input.nextInt();
		if (tal8 > max) {
			max = tal8;
		}
		// scan in tal9
		int tal9 = input.nextInt();
		if (tal9 > max) {
			max = tal9;
		}
		// scan in tal10
		int tal10 = input.nextInt();
		if (tal10 > max) {
			max = tal10;

			System.out.println("Minsta talet" + min);
			System.out.println("Minsta talet" + max);

			int summa = (tal1 + tal2 + tal3 + tal4 + tal5 + tal6 + tal7 + tal8 + tal9 + tal10) / 10;
			System.out.println("Medelvärdet" + summa);
		}

	}

}
