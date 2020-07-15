//Solution to problem #4A: Watermelon on the Code Forces problem set

package difficulty800;

import java.util.Scanner;

public class Problem4A {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int w = input.nextInt();
		//must check if greater than 2 because the resulting halves must be even numbers
		if (w > 2 && w % 2 == 0)
			System.out.print("YES");
		else
			System.out.print("NO");
	}
}
