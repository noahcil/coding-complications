//Solution to problem #1A: Theatre Square on the Code Forces problem set

package difficulty1000;

import java.util.Scanner;

public class Problem1A {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		//code will fail test 9 if variables are not longs
		long n = input.nextInt();
		long m = input.nextInt();
		long a = input.nextInt();

		//number of flagstones that fit in a row
		long numInRow = m / a;
		//number of rows
		long numRows = n / a;

		//adds one more flagstone if remainder
		if (m % a != 0)
			numInRow++;
		if (n % a != 0)
			numRows++;

		System.out.print(numInRow * numRows);
	}
}
