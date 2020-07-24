//Solution to problem #133A: HQ9+ on the Code Forces problem set

package difficulty900;

import java.util.Scanner;

public class Problem133A {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		String program = input.nextLine();

		for (int i = 0; i < program.length(); i++) {
			//not checking for the + command because it does not produce any output
			if (program.substring(i, i+1).matches("H|Q|9")) {
				System.out.print("YES");
				return;
			}
		}
		System.out.print("NO");
	}
}
