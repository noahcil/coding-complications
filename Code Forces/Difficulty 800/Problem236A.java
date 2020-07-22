//Solution to problem #236A: Boy or Girl on the Code Forces problem set

package difficulty800;

import java.util.Scanner;
import java.util.ArrayList;

public class Problem236A {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		String username = input.next();
		//This ArrayList is made to check if a letter in the username is repeated
		ArrayList<String> letters = new ArrayList<String>();
		int repeatedChars = 0;

		for (int i = 0; i < username.length(); i++) {
			int temp = repeatedChars;
			String currentLetter = username.substring(i, i+1);
			for (int j = 0; j < letters.size(); j++) {
				if (currentLetter.equals(letters.get(j))) {
					repeatedChars++;
					break;
				}
			}
			//Adds current letter to ArrayList if it isn't repeated
			if (repeatedChars == temp)
				letters.add(currentLetter);
		}

		int distinctChars = username.length() - repeatedChars;
		if (distinctChars % 2 == 0)
			System.out.print("CHAT WITH HER!");
		else
			System.out.print("IGNORE HIM!");
	}
}
