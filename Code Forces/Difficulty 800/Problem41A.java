//Solution to problem #41A: Translation on the Code Forces problem set

package difficulty800;

import java.util.Scanner;

public class Problem41A {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		//make a stringbuilder for the first word in order to reverse it to check the second word
		StringBuilder berlandishWord = new StringBuilder();
		berlandishWord.append(input.nextLine());
		String birlandishWord = input.nextLine();

		berlandishWord.reverse();
		if (berlandishWord.toString().equals(birlandishWord))
			System.out.print("YES");
		else
			System.out.print("NO");
	}
}
