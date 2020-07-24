//Solution to problem #110A: Nearly Lucky Number on the Code Forces problem set

package difficulty800;

import java.util.Scanner;
import java.util.ArrayList;

public class Problem110A {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		String number = input.nextLine();
		ArrayList<Integer> digits = new ArrayList<Integer>();
		for (int i = 0; i < number.length(); i++)
			digits.add(Integer.parseInt(number.substring(i, i+1)));
		int count = 0;

		for (int i = 0; i < digits.size(); i++) {
			if (digits.get(i) == 4 || digits.get(i) == 7)
				count++;
		}

		//only lucky numbers that need to be checked for are 4 and 7
		if (count == 4 || count == 7)
			System.out.print("YES");
		else
			System.out.print("NO");
	}
}
