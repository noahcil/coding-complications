//Solution to problem #112A: Petya and Strings on the Code Forces problem set

package difficulty800;

import java.util.Scanner;

public class Problem112A {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		String string1 = input.next();
		String string2 = input.next();

		//if first string is less than second string, compareTo will return negative int
		if (string1.compareToIgnoreCase(string2) < 0)
			System.out.print("-1");
		else if (string1.compareToIgnoreCase(string2) > 0)
			System.out.print("1");
		else
			System.out.print("0");
	}
}
