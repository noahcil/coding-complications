//Solution to problem #467A: George and Accommodation on the Code Forces problem set

package difficulty800;

import java.util.Scanner;

public class Problem467A {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int numRooms = input.nextInt();
		int openRooms = 0;
		
		for (int i = 0; i < numRooms; i++) {
			if (input.nextInt() + 2 <= input.nextInt())
				openRooms++;
		}
		System.out.print(openRooms);
	}
}