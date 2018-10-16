import java.util.Scanner;

import jdk.internal.dynalink.beans.StaticClass;

public class Läxav42 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		double radius = input.nextDouble();
		System.out.println(volume(radius));

	}

	public static double volume(double radius) {
		radius = (4 * 3.14 * radius * radius * radius) / 3;
		return radius;
	}

}
