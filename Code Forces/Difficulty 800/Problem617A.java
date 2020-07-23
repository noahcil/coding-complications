//Solution to problem #617A: Elephant on the Code Forces problem set

package difficulty800;

import java.util.Scanner;

public class Problem617A {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int friendsHouse = input.nextInt();
		int moves = 0;

		//value of highest move elephant can currently do according to distance traveled
		int maxMove = 5;
		for (int i = friendsHouse; i > 0;) {
			if (i - maxMove >= 0) {
				i -= maxMove;
				moves++;
			}
			else {
				//decreases maxMove until it can be subtracted from distance (i) without resulting in a negative number
				while (i - maxMove < 0)
					maxMove--;
			}

			if (i == 0) {
				System.out.print(moves);
				return;
			}
		}
	}
}
