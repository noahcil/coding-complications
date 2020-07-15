//Solution to problem #282A: Bit++ on the Code Forces problem set

package difficulty800;

import java.util.Scanner;

public class Problem282A {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int x = 0;
		int n = input.nextInt();

		//loop iterates according to amount of operations
		for (int i = 0; i < n; i++) {
			String operation = input.next();
			//checks if operation is ++ or not
			if (operation.equals("X++") || operation.equals("++X"))
				x++;
			else
				x--;
		}

		System.out.print(x);
	}
}
