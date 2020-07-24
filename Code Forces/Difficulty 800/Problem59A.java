//Solution to problem #59A: Word on the Code Forces problem set

package difficulty800;

import java.util.Scanner;

public class Problem59A {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		String word = input.nextLine();
		int capCount = 0;
		
		for (int i = 0; i < word.length(); i++) {
			if (Character.isUpperCase(word.charAt(i)))
				capCount++;
		}
		
		if (capCount > word.length()/2)
			System.out.print(word.toUpperCase());
		else
			System.out.print(word.toLowerCase());
	}
}
