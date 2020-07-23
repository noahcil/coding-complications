//Solution to problem #266B: Queue at the School on the Code Forces problem set

package difficulty800;

import java.util.Scanner;

public class Problem266B {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int numStudents = input.nextInt();
		int seconds = input.nextInt();
		String line = input.next();

		String[] canteenLine = new String[numStudents];
		for (int i = 0; i < numStudents; i++)
			canteenLine[i] = line.substring(i, i+1);

		for (int i = 0; i < seconds; i++) {
			//for every second, loops through canteenLine starting from the back to front
			for (int j = numStudents-1; j >= 0; j--) {
				//j must be less than the last index in canteenLine for B to be swapped, so that boys at the end of the line don't move
				if (canteenLine[j].equals("B") && j < numStudents-1) {
					String temp = canteenLine[j];
					canteenLine[j] = canteenLine[j+1];
					canteenLine[j+1] = temp;
					j--;
				}
			}
		}

		for (String i : canteenLine)
			System.out.print(i);
	}
}
