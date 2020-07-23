//Solution to problem #122A: Lucky Division on the Code Forces problem set

package difficulty1000;

import java.util.Scanner;

public class Problem122A {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int number = input.nextInt();
		//all numbers that consist of 4s and 7s that are below 1000 (range is 1-1000 for this problem)
		int[] luckyNumbers = {4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777};

		for (int i = 0; i < luckyNumbers.length; i++) {
			if (number % luckyNumbers[i] == 0) {
				System.out.print("YES");
				return;
			}
		}
		System.out.print("NO");
	}
}
