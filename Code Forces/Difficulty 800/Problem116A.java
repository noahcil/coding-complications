//Solution to problem #116A: Tram on the Code Forces problem set

package difficulty800;

import java.util.Scanner;

public class Problem116A {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int stops = input.nextInt();
		//putting exiting and entering values in separate arrays with corresponding indices 
		int[] exiting = new int[stops];
		int[] entering = new int[stops];
		for (int i = 0; i < stops; i++) {
			exiting[i] = input.nextInt();
			entering[i] = input.nextInt();
		}

		int minCap = 0;
		int passengers = 0;
		for (int i = 0; i < stops; i++) {
			passengers -= exiting[i];
			passengers += entering[i];
			if (passengers > minCap)
				minCap = passengers;
		}
		System.out.print(minCap);
	}
}
