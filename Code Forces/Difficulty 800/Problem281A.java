//Solution to problem #281A: Word Capitalization on the Code Forces problem set

package difficulty800;

import java.util.Scanner;

public class Problem281A {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		String word = input.next();
		//quicker than checking if the first char is capitalized or not first
		String temp = word.substring(0, 1).toUpperCase();
		word = temp + word.substring(1, word.length());
		System.out.print(word);
	}
}
