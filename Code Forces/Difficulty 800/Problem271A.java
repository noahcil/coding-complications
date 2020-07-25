//Solution to problem #271A: Beautiful Year on the Code Forces problem set

package difficulty800;

import java.util.Scanner;

public class Problem271A {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		//adding 1 to input year in order to check it immediately
		int year = input.nextInt() + 1;

		boolean distinctYear = false;
		while (distinctYear == false) {
			//turning year into string in order to make int[] of the length of the year, assigning each digit to a spot in the array
			String yearString = Integer.toString(year);
			int[] digits = new int[yearString.length()];
			for (int i = 0; i < digits.length; i++)
				digits[i] = Integer.parseInt(yearString.substring(i, i+1));

			boolean broken = false;
			//loop checks if digits[i] is equal to all the uncompared digits (i+1 to digits.length-1)
			for (int i = 0; i < digits.length; i++) {
				for (int j = i+1; j < digits.length; j++) {
					if (digits[i] == digits[j]) {
						//sets year to the next one because current one is not beautiful, breaks out of loops
						year++;
						broken = true;
						break;
					}
				}
				//check is inclued in order to break out of both loops
				if (broken)
					break;
			}
			if (broken == false)
				distinctYear = true;
		}
		System.out.print(year);
	}
}
