//Solution to problem #50A: Domino Piling on the Code Forces problem set

package difficulty800;

import java.util.Scanner;

public class Problem50A {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int m = input.nextInt();
		int n = input.nextInt();

		//if either is even then the board can be fully covered by an amount of dominos equal to (m*n) / 2
		if (m % 2 == 0 || n % 2 == 0)
			System.out.print((m * n) /2);
		//if both are odd then 1 square of the board will be left uncovered
		else
			System.out.println(((m * n)-1) / 2);
	}
}
