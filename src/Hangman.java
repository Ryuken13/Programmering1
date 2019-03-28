import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {

	public static void guess(String word, int life) {

		char[] filler = new char[word.length()]; // skapa de tomma rutorna d�r bokst�verna ska vara
		int i = 0;
		while (i < word.length()) {
			filler[i] = '-';
			if (word.charAt(i) == ' ') {
				filler[i] = ' ';
			}
			i++;
		}
		System.out.print(filler); // skriva ut strecken och liven
		System.out.println("    Life Remaining=" + " " + life);

		Scanner sc = new Scanner(System.in); // f�r att l�sa tecken

		ArrayList<Character> l = new ArrayList<Character>(); //bevara de bokst�ver vi har redan skrivit

		while (life > 0) {
			char x = sc.next().charAt(0); // tecken input av anv�ndaren

			if (l.contains(x)) {
				System.out.println("Redan Gissat");
				continue; // while loopen forts�tter
			}

			l.add(x);

			if (word.contains(x + "")) { // den h�r loppen kommer att kolla alla index
				for (int y = 0; y < word.length(); y++) { // och sedan byta de tecken som st�r d�r mot '-'
					if (word.charAt(y) == x) {
						filler[y] = x;
					}
				}
			} else {
				life--; // dina liv minskar om du skriver en bokstav som inte st�r i ordet
			}

			if (word.equals(String.valueOf(filler))) { // kollar om charen filler �r lika med stringen word
				System.out.println(filler);
				System.out.println("Du vann!!!");
				break; // st�nger av programmet
			}

			System.out.print(filler); // skriva ut strecken och liven
			System.out.println("    Life Remaining=" + " " + life);
		}

		if (life == 0) {
			System.out.println("Game Over");
		}
	}

	public static void main(String[] args) {

		String word = "nitroglycerin"; // Gissnings ordet
		int life = 5; // antal liv eller chanser
		guess(word, life);

	}
}
