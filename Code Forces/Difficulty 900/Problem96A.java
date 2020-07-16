//Solution to problem #96A: Football on the Code Forces problem set

package difficulty900;

import java.util.Scanner;

public class Problem96A {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		String players = input.next();
		char last = players.charAt(0);
		int count = 1;

		//checks if current char equals the previous char in order to adjust count
		for (int i = 1; i < players.length(); i++) {
			if (players.charAt(i) == last)
				count++;
			else {
				last = players.charAt(i);
				count = 1;
			}

			if (count == 7) {
				System.out.print("YES");
				return;
			}
		}
		System.out.print("NO");
	}
}
