//Solution to problem #71A: Way Too Long Words on the Code Forces problem set

package difficulty800;

import java.util.Scanner;

public class Problem71A {

	static Scanner input = new Scanner(System.in);

        //my method for abbreviating words
	static String abbreviate(String word) {
		int numLetters = word.length() - 2;
		String temp = word;
		word = word.substring(0, 1);
		word += numLetters;
		word += temp.substring(temp.length()-1);
		return word;
	}

	public static void main(String[] args) {
		int n = input.nextInt();
		String[] words = new String[n];

                //puts words in array of Strings and abbreviates them if longer than 10 characters
		for (int i = 0; i < n; i++) {
			words[i] = input.next();
			if (words[i].length() > 10)
				words[i] = abbreviate(words[i]);
		}

		for (String word : words) {
			System.out.println(word);
		}
	}
}
