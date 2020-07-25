//Solution to problem #136A: Presents on the Code Forces problem set

package difficulty800;

import java.util.Scanner;

public class Problem136A {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		//the prompt for this problem is really confusing but basically the input is giving you which friend a person gave a gift to,
		//and the output is supposed to be which friend a person received a gift from
		//for example, in the test input 2 3 4 1, it's saying person 1 gave a gift to 2, person 2 gave a gift to 3, and so on 
		int numFriends = input.nextInt();
		int[] friends = new int[numFriends];
		for (int i = 0; i < numFriends; i++) {
			friends[input.nextInt()-1] = i+1;
		}

		for (int i : friends)
			System.out.print(i + " ");
	}
}
