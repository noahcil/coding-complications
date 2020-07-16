//Solution to problem #263A: Beautiful Matrix on the Code Forces problem set

package difficulty800;

import java.util.Scanner;

public class Problem263A {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] matrix = new int[5][5];
		int row = 0, column = 0;
		int moves = 0;


		//stores the inputted matrix into the 2D array and finds the coordinates of the 1
		for (int currentRow = 0; currentRow < 5; currentRow++) {
			for (int currentColumn = 0; currentColumn < 5; currentColumn++) {
				int temp = input.nextInt();
				matrix[currentRow][currentColumn] = temp;
				if (temp == 1) {
					row = currentRow;
					column = currentColumn;
				}
			}
		}

		//(2,2) is the center of the 5x5 matrix, goal is to get the 1 to the row 2 and column 2
		if (row > 2)
			moves += row - 2;
		else
			moves += 2 - row;

		if (column > 2)
			moves += column - 2;
		else
			moves += 2 - column;

		System.out.print(moves);
	}
}
